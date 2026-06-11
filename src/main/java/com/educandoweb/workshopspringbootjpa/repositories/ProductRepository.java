package com.educandoweb.workshopspringbootjpa.repositories;

import com.educandoweb.workshopspringbootjpa.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
