package com.itheima.domain;

public class UserPlus {

    private String name;
    private String password;
    private Account account;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "UserPlus{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                '}';
    }
}
