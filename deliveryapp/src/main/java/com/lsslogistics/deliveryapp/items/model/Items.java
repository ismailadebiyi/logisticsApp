package com.lsslogistics.deliveryapp.items.model;

import com.lsslogistics.deliveryapp.deliveryorders.model.DeliveryOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Items {

    @Id
    private Long id;
    private String name;
    private String description;
    private Integer quantity;
    private Double weight;
    @ManyToOne
    @JoinColumn(name = "orders_id")
    private DeliveryOrder orders;
}
