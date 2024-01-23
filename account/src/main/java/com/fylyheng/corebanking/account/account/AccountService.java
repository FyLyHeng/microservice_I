package com.fylyheng.corebanking.account.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {

    private final AccountRepo accountRepo;


    @Autowired
    public AccountService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }


    public Account createNew(Account customer) {
        return accountRepo.save(customer);
    }


    @Override
    public List<Account> listAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public Account getById(Long accountId) {
        return accountRepo.findById(accountId).orElseThrow( () -> new RuntimeException("Account Not Found"));
    }

}
