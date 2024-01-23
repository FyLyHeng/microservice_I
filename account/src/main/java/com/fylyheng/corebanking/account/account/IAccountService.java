package com.fylyheng.corebanking.account.account;

import com.fylyheng.corebanking.account.customer.Customer;

import java.util.List;

public interface IAccountService {

    Account createNew(Account account);
    List<Account> listAccounts();

    Account getById(Long accountId);
}
