package com.maranduba.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maranduba.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
