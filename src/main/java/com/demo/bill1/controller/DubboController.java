package com.demo.bill1.controller;


//import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.bill1.domain.Bill;
import com.demo.bill1.service.BillServiceDubbo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("t")
public class DubboController {

    //如果provider中标注了版本号  这里必须要加上(version = "1.0.0")
   // @Reference(version = "1.0.0")
    BillServiceDubbo dubboService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<Bill> aaaa(){
        return dubboService.getAll();
    }
}
