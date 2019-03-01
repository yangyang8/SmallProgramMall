package com.hailong.controller;

import com.hailong.pojo.TbUserAddress;
import com.hailong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AddressController {


    @Autowired
    private UserService userService;

    @RequestMapping("/getAddress")
    @ResponseBody
    public List<TbUserAddress> findAll(){
        return userService.findAll();
    }
}
