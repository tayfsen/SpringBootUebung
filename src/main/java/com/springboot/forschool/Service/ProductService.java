package com.springboot.forschool.Service;

import com.springboot.forschool.Model.Product;
import com.springboot.forschool.Repositorys.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private ProductRepository repo;

    @Autowired
    public ProductService(ProductRepository repo)
    {
        this.repo = repo;
    }

    public int addProduct(Product product)
    {
    return repo.insertProduct(product);
    }

    public List<Product> getAllProduct()
    {
    return repo.selectAllProduct();
    }

    public Optional<Product> getPersonById(UUID id)
    {
    return repo.selectProductById();
    }

    public int deleteProduct (UUID id)
    {
        return repo.deletePersonById(id);
    }
    /*
    public int updatePerson(UUID id, Product newProduct)
    {
        return repo.updatePersonById(id, newProduct);
    }

    */

   public List<Product> productList()
    {
        return repo.findAll();
    }

    public void save(Product product)
    {
        repo.save(product);
    }

    public Product get(Long id)
    {
    return repo.findById(id).get();
    }

    public void delete(Long id)
    {
        repo.deleteById(id);
    }

}
