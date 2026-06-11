package com.educandoweb.workshopspringbootjpa.services;

import com.educandoweb.workshopspringbootjpa.entities.Product;
import com.educandoweb.workshopspringbootjpa.repositories.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;
    
    public List<Product> findAll() {
        return repository.findAll();
    }
    
    public Product findById(Long id){
       Optional<Product> obj = repository.findById(id);
       return obj.get();
    }
}
