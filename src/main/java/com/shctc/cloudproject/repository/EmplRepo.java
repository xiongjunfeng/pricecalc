package com.shctc.cloudproject.repository;

import com.shctc.cloudproject.Entity.Empl_info;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface EmplRepo extends PagingAndSortingRepository<Empl_info, Long> {

 // List<Sale> findByHouseAndCreateDateAfterOrderByCreateDate(String house, String date);
  List<Empl_info> findByLoginidAndPassword(String login_id, String password);

}
