package com.demo.bill1.controller;


import com.demo.bill1.domain.Bill;
import com.demo.bill1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("test")
public class TestController {

@Autowired
private UserService userService;

    @RequestMapping("/json")
    public List<Bill> testJson(){
        List list=new ArrayList<Bill>();
        Bill bill =new Bill();
        bill.setRemark("json测试");
        list.add(bill);
        return list;
    }

    @RequestMapping("/cash")
    public List<HashMap<String,Object>> sfUser2(){
        List<HashMap<String,Object>> list2=userService.sfUser2();
        return list2;
    }
    @RequestMapping("/cash2")
    public List<HashMap<String,Object>> sfUser3(){
        List<HashMap<String,Object>> list2=userService.sfUser3();
        return list2;
    }


}
