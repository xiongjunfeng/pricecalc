package com.shctc.cloudproject.service;

import com.shctc.cloudproject.Entity.Empl_info;
import com.shctc.cloudproject.repository.EmplRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.constraints.Null;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class EmplService {

  @Autowired
  private EmplRepo emplRepo;

  @Transactional

  public List<Empl_info> find(String name, String password) {
    return emplRepo.findByLoginidAndPassword(name,password);
  }

  public boolean result(List<Empl_info> list){
    if(list.size()!=1) return false;
    else return true;
  }
}
