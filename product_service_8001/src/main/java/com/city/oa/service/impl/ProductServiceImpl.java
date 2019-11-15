package com.city.oa.service.impl;

import com.city.oa.entity.Product;
import com.city.oa.mapper.ProductMapper;
import com.city.oa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAll() {
        return productMapper.getAll();
    }
}
