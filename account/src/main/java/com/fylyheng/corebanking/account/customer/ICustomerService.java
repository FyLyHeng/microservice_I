package com.fylyheng.corebanking.account.customer;


import java.util.List;

public interface ICustomerService {

    Customer createNew(Customer account);
    List<Customer> listAccounts();
}
