package com.demo.bill1.mapper;

import com.demo.bill1.domain.Bill;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BillMapper {

    List<Bill> getAll();



    //使用#{}方式
    List<Bill> sfByTxTyp(Bill bill);
    //使用${}方式时，要想传入一个字符串作为参数，必须加上@Param注解
    List<Bill> sfByNo(@Param("no")String no);
    //单条插入
    int add(Bill bill);
    //多条插入
    int mulAdd(List list);

    int mulAddOracle(List list);

    int mulAddOracle2(List list);
    //更新
    int upt(Bill bill);
    //更新
    int upt2(Bill bill);
    //删除
    int del(Bill bill);

    int mulAdd2(List list);

}
