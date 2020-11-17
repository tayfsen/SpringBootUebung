package com.springboot.forschool.Repositorys;

import com.springboot.forschool.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
