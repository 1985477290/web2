package com.xu.web2.dao;

import com.xu.web2.bean.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface AccountDao {
    Account selectAccountById(Integer id);
    List<Account> selectAllAccount();
    void insertAccountById(Account account);
    void deleteAccountById(Integer id);
    void updateAccountById(Account account);
}
