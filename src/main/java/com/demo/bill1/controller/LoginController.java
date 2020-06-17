package com.demo.bill1.controller;

import com.demo.bill1.domain.User;
import com.demo.bill1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@EnableAutoConfiguration

public class LoginController {

    @Autowired
    private User user;
    @Resource
    private UserMapper userMapper;


    @RequestMapping("log")
    public String inx(){
        System.out.println("进入log");
        return "login3D";
    }

    @RequestMapping("index")
    public String index(){
        System.out.println("进入index");
        return "index";
    }


    @ResponseBody
    @RequestMapping("login")
    public String Login(@RequestParam(value="username", required=false) String userName,@RequestParam(value="password", required=false) String passWord){
        System.out.println("进入login");
        user.setPassWord(passWord);
        user.setUserName(userName);
        String isTrueUser=userMapper.login(user);
        if("1".equals(isTrueUser)){
            return "true";
        }else{
            return "false";
        }
    }

    @ResponseBody
    @RequestMapping("sf")
    public List<HashMap<String, Object>> sf(){
        List<HashMap<String,Object>> list=new ArrayList<>();
        list=userMapper.sf();
        for(HashMap<String, Object> m : list) {
            for (String key : m.keySet()) {
                System.out.println("Key = " + key + ", Value = " + m.get(key));
            }
        }
        return list;
    }


}
