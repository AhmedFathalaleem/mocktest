package com.section.mocktest;


public class Account {
    
    private Integer id;
    private String name;
    private Integer balance;
    private String email;

    

    public Account(Integer id, String name, Integer balance, String email) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }

    
    
    

}
