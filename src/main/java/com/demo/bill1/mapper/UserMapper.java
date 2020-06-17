package com.demo.bill1.mapper;

import com.demo.bill1.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    String login(User user);

    List<HashMap<String,Object>> sf();

    //测试单条插入并返回主键

    int addUser(User user);

    User addUser2(User user);

    User sfByNo(int no);

    List<HashMap<String,Object>> sfUser2();

    List<HashMap<String,Object>> sfUserBill();

//    List<HashMap<String,Object>> sfUserBill2();

    List<HashMap<String,Object>> sfByTable(@Param("TABLE_NM")String tableName);


    List<HashMap<String,Object>> sfUserByParMap(Map map);
}
