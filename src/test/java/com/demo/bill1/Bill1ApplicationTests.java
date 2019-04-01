package com.demo.bill1;

import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class Bill1ApplicationTests {

    @Resource
    private BillMapper billMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getAll(){


        billMapper.getAll();

    }

    @Test
    public void add(){
        Bill bill=new Bill();
        bill.setTxTyp("1");
        bill.setRemark("试试影响行数");
        System.out.println(billMapper.add(bill));
    }

    @Test //根据no进行更新
    public void upt(){
        Bill bill=new Bill();
        bill.setTxTyp("1");
        bill.setRemark("#{}方式");
        bill.setNo(16);
        System.out.println(billMapper.upt(bill));
    }

    @Test
    public void upt2(){

        Bill bill=new Bill();
        bill.setTxTyp("1");
        bill.setRemark("${}方式");
        bill.setNo(16);
        System.out.println(billMapper.upt2(bill));
    }

    @Test //根据txTyp进行更新
    public void del(){
        Bill bill=new Bill();
        bill.setTxTyp("1");
        System.out.println(billMapper.del(bill));
    }

    @Test //测试一次性插入多条记录
    public void mulAdd(){
        List list =new ArrayList<Bill>();
        Bill bill1=new Bill();
        bill1.setTxTyp("1");
        bill1.setRemark("bill1");
        Bill bill2=new Bill();
        bill2.setTxTyp("1");
        bill2.setRemark("bill2");
        Bill bill3=new Bill();
        bill3.setTxTyp("1");
        bill3.setRemark("bill3");
        list.add(bill1);
        list.add(bill2);
        list.add(bill3);
        System.out.println(billMapper.mulAdd(list));
    }

    @Test //测试一次性插入多条记录
    public void mulAdd2(){
        List list =new ArrayList<Bill>();
        Bill bill1=new Bill();
        bill1.setTxTyp("1");
        bill1.setRemark("bill1");
        Bill bill2=new Bill();
        bill2.setTxTyp("1");
        bill2.setRemark("bill2");
        Bill bill3=new Bill();
        bill3.setTxTyp("1");
        bill3.setRemark("bill3");
        bill3.setNo(16);
        list.add(bill1);
        list.add(bill2);
        list.add(bill3);
        System.out.println(billMapper.mulAdd(list));
    }


    @Test //测试一次性插入多条记录
    public void mulAddOracle(){
        List list =new ArrayList<Bill>();
        Bill bill1=new Bill();
        bill1.setTxTyp("1");
        bill1.setRemark("bill1");
        Bill bill2=new Bill();
        bill2.setTxTyp("1");
        bill2.setRemark("bill2");
        Bill bill3=new Bill();
        bill3.setTxTyp("1");
        bill3.setRemark("bill3");
        bill3.setNo(16);
        list.add(bill1);
        list.add(bill2);
        list.add(bill3);
        System.out.println(billMapper.mulAddOracle(list));
    }

    @Test //测试一次性插入多条记录
    public void mulAddOracle2(){
        List list =new ArrayList<Bill>();
        Bill bill1=new Bill();
        bill1.setTxTyp("1");
        bill1.setRemark("bill1");
        Bill bill2=new Bill();
        bill2.setTxTyp("1");
        bill2.setRemark("bill2");
        Bill bill3=new Bill();
        bill3.setTxTyp("1");
        bill3.setRemark("bill3");
        bill3.setNo(16);
        list.add(bill1);
        list.add(bill2);
        list.add(bill3);
        System.out.println(billMapper.mulAddOracle2(list));
    }


    @Test
    public void sfByNo(){
        Bill bill=new Bill();
        String no="no";
        System.out.println(billMapper.sfByNo(no));
    }

    @Test
    public void sfByTxTyp(){
        Bill bill=new Bill();
        bill.setTxTyp("1");
        billMapper.sfByTxTyp(bill);
    }

    @Test
    public void testDebug(){
        int j=0;
        for (int i=0;i<10;i++){
            j=i+j;
            System.out.println(j);
        }
    }


    @Test
    public void testDate(){
        String s1="20190325110000";
        String s2="20190325110020";
        BigDecimal num1 = new BigDecimal(s1);
        BigDecimal num2 = new BigDecimal(s2);
        String result=num2.subtract(num1).toString();
        System.out.println("时间差是"+result + "秒");


    }

}