package com.example.baichao.myapplication;

/**
 * Created by 58 on 2015/7/22.
 */
public class ManagerVO {
    private int id;
    private String mMangerName;
    private String mManagerTel;
    private String mManagerMail;

    public ManagerVO(String mMangerName, String mManagerMail, String mManagerTel) {
        this.mMangerName = mMangerName;
        this.mManagerMail = mManagerMail;
        this.mManagerTel = mManagerTel;
    }
    public ManagerVO(String mMangerName, String mManagerMail){
        this.mMangerName = mMangerName;
        this.mManagerTel = "123";
        this.mManagerMail = mManagerMail;
    }

    public String getmMangerName() {
        return mMangerName;
    }

    public void setmMangerName(String mMangerName) {
        this.mMangerName = mMangerName;
    }

    public String getmManagerTel() {
        return mManagerTel;
    }

    public void setmManagerTel(String mManagerTel) {
        this.mManagerTel = mManagerTel;
    }

    public String getmManagerMail() {
        return mManagerMail;
    }

    public void setmManagerMail(String mManagerMail) {
        this.mManagerMail = mManagerMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
