package com.demo.bill1.controller;


import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import com.demo.bill1.service.BillService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("bill")
//bill控制器
public class BillController {

    //测试

    @Autowired
    private BillService billService;
    @Autowired
    private Bill bill;
    @Autowired
    private Bill bill2;
    @Autowired
    private BillMapper billMapper;
    protected static Logger logger=LoggerFactory.getLogger(BillController.class);

    @RequestMapping("/getAll")
    public String getAll(Model model){
        logger.info("进入控制器");
        System.out.println("进入控制器");
        List<Bill> list=new ArrayList<Bill>();
//        System.out.println(billMapper);
        list= billService.getAll();
        //billMapper.sfByNo(1);
        model.addAttribute("list",list);
        return "billList";
    }

    @ResponseBody
    @RequestMapping("/sfByNo/{no}")
    public Bill sfByNo(Model model,@PathVariable int no){
        logger.info("进入子页面");
        bill= billService.sfByNo(no);
        model.addAttribute("bill",bill);
        return bill;
    }

    @ResponseBody
    @RequestMapping("/GetData")
    public String GetData() throws Exception {
        List<Bill> list = new ArrayList<>();
        bill.setNo(1);
        bill.setTxDt("20190310");
        bill2.setNo(2);
        bill2.setTxDt("20190311");
        list.add(bill);
        list.add(bill2);
        ObjectMapper objectMapper = new ObjectMapper();
        String rsp = "";
        rsp = objectMapper.writeValueAsString(list);
        System.out.println(rsp);
        return rsp;
    }

        @ResponseBody
        @RequestMapping("/TestAJAX")
        public Boolean TestAJAX() throws Exception{
            Boolean rsp=true;
            return rsp;

//        var total = data.Count;
//        var rows = data.Skip(offset).Take(limit).ToList();
//        return Json(new { total = total, rows = rows }, JsonRequestBehavior.AllowGet);
    }


    @RequestMapping("/billDetail/{no}")
    public String billDetail(Model model,@PathVariable int no){
        //int no2=Integer.parseInt(no);
//        bill= billService.sfByNo(no);
//        model.addAttribute("bill",bill);
        return "billDetail";
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
