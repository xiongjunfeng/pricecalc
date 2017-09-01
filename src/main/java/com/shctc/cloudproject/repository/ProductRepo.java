package com.shctc.cloudproject.repository;

import com.shctc.cloudproject.Entity.Resource_info;
import com.shctc.cloudproject.Bean.Products;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProductRepo extends PagingAndSortingRepository<Resource_info, Long> {
  List<Resource_info> findAll();
}
