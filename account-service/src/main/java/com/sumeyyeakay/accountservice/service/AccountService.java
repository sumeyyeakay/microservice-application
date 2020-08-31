package com.sumeyyeakay.accountservice.service;


import com.sumeyyeakay.accountservice.model.Account;
import com.sumeyyeakay.accountservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account get(String id) {
        return accountRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Transactional
    public Account save(Account account) {
        return accountRepository.save(account);    }

    @Transactional
    public Account update(String id, Account account) {
        //Assert.isNull("Id connot be null");
        get(id);
        return accountRepository.save(account);
    }
    @Transactional
    public void delete(String id) {
        Account account = accountRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException());
        accountRepository.delete(account);
    }


}
