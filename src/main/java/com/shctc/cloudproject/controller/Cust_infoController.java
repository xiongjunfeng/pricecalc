package com.shctc.cloudproject.controller;

import com.alibaba.fastjson.JSON;
import com.shctc.cloudproject.Bean.Result;
import com.shctc.cloudproject.Entity.Cust_info;
import com.shctc.cloudproject.service.Cust_infoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
public class Cust_infoController {

    @Autowired
    private Cust_infoService cust_infoService;

    @RequestMapping(value = "/saveCustInfo", method = RequestMethod.POST)
    public String saveCust(@RequestBody Cust_info cust_info, HttpSession session) {
        if(session.getAttribute("loginid")==null){
            System.out.println("============== 还没登录");
            Result result = new Result();
            result.setCode(403);
            result.setMessage("还没登录");

            String jsonResponse =  JSON.toJSONString(result);;

            return jsonResponse;
            //return "/log_in.html";
        }


        //调用Service进行保存
        cust_infoService.save(cust_info);

        Result result = new Result();
        result.setCode(200);
        result.setMessage("succeed");

        String jsonResponse =  JSON.toJSONString(result);;
        return jsonResponse;
    }
}
