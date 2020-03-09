package com.alexau.service;

import java.util.List;

import com.alexau.client.ProductClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alexau.pojo.Product;

@Service
public class ProductService {
//    @Autowired
//    ProductClientRibbon productClientRibbon;
    @Autowired
    ProductClientFeign productClientFeign;
    public List<Product> listProducts(){
//        return productClientRibbon.listProducts();
        return productClientFeign.listProducts();
    }
}