package com.shctc.cloudproject.controller;

import com.shctc.cloudproject.Entity.Resource_info;
import com.shctc.cloudproject.Bean.Products;
import com.shctc.cloudproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public List<Products> display(){
        List<Products> list = productService.getProducts();
        System.out.println(list);
        return list;
    }

}