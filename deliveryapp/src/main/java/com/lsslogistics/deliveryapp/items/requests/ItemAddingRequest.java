package com.lsslogistics.deliveryapp.items.requests;

public record ItemAddingRequest(String name,
                                String description,
                                Integer quantity,
                                Double weight) {
}
