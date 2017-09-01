package com.shctc.cloudproject.controller;

import com.alibaba.fastjson.JSON;
import com.shctc.cloudproject.Bean.Result;
import com.shctc.cloudproject.Bean.UserInfo;
import com.shctc.cloudproject.Bean.CustIdName;
import com.shctc.cloudproject.service.CustIdNameService;
import com.shctc.cloudproject.service.CustIdNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@RestController
public class CustIdNameController {

    @Autowired
    private CustIdNameService custIdNameService;

    @RequestMapping(value = "/getCustIdName", method = RequestMethod.GET)
    public List<CustIdName> display(HttpSession session){
        if(session.getAttribute("loginid")==null){
            System.out.println("============== 还没登录");
            Result result = new Result();
            result.setCode(403);
            result.setMessage("还没登录");
            return null;
            //return "/log_in.html";
        }

        List<CustIdName> list = custIdNameService.getCustIdNames();
        System.out.println(list);
        return list;
    }

}
