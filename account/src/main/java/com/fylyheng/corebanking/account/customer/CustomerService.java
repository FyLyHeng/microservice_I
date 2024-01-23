package com.fylyheng.corebanking.account.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private final CustomerRepo customerRepo;


    @Autowired
    public CustomerService(CustomerRepo accountRepo) {
        this.customerRepo = accountRepo;
    }


    public Customer createNew(Customer customer) {
        return customerRepo.save(customer);
    }


    @Override
    public List<Customer> listAccounts() {
        return customerRepo.findAll();
    }
}
