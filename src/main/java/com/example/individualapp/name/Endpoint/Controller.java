package com.example.individualapp.name.Endpoint;

import com.example.individualapp.name.Model.Account;
import com.example.individualapp.name.Services.AccountServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins="*",allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class Controller {

    @Autowired
    public AccountServices services;

    @GetMapping("/findAll")
    public List<Account>  findAllAccounts(){
        return services.getAllAccounts();
    }

    @GetMapping
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<Account> findAccount(@PathVariable String id){
        return services.findAccount(id);
    }

    @GetMapping
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public List<Account> findAccountByName(@RequestParam String firstname){
        return services.findAccountByName(firstname);
    }

    @PostMapping("/add")
    public String createAccount(@RequestParam("firstname") String firstname, @RequestParam("surname") String surname, @RequestParam("email") String email, @RequestParam("notes") String notes){
        Account account = new Account(firstname, surname, email, notes);
        return services.createAccount(account);

    }

    @PostMapping("/update")
    public String updateAccount(@RequestParam("id") String id, @RequestParam("firstname") String firstname, @RequestParam("surname") String surname, @RequestParam("email") String email, @RequestParam("notes") String notes){
        Account account = new Account(firstname, surname, email, notes);
        account.setId(id);
        return services.updateAccount(account);
    }

    @DeleteMapping
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public String deleteAccount(@PathVariable String id){
        return services.deleteAccount(id);
    }

}
