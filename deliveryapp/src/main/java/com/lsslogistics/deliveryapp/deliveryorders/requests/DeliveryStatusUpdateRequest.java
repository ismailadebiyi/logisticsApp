package com.lsslogistics.deliveryapp.deliveryorders.requests;

import com.lsslogistics.deliveryapp.deliveryorders.model.Status;

public record DeliveryStatusUpdateRequest(String trackingNo,
                                          Status status) {
}
