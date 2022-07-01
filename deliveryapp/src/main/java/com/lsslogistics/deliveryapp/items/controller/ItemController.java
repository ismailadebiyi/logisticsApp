package com.lsslogistics.deliveryapp.items.controller;


import com.lsslogistics.deliveryapp.items.requests.ItemAddingRequest;
import com.lsslogistics.deliveryapp.items.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/item")
@Slf4j
public record ItemController(ItemService itemService) {

    @PostMapping
    public void addItem(@RequestBody ItemAddingRequest itemaddingRequest){
        //TODO: Add Item/list of Items to Order
    }

    @PutMapping("/{itemId}")
    public void updateItemDetails(@PathVariable String itemId){
        //TODO: Update Item details
    }

    @PostMapping("/{itemId}")
    public void removeItem(@PathVariable String itemId){

    }


}
