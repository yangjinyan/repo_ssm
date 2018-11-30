package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.stereotype.Service;
import java.util.List;


public interface AccountService {
    public List<Account> findAll();
    public void save(Account account);
}
