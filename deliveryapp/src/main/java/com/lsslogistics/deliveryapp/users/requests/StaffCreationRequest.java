package com.lsslogistics.deliveryapp.users.requests;

public record StaffCreationRequest(String firstName,
                                   String lastName,
                                   String email,
                                   Integer phoneNumber,
                                   String address) {
}
