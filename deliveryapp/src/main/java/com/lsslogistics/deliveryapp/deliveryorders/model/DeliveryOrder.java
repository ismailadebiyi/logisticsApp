package com.lsslogistics.deliveryapp.deliveryorders.model;

import com.lsslogistics.deliveryapp.items.model.Items;
import com.lsslogistics.deliveryapp.users.model.Staff;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class DeliveryOrder {

    @Id
    @SequenceGenerator(
            name = "order_id_sequence",
            sequenceName = "order_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_id_sequence"
    )
    private Long id;
    private BigInteger cost;
    @OneToMany
    private List<Items> items;
    @Embedded
    private Sender sender;
    @Embedded
    private Receiver receiver;
    private Status status;
    private String trackingNo;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private Staff staff;
}
