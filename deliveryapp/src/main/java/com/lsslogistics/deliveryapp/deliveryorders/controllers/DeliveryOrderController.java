package com.lsslogistics.deliveryapp.deliveryorders.controllers;


import com.lsslogistics.deliveryapp.deliveryorders.service.DeliveryOrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public record DeliveryOrderController(DeliveryOrderService deliveryOrderService) {

}
