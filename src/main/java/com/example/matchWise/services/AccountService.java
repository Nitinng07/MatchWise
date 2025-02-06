package com.example.matchWise.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.matchWise.model.Account;
import com.example.matchWise.repositories.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository ;

    public Account save(Account account) {
        return accountRepository.save(account) ;
    }

    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email) ;
    }

    

}
