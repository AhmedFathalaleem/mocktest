package com.section.mocktest;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


@Component
public class accountModel {

    public List<Account> accounts = new ArrayList<>();

    public accountModel(){
        accounts.add(new Account(1, "Ahmed", 10, "Ahmed@Rmail.com"));
        accounts.add(new Account(2, "Fares", 20, "Fares@Rmail.com"));
    }

    public List<Account> getAccounts(){
        return this.accounts;
    }

    public String addAccount(String id, String name, String balance, String email){
        if(!validateEmail(email)){
            return "Invalid email";
        }

        Account temp = new Account(Integer.valueOf(id), name, Integer.valueOf(balance), email);
        accounts.add(temp);
        return "Account added succefully";
    }

    public boolean validateEmail(String email){

        String regex = "^(.+)@Rmail.com$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(!matcher.matches()){
            return false;
        }
        return true;

    }

    public String deleteAccount(Integer id){
        for(int i = 0; i<=this.accounts.size(); i++){
            if(accounts.get(i).getId() == id){
                this.accounts.remove(i);
                return "Account Removed";
            }
        }
        return "Something went wrong";
    }





}
