package com.demo.bill1.service;

import com.demo.bill1.domain.Bill;
import com.demo.bill1.mapper.BillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    @Autowired
    private BillMapper billMapper;

    public List<Bill> getAll(){
        List<Bill> list=new ArrayList<>();
        list=billMapper.getAll();
        return list;
    };

}
