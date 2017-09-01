package com.shctc.cloudproject.service;

import com.shctc.cloudproject.Entity.Cust_info;
import com.shctc.cloudproject.Bean.CustIdName;
import com.shctc.cloudproject.repository.CustIdNameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@Service
public class CustIdNameService {

    @Autowired
    private CustIdNameRepo custIdNameRepo;

    @Transactional

    public List<Cust_info> find() {
        return custIdNameRepo.findAll();
    }

    public List<CustIdName> getCustIdNames() {
        List<Cust_info> list = custIdNameRepo.findAll();
        List<CustIdName> lp = new ArrayList<CustIdName>();
        for (Cust_info ri: list ) {
            lp.add(new CustIdName(ri.getCustid(), ri.getCustname()));
        }
        System.out.println(lp);
        return lp;
    }
}
