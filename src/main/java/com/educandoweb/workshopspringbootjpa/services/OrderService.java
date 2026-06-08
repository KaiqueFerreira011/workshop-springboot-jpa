package com.educandoweb.workshopspringbootjpa.services;

import com.educandoweb.workshopspringbootjpa.entities.Order;
import com.educandoweb.workshopspringbootjpa.entities.User;
import com.educandoweb.workshopspringbootjpa.repositories.OrderRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    
    @Autowired
    private OrderRepository repository;
    
    public List<Order> findAll() {
        return repository.findAll();
    }
    
    public Order findById(Long id){
       Optional<Order> obj = repository.findById(id);
       return obj.get();
    }
}
