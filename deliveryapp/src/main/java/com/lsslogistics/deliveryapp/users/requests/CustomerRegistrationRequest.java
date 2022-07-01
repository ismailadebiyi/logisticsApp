package com.lsslogistics.deliveryapp.users.requests;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        Integer phoneNumber,
        String address,
        String type) {
}
