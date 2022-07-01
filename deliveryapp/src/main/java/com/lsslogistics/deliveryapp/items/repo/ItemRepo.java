package com.lsslogistics.deliveryapp.items.repo;

import com.lsslogistics.deliveryapp.items.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Items, Long> {
}
