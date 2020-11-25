package com.xu.web2.service.impl;


import com.xu.web2.bean.Account;
import com.xu.web2.dao.AccountDao;
import com.xu.web2.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public Account selectAccountById(Integer id){
        return accountDao.selectAccountById(id);
    }

    public List<Account> selectAllAccount(){
        return accountDao.selectAllAccount();
    }

    public void insertAccountById(Account account){
        accountDao.insertAccountById(account);
    }

    public void deleteAccountById(Integer id){
        accountDao.deleteAccountById(id);
    }

    public void updateAccountById(Account account){
        accountDao.updateAccountById(account);
    }
}
