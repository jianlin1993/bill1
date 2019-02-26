package com.demo.bill1.controller;


import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import com.demo.bill1.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("bill")
public class BillController {

    @Autowired
    private BillService billService;

    @RequestMapping("/getAll")
    public String getAll(Model model){
        System.out.println("进入控制器");
        List<Bill> list=new ArrayList<Bill>();
//        System.out.println(billMapper);
        list= billService.getAll();
        model.addAttribute("list",list);
        return "billList";
    }


}
