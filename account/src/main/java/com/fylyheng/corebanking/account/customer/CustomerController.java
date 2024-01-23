package com.fylyheng.corebanking.account.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final ICustomerService customerService;

    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    ResponseEntity<?> createNew(@RequestBody Customer account) {
        var data = customerService.createNew(account);
        return ResponseEntity.ok(data);
    }

    @GetMapping("list")
    ResponseEntity<?> list() {
        return ResponseEntity.ok(customerService.listAccounts());
    }

}
