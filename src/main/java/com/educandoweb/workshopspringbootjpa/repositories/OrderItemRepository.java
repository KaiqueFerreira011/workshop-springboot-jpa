package com.educandoweb.workshopspringbootjpa.repositories;

import com.educandoweb.workshopspringbootjpa.entities.OrderItem;
import com.educandoweb.workshopspringbootjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
