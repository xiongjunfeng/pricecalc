package com.shctc.cloudproject.service;

import com.shctc.cloudproject.Entity.Order_item_info;
import com.shctc.cloudproject.repository.Order_infoRepo;
import com.shctc.cloudproject.repository.Order_item_infoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.shctc.cloudproject.Entity.Order_info;

@Service
public class OrderService {

    @Autowired
    private Order_infoRepo order_infoRepo;

    @Autowired
    private Order_item_infoRepo order_item_infoRepo;



    @Transactional
    public void saveOrder(Order_info order_info, List<Order_item_info> order_item_infos) {

        //写数据到 订单头表order_info+订单行项目表order_item_info
        order_infoRepo.save(order_info);

        //写数据到 订单行项目表order_item_info
        order_item_infoRepo.save(order_item_infos);
//        for(int i=0; i<order_item_infos.size(); i++){
//            System.out.println(i);
//            Order_item_info order_item_info=order_item_infos.get(i);
//            order_item_info.setOrdernum(order_info.getOrdernum());
//            int item_id=i+1;
//            String order_item_id = order_info.getOrdernum()+"_"+item_id;
//            order_item_info.setOrderitemid(order_item_id);
//            order_item_info.setOrdertp(0L);
//
//            order_item_infoRepo.save(order_item_info);
//        }

    }

}
