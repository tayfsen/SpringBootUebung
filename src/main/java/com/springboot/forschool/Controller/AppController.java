package com.springboot.forschool.Controller;

import com.springboot.forschool.Model.Product;
import com.springboot.forschool.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class AppController {

    private final ProductService productService;

    @Autowired
    public AppController(ProductService productService)
    {
       this.productService = productService;
    }

    @PostMapping
    public void addProduct (Product product)
    {
        productService.addProduct(product);
    }

    @GetMapping
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }

    @DeleteMapping
    public void deleteProductById(@PathVariable("id") UUID id)
    {
        productService.deleteProduct(id);
    }
    /*
    @PutMapping(path = "{id}")
    public void updateProduct(@PathVariable("id") UUID id, Product productToUpdate)
    {
        productService.updatePerson(id, productToUpdate);
    }
    */

}
