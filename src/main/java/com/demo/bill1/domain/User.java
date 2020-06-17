package com.demo.bill1.domain;

import org.springframework.stereotype.Repository;

@Repository
public class User {
    private int no;
    private String userName;
    private String passWord;
    public int getNo() { return no; }
    public void setNo(int no) { this.no = no; }
    public String getUserName() { return userName; }
    public String getPassWord() { return passWord; }
    public void setUserName(String userName) { this.userName = userName; }
    public void setPassWord(String passWord) { this.passWord = passWord; }
    @Override
    public String toString(){
        return "序号："+no+" 名字："+userName+" 密码："+passWord;
    }
}
