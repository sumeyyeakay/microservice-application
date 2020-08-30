package com.sumeyyeakay.accountservices.api;

import com.sumeyyeakay.accountservices.model.Account;
import com.sumeyyeakay.accountservices.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController
{
    @Autowired
    AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }
    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }
    @PutMapping
    public ResponseEntity<Account> update(Account account) {
        return ResponseEntity.ok(accountService.update(account));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }


}
