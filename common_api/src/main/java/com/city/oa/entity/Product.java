package com.city.oa.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Product implements Serializable {
    private Integer id;
    private String productName;
}
