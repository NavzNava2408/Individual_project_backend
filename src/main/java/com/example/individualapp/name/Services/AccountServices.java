package com.example.individualapp.name.Services;


import com.example.individualapp.name.Model.Account;
import com.example.individualapp.name.Repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AccountServices {


    @Autowired
    private AccountRepo rep;

    public Optional<Account> findAccount(String id){
        return rep.findById(id);
    }


    public List<Account> findAccountByName(String firstname) {return rep.findAccountByFirstname(firstname);}

    public List<Account> getAllAccounts(){
        return rep.findAll();
    }

    public String createAccount(Account account){
        rep.save(account);
        return "Account Created";
    }

    public String updateAccount(Account account){
        rep.save(account);
        return "Account Updated";

    }

    public String  deleteAccount(String id){
        rep.deleteById(id);
        return "Account Deleted";
    }








}
