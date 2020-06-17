package com.demo.bill1.service;

import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@Transactional
@Component
//
//@Service(version = "1.0.0",interfaceClass = BillServiceDubbo.class)
public class BillService implements BillServiceDubbo{

    @Autowired
    private BillMapper billMapper;
    @Autowired
    private Bill bill;

    public List<Bill> getAll(){
        //修改一下提交试试
        List<Bill> list=new ArrayList<>();
        list=billMapper.getAll();
//        try{
//            Thread.sleep(2000);
//        }catch (Exception e){
//
//        }
        billMapper.sfByNo(1);
        return list;
    };

    public Bill sfByNo(int no){
        bill=billMapper.sfByNo(no);
        return bill;
    };

    public int add(){
        Bill bill=new Bill();
        bill.setTxTyp("1");
        bill.setRemark("试试影响行数");
        int rsp=billMapper.add(bill);
        System.out.println(rsp);
            System.out.println("try模块");
            rsp+=billMapper.add(bill);

            return rsp;

//        System.out.println(rsp);

    }


    public int testException (){
System.out.println("调用service");
        int rsp=1;
        try{
            throw new OutOfMemoryError("内存溢出");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("catch 语句");
            e.printStackTrace();
        }finally{

            return rsp;
        }

//        System.out.println(rsp);

    }

}
