package com.demo.bill1.domain;

public class Bill {
   private String txTyp;
   private String txDt;
   private Long txAmt;
   private String remark;
   private String user;
   private int no;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
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

    public Long getTxAmt() {
        return txAmt;
    }

    public void setTxAmt(Long txAmt) {
        this.txAmt = txAmt;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public void clean(){
        setNo(0);
        setRemark(null);
        setTxAmt(null);
        setTxDt(null);
        setTxTyp(null);
        setUser(null);
    }
}
