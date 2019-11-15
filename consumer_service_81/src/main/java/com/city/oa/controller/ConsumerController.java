package com.city.oa.controller;

import com.city.oa.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
    private static final String REST_URL_PREFIX="http://localhost:8001/";

    @Autowired
    RestTemplate restTemplate;
    /**
     *  使用RestTemplate 远程调用
     */
    @GetMapping("/consumer/getProduct")
    public List<Product> getAll(){
        List<Product> result = restTemplate.getForObject(REST_URL_PREFIX+"product/list",List.class);
        return result;
    }

}
