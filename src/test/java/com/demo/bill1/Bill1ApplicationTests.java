package com.demo.bill1;

import com.demo.bill1.mapper.BillMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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
        System.out.println(billMapper.getAll());
    }

}

