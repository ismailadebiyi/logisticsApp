package com.lsslogistics.deliveryapp.users.model;

import com.lsslogistics.deliveryapp.deliveryorders.model.DeliveryOrder;
import com.lsslogistics.deliveryapp.vehicle.model.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;


@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Staff extends Users {

    private String staffId;
    private String role;
    private StaffStatus status;
    @OneToMany
    private Set<Vehicle> vehicles;
    @OneToMany
    private List<DeliveryOrder> deliveryOrders;
}
