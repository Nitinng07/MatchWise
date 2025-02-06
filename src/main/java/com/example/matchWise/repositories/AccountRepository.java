package com.example.matchWise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.matchWise.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {

    Account findByEmail(String email);

}
