package com.shctc.cloudproject.service;

import com.shctc.cloudproject.Entity.Cust_info;
import com.shctc.cloudproject.repository.Cust_infoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class Cust_infoService {

    @Autowired
    private Cust_infoRepo cust_infoRepo;

    @Transactional
    public void save(Cust_info cust_info) {

        cust_infoRepo.save(cust_info);

    }

}
