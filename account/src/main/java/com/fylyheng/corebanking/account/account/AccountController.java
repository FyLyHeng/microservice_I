package com.fylyheng.corebanking.account.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/account")
public class AccountController {

    private final IAccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    ResponseEntity<?> createNew(@RequestBody Account account) {
        var data = accountService.createNew(account);
        return ResponseEntity.ok(data);
    }

    @GetMapping("list")
    ResponseEntity<?> list() {
        return ResponseEntity.ok(accountService.listAccounts());
    }

}
