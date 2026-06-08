package com.educandoweb.workshopspringbootjpa.repositories;

import com.educandoweb.workshopspringbootjpa.entities.Order;
import com.educandoweb.workshopspringbootjpa.entities.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
