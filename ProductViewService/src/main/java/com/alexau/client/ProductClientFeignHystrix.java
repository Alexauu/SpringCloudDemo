package com.alexau.client;

import java.util.ArrayList;
import java.util.List;

import com.alexau.pojo.Product;
import org.springframework.stereotype.Component;


@Component
public class ProductClientFeignHystrix implements ProductClientFeign{

    public List<Product> listProducts(){
        List<Product> result = new ArrayList<>();
        result.add(new Product(0,"产品数据微服务不可用",0));
        return result;
    }

}