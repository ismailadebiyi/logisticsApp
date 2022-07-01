package com.lsslogistics.deliveryapp.deliveryorders.requests;

import com.lsslogistics.deliveryapp.users.model.Staff;

public record OrderAssignRequest(String trackingNo,
                                 Staff staff) {
}
