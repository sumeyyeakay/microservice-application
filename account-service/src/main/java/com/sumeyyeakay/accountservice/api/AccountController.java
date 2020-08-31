package com.sumeyyeakay.accountservice.api;


import com.sumeyyeakay.accountservice.model.Account;
import com.sumeyyeakay.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.save(account));
    }

    @PutMapping
    public ResponseEntity<Account> update(
            @PathVariable("id") String id,
            @RequestBody Account account)
    {
        return ResponseEntity.ok(accountService.update(id,account));
    }

    @DeleteMapping
    public void delete(String id) {
        accountService.delete(id);
    }


}
