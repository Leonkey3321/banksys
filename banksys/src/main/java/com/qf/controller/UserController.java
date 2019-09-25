package com.qf.controller;

import com.qf.common.JsonResult;
import com.qf.entity.User;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController //上下关系等同
public class UserController {

    @Autowired
    UserService userService;

    //@RequestMapping(value = "/login",method = RequestMethod.POST)   //上下等同
    @PostMapping("/login")
    public JsonResult login(String code,String password){

        try {
            User user = userService.login(code, password);
            return new JsonResult(0, null);
        }catch (Exception e){
            e.printStackTrace();
            return new JsonResult(1,e.getMessage());
        }
    }

}
