package com.lsslogistics.deliveryapp.deliveryorders.service;

import com.lsslogistics.deliveryapp.deliveryorders.exceptions.OrderNotFoundException;
import com.lsslogistics.deliveryapp.deliveryorders.model.DeliveryOrder;
import com.lsslogistics.deliveryapp.deliveryorders.model.Status;
import com.lsslogistics.deliveryapp.deliveryorders.repo.DeliveryOrderRepo;
import com.lsslogistics.deliveryapp.deliveryorders.requests.DeliveryStatusUpdateRequest;
import com.lsslogistics.deliveryapp.deliveryorders.requests.OrderAssignRequest;
import com.lsslogistics.deliveryapp.deliveryorders.requests.OrderCreationRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implements the order delivery service create, read, update status, assign order to the delivery staff
 * information about orders, as well as gather related
 */
@Service
public record DeliveryOrderService(DeliveryOrderRepo deliveryOrderRepo) {

    public void createOrder(OrderCreationRequest creationRequest){

        DeliveryOrder order = DeliveryOrder.builder()
                .items(creationRequest.items())
                .receiver(creationRequest.receiver())
                .cost(creationRequest.cost())
                .status(Status.PROCESSING)
                .sender(creationRequest.sender())
                .trackingNo(getTrackingNo())
                .build();
        //TODO: check if the tracking No is Unique
        deliveryOrderRepo.save(order);

    }

    public List<DeliveryOrder> getAllOrders(){
        return deliveryOrderRepo.findAll();
    }

    public DeliveryOrder getOrderByTrackingNo( String trackingNo){
        return deliveryOrderRepo.findDeliveryOrderByTrackingNo(trackingNo)
                .orElseThrow(OrderNotFoundException::new);
    }

    public DeliveryOrder updateDeliveryStatus(DeliveryStatusUpdateRequest statusUpdateRequest){

        return deliveryOrderRepo.findDeliveryOrderByTrackingNo(statusUpdateRequest.trackingNo())
                .map( statusUpdate->{
                    statusUpdate.setStatus(statusUpdateRequest.status());
                    return deliveryOrderRepo.save(statusUpdate);
                }).orElseThrow(OrderNotFoundException::new);

    }

    public DeliveryOrder assignOrderForDelivery(OrderAssignRequest orderAssignRequest){
        return deliveryOrderRepo.findDeliveryOrderByTrackingNo(orderAssignRequest.trackingNo())
                .map( assign->{
                    assign.setStaff(orderAssignRequest.staff());
                    return deliveryOrderRepo.save(assign);
                }).orElseThrow(OrderNotFoundException::new);
    }
    private String getTrackingNo() {
        return "LSS-DO-WR-001-WR";
    }

}
