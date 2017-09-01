package com.shctc.cloudproject.controller;

import com.shctc.cloudproject.Entity.Empl_info;
import com.shctc.cloudproject.Bean.UserInfo;
import com.shctc.cloudproject.Bean.Result;
import com.shctc.cloudproject.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author lepdou 2017-06-18
 */
@RestController
public class EmplController {

    @Autowired
    private EmplService emplService;
    //  @RequestParam(value = "name") String name,
    //  @RequestParam(value = "password") String password
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result userConfirm(@RequestBody UserInfo user, HttpSession session) {
        System.out.println("=============================");
       System.out.println(user.getName());
       System.out.println(user.getPassword());
        System.out.println("sessionId="+session.getId());

       Result t = new Result();
       List<Empl_info> list = emplService.find(user.getName(), user.getPassword());
      // return emplService.result(list);

      if(emplService.result(list)==true){
           t.setCode(200);
           t.setMessage("success");
           session.setAttribute("loginid", user.getName());
       }
       else{
           t.setCode(403);
           t.setMessage("fail");
       }

       return t;
       //System.out.println(emplService.result(list));
       //return emplService.result(list);
    }
}
