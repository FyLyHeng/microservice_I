package com.fylyheng.corebacking.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/loan")
public class LoanController {

    private final ILoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping
    ResponseEntity<?> createNew(@RequestBody Loan loan) {
        var data = loanService.createNew(loan);
        return ResponseEntity.status(HttpStatus.CREATED).body(data);
    }

    @GetMapping("/list")
    ResponseEntity<?> list() {
        return ResponseEntity.ok(loanService.listAccounts());
    }

    @GetMapping("/{loanId}")
    ResponseEntity<?> getById(@PathVariable Long loanId) {
        return ResponseEntity.ok(loanService.getById(loanId));
    }

}
