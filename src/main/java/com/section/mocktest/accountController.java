package com.section.mocktest;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class accountController {
    
    @Autowired
    private accountService accountService;

    @GetMapping("/getAccounts")
    public List<Account> getAccount(){
        return accountService.getAccounts();
    }

    @PostMapping("/addAccounts")
    public String addAccount(@RequestBody Map<String, String> request){

        accountService.addAccount(request.get("id"), request.get("name"), request.get("balance"), request.get("email"));
        return "Done";

    }
    
    @DeleteMapping("/deleteAccounts")
    public String deleteAccount(@RequestBody Map <String, String> request){
        return accountService.deleteAccount(Integer.valueOf(request.get("id")));
        
    }

}
