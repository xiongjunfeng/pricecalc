package com.shctc.cloudproject.repository;

import com.shctc.cloudproject.Entity.Order_info;
import com.shctc.cloudproject.Entity.Order_item_info;
import org.springframework.data.repository.CrudRepository;

public interface Order_item_infoRepo extends CrudRepository<Order_item_info, Long> {

}
