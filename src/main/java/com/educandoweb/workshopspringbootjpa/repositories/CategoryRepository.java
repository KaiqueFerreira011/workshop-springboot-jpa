package com.educandoweb.workshopspringbootjpa.repositories;

import com.educandoweb.workshopspringbootjpa.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
