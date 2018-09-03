package com.example.individualapp.name.Repository;
import com.example.individualapp.name.Model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface AccountRepo extends MongoRepository<Account, String> {

    public List<Account> findAccountByFirstname(String name);

}
