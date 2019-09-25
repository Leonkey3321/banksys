package com.qf.entity;

public class User {

    private Integer uid;
    private String bankCode;
    private String password;
    private Double balance;
    private Integer state;

    public User() {

    }

    public User(Integer uid, String bankCode, String password, Double balance, Integer state) {
        this.uid = uid;
        this.bankCode = bankCode;
        this.password = password;
        this.balance = balance;
        this.state = state;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", bankCode='" + bankCode + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", state=" + state +
                '}';
    }
}
