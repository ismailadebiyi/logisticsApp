package com.lsslogistics.deliveryapp.items.service;

import com.lsslogistics.deliveryapp.items.exception.ItemNotFoundException;
import com.lsslogistics.deliveryapp.items.model.Items;
import com.lsslogistics.deliveryapp.items.repo.ItemRepo;
import com.lsslogistics.deliveryapp.items.requests.ItemAddingRequest;
import org.springframework.stereotype.Service;

@Service
public record ItemService(ItemRepo itemRepo) {

    public void addItem(ItemAddingRequest request){
        Items items = Items.builder()
                .name(request.name())
                .description(request.description())
                .quantity(request.quantity())
                .weight(request.weight())
                .build();
        itemRepo.save(items);
    }

    public void removeItem(Long itemId){
        itemRepo.findById(itemId)
                .orElseThrow(ItemNotFoundException::new);
        itemRepo.deleteById(itemId);
    }

}
