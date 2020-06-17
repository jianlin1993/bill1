package com.demo.bill1.service;


import com.demo.bill1.domain.Bill;
import com.demo.bill1.domain.User;
import com.demo.bill1.mapper.BillMapper;
import com.demo.bill1.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service

public class UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private User user;

    @Autowired
    private BillMapper billMapper;
    @Autowired
    private Bill bill;

    @Transactional
    public List<HashMap<String,Object>> sfUser2(){
        List<HashMap<String,Object>> list1=userMapper.sfUser2();
//        for(HashMap<String, Object> m : list1) {
//            for (String key : m.keySet()) {
//                System.out.println("Key = " + key + ", Value = " + m.get(key));
//            }
//        }
        bill.setTxTyp("1");
        bill.setUsrNo(1);
        bill.setTxDt("20190322");
        bill.setCnlNo(1);
        bill.setTxAmt(20.0);
        bill.setRemark("测试");
        //billMapper.add(bill);
        List<HashMap<String,Object>> list2=userMapper.sfUser2();

        return list2;
    }

    @Transactional
    public List<HashMap<String,Object>> sfUser3(){
        List<HashMap<String,Object>> list1=userMapper.sfUser2();
        List<HashMap<String,Object>> list2=userMapper.sfUser2();

        return list2;
    }

}
