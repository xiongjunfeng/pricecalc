package com.shctc.cloudproject.controller;

import com.alibaba.fastjson.JSON;
import com.shctc.cloudproject.Bean.OrderWithItems;
import com.shctc.cloudproject.Bean.Result;
import com.shctc.cloudproject.Entity.Order_info;
import com.shctc.cloudproject.Entity.Order_item_info;
import com.shctc.cloudproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/saveorder", method = RequestMethod.POST)
    public String saveOrder(@RequestBody OrderWithItems orderWithItems, HttpSession session) {
        if(session.getAttribute("loginid")==null){
            System.out.println("============== 还没登录");
            Result result = new Result();
            result.setCode(403);
            result.setMessage("还没登录");

            String jsonResponse =  JSON.toJSONString(result);

            return jsonResponse;
            //return "/log_in.html";
        }

//        System.out.println("============================= order_num="+orderPosted.getOrdernum());

        //用orderAndDetail里的部分数据构造Order_info
        Order_info order_info=new Order_info();
        order_info.setOrdernum(orderWithItems.getOrdernum());
        order_info.setCustid(orderWithItems.getCustid());
        order_info.setLoginid(orderWithItems.getLoginid());
        order_info.setOrderdt(new Timestamp(new Date().getTime()));
        order_info.setOrderduration(orderWithItems.getOrderduration());
        order_info.setPrice(orderWithItems.getPrice());

        //用orderAndDetail里的部分数据构造
        List<Order_item_info> order_item_infos = orderWithItems.getOrderiteminfolist();

        for(int i=0; i<order_item_infos.size(); i++){
//            System.out.println(i);
            Order_item_info order_item_info=order_item_infos.get(i);
            order_item_info.setOrdernum(order_info.getOrdernum());
            int item_id=i+1;
            String order_item_id = order_info.getOrdernum()+"_"+item_id;
            order_item_info.setOrderitemid(order_item_id);
            order_item_info.setOrdertp(0L);
       }

        //调用Service进行保存
        orderService.saveOrder(order_info, order_item_infos);

        Result result = new Result();
        result.setCode(200);
        result.setMessage("succeed");

        String jsonResponse =  JSON.toJSONString(result);;
        return jsonResponse;
    }
}
