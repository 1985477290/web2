package com.xu.web2.service;

import com.xu.web2.bean.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface AccountService {
    Account selectAccountById(Integer id);
    List<Account> selectAllAccount();
    void insertAccountById(Account account);
    void deleteAccountById(Integer id);
    void updateAccountById(Account account);
}
