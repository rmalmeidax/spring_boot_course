package com.maranduba.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maranduba.course.entities.OrderItem;
import com.maranduba.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
