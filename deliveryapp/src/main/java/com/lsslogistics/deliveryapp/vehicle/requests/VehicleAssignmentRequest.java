package com.lsslogistics.deliveryapp.vehicle.requests;

import com.lsslogistics.deliveryapp.users.model.Staff;

public record VehicleAssignmentRequest(String registrationNo,
                                       Staff staff) {
}
