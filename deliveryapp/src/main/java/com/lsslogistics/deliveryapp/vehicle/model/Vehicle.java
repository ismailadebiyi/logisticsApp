package com.lsslogistics.deliveryapp.vehicle.model;

import com.lsslogistics.deliveryapp.users.model.Staff;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Vehicle {

    @Id
    @SequenceGenerator(
            name = "vehicle_id_sequence",
            sequenceName = "vehicle_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vehicle_id_sequence"
    )
    private Long id;
    private String type;
    private String registrationNo;
    private String manufacturer;
    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
   // private Integer capacity;

}