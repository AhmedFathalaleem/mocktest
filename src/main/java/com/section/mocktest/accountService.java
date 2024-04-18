package com.section.mocktest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class accountService {
    
    @Autowired
    private accountModel accountModel;

    public List<Account> getAccounts(){
        return accountModel.getAccounts();
    }

    public String addAccount(String id, String name, String balance, String email){
        return accountModel.addAccount(id, name, balance, email);
    }

    public String deleteAccount(Integer id){
        return accountModel.deleteAccount(id);
    }


}
