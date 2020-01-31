package com.itheima.domain;

public class Account {

    private String idCard;
    private Float money;

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "idCard='" + idCard + '\'' +
                ", money=" + money +
                '}';
    }
}
