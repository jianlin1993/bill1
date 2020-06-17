package com.demo.bill1.domain;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Repository
public class Bill implements java.io.Serializable{
   private String txTyp;
   private String txDt;
   private Double txAmt;
    private String remark;
    private int usrNo;
    private int cnlNo;

    private int no;
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }




    public int getUsrNo() {
        return usrNo;
    }

    public void setUsrNo(int usrNo) {
        this.usrNo = usrNo;
    }

    public int getCnlNo() {
        return cnlNo;
    }

    public void setCnlNo(int cnlNo) {
        this.cnlNo = cnlNo;
    }



    public String getTxTyp() {
        return txTyp;
    }

    public void setTxTyp(String txTyp) {
        this.txTyp = txTyp;
    }

    public String getTxDt() {
        return txDt;
    }

    public void setTxDt(String txDt) {
        this.txDt = txDt;
    }

    public Double getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(Double txAmt) {
        this.txAmt = txAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString(){
        return "序号："+no+" 用户编号："+usrNo+" 渠道编号："+cnlNo+" 金额："+txAmt+" 日期："+txDt+" 交易类型："+txTyp +" 备注："+remark;
    }
}
