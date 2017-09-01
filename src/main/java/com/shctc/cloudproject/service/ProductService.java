package com.shctc.cloudproject.service;

import com.shctc.cloudproject.Entity.Resource_info;
import com.shctc.cloudproject.repository.ProductRepo;
import com.shctc.cloudproject.Bean.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class ProductService {

  @Autowired
  private ProductRepo productRepoRepo;

  @Transactional

  public List<Resource_info> find() {
    return productRepoRepo.findAll();
  }

  public List<Products> getProducts() {
    List<Resource_info> list = productRepoRepo.findAll();
    List<Products> lp = new ArrayList<Products>();
    for (Resource_info ri: list ) {
      lp.add(new Products(ri.getResourcetp(), ri.getRssubtp(),ri.getPrice(), ri.getUnit()));
    }
    System.out.println(lp);
    return lp;
  }
}

