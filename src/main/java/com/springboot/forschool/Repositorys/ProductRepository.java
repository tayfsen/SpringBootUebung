package com.springboot.forschool.Repositorys;

import com.springboot.forschool.Model.Product;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ProductRepository extends JpaRepository<Product, Long> {
    int insertProduct(UUID id, Product product);
    default int insertProduct(Product product)
    {
        UUID id = UUID.randomUUID();
        return insertProduct(id, product);
    }
    List<Product> selectAllProduct();
    Optional<Product> selectProductById();

    int deletePersonById(UUID id);
    int updatePersonById(UUID id, Product Product);
}
