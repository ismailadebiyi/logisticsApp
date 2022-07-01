package com.lsslogistics.deliveryapp.vehicle.requests;

public record VehicleAddRequest(String type,
                                String registrationNo,
                                String manufacturer) {
}
