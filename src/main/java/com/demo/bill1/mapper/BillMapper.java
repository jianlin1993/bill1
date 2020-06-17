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
    List<Bill> selectLike(Bill bill);

    List<Bill> sfBill(Bill bill);

    Bill sfByNo(int no);
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
