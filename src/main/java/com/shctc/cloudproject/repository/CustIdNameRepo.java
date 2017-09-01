package com.shctc.cloudproject.repository;

import com.shctc.cloudproject.Entity.Cust_info;
import com.shctc.cloudproject.Entity.Resource_info;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustIdNameRepo extends PagingAndSortingRepository<Cust_info, Long> {
  List<Cust_info> findAll();
}
