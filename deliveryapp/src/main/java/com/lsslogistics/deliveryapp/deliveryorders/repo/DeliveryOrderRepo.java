package com.lsslogistics.deliveryapp.deliveryorders.repo;

import com.lsslogistics.deliveryapp.deliveryorders.model.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeliveryOrderRepo extends JpaRepository<DeliveryOrder, Long> {


    @Query("select d from DeliveryOrder d where d.trackingNo = ?1")
    Optional<DeliveryOrder> findDeliveryOrderByTrackingNo(String trackingNo);
}
