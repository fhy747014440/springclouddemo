package com.city.oa.controller;

import com.city.oa.entity.Product;
import com.city.oa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/list")
    public List<Product> getAll(){
        List<Product> result = productService.getAll();
        return result;
    }

}
