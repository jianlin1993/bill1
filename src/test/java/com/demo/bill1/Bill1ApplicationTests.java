package com.demo.bill1;

import com.demo.bill1.domain.Bill;
import com.demo.bill1.domain.User;
import com.demo.bill1.mapper.BillMapper;
import com.demo.bill1.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class Bill1ApplicationTests {

    @Resource
    private BillMapper billMapper;
    @Resource
    private UserMapper userMapper;
    @Resource
    private Bill bill;

    @Resource
    private User user;


    @Test
    public void testCash(){
        Map<String,Object> map=new HashMap<>();
        map.put("no",2);
        map.put("userName","王建林");
        userMapper.sfUserByParMap(map);


    }



    @Test
    public void addUser() {
        user.setUserName("测试");
        user.setPassWord("666");
        int no=userMapper.addUser(user);
        System.out.println(no + " "+user.getNo());
    }

    @Test
    public void sfUser2(){
        List<HashMap<String,Object>> list=new ArrayList<>();
        list=userMapper.sfUser2();
        for(HashMap<String, Object> m : list) {
            for (String key : m.keySet()) {
                System.out.println("Key = " + key + ", Value = " + m.get(key));
            }
        }
    }
    @Test
    public void sfUserBill(){
        List<HashMap<String,Object>> list=new ArrayList<>();
        list=userMapper.sfUserBill();
        for(HashMap<String, Object> m : list) {
            for (String key : m.keySet()) {
                System.out.println("Key = " + key + ", Value = " + m.get(key));
//                if("user".equals(key)){
//                    User user=(User)m.get(key);
//                    System.out.println(user.toString());
//                }
//                if("bill".equals(key)){
//                    Bill bill=(Bill)m.get(key);
//                    System.out.println(bill.toString());
//                }
            }
        }
    }



    @Test   //测试分表 根据参数查询不同的表
    public void sfByTable(){
        List<HashMap<String,Object>> list=new ArrayList<>();
        String tableName="usr";
        list=userMapper.sfByTable(tableName);
        for(HashMap<String, Object> m : list) {
            for (String key : m.keySet()) {
                System.out.println("Key = " + key + ", Value = " + m.get(key));
            }
        }
    }

    @Test
   public void sfByNo(){
        user=userMapper.sfByNo(1);
        System.out.println(user.getNo());
   }

    @Test
    public void contextLoads() {
    }
    @Test
    public void sf(){
//        List<HashMap<String,Object>> list=new ArrayList<>();
//        list=userMapper.sf();
//        for(HashMap<String, Object> m : list) {
//            for (String key : m.keySet()) {
//                System.out.println("Key = " + key + ", Value = " + m.get(key));
//            }
//        }
    }

    @Test
    public void getAll(){


        billMapper.getAll();

    }

    @Test
    public void sfBill(){
        List<Bill> list=new ArrayList<>();
        bill.setUsrNo(1);
        //bill.setTxTyp("1");
        list=billMapper.sfBill(bill);
        for(Bill m : list) {
            System.out.println(m);
        }

    }
    @Test
    public void selectLike(){
        List<Bill> list=new ArrayList<>();
        bill.setRemark("支出");
        //bill.setTxTyp("1");
        list=billMapper.selectLike(bill);
        for(Bill m : list) {
            System.out.println(m);
        }
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
        System.out.println(billMapper.upt(bill));
    }

    @Test
    public void upt2(){

        Bill bill=new Bill();
        bill.setTxTyp("1");
        bill.setRemark("${}方式");
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
        list.add(bill1);
        list.add(bill2);
        list.add(bill3);
        System.out.println(billMapper.mulAddOracle2(list));
    }


//    @Test
//    public void sfByNo(){
//        Bill bill=new Bill();
//        String no="no";
//        System.out.println(billMapper.sfByNo(no));
//    }

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