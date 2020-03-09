package com.alexau.client;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.alexau.pojo.Product;

@Component
public class ProductClientRibbon {

//    @Autowired
//    RestTemplate restTemplate;
//
//    public List<Product> listProducts() {
//        return restTemplate.getForObject("http://PRODUCT-DATA-SERVICE/products",List.class);
//    }

}