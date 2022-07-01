package com.lsslogistics.deliveryapp.deliveryorders.requests;

import com.lsslogistics.deliveryapp.deliveryorders.model.Receiver;
import com.lsslogistics.deliveryapp.deliveryorders.model.Sender;
import com.lsslogistics.deliveryapp.items.model.Items;

import java.math.BigInteger;
import java.util.List;

public record OrderCreationRequest(List<Items> items,
                                   Sender sender,
                                   Receiver receiver,
                                   BigInteger cost) {
}
