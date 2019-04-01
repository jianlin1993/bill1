package com.demo.bill1.controller;


import com.demo.bill1.domain.Bill;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("test")
public class TestController {



    @RequestMapping("/json")
    public List<Bill> testJson(){
        List list=new ArrayList<Bill>();
        Bill bill =new Bill();
        bill.setNo(1);
        bill.setRemark("json测试");
        list.add(bill);
        return list;
    }



}
