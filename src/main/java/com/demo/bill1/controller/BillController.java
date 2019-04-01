package com.demo.bill1.controller;


import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import com.demo.bill1.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("bill")
//bill控制器
public class BillController {

    @Autowired
    private BillService billService;

    protected static Logger logger=LoggerFactory.getLogger(BillController.class);

    @RequestMapping("/getAll")
    public String getAll(Model model){
        logger.info("进入控制器");
        System.out.println("进入控制器");
        List<Bill> list=new ArrayList<Bill>();
//        System.out.println(billMapper);
        list= billService.getAll();
        model.addAttribute("list",list);
        return "billList";
    }

    @RequestMapping("/add")
    public String add(Model model){
        System.out.println("进入控制器");
        String result="";
         int rsp=0;
         try{
             rsp=billService.add();
         }catch(Exception e){
             result="插入失败";
         }

        System.out.println(rsp);
        model.addAttribute("result",result);
        return "billList";
}

    @RequestMapping("/testException")
    public String testException(Model model){
        System.out.println("进入控制器");
        String result="";
        int rsp=0;
        rsp=billService.testException();
        System.out.println(rsp);
        model.addAttribute("result",result);
        return "billList";
    }



//    public static String add(){
//        int rsp=billService.add();
//        return "billList";
//    }

}
