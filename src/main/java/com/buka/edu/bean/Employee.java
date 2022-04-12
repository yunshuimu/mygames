package com.buka.edu.bean;

public class Employee {
    private Integer uId;

    private String uName;

    private String uBirday;

    private Double uMoney;

    private Integer uDid;

    private String uPassword;




    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuBirday() {
        return uBirday;
    }

    public void setuBirday(String uBirday) {
        this.uBirday = uBirday == null ? null : uBirday.trim();
    }

    public Double getuMoney() {
        return uMoney;
    }

    public void setuMoney(Double uMoney) {
        this.uMoney = uMoney;
    }

    public Integer getuDid() {
        return uDid;
    }

    public void setuDid(Integer uDid) {
        this.uDid = uDid;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uBirday='" + uBirday + '\'' +
                ", uMoney=" + uMoney +
                ", uDid=" + uDid +
                ", uPassword='" + uPassword + '\'' ;

    }
}