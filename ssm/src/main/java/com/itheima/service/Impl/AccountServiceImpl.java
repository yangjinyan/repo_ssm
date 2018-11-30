package com.itheima.service.Impl;

import com.itheima.dao.AccountDao;
import com.itheima.domain.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;
    @Override
    public List<Account> findAll() {
        System.out.println("业务层查询所有。。。");
        List<Account> all = accountDao.findAll();
        System.out.println("all = " + all);
        return all ;
    }

    @Override
    public void save(Account account) {
        System.out.println("业务层保存用户。。");
        accountDao.save(account);
    }
}
