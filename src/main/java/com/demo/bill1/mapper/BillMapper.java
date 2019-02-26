package com.demo.bill1.mapper;

import com.demo.bill1.domain.Bill;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BillMapper {

    List<Bill> getAll();

}
