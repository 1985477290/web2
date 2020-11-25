package com.xu.web2.controller;

import com.xu.web2.bean.Account;
import com.xu.web2.service.AccountService;
import com.xu.web2.util.TestId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    //查询所有账户
    @RequestMapping("/selectAllAccount")
    public String selectAllAccount(){
        System.out.println("1111111111111111");
        List<Account> list=accountService.selectAllAccount();
        return "success";
    }

    //按账户ID查询账户
    @RequestMapping("/selectAccountById")
    public String selectAccountById(@RequestParam("id") Integer id){
        Account account=accountService.selectAccountById(id);
        return "success";
    }

    //增加账户
    @RequestMapping("/insertAccountById")
    public String insertAccountById(@RequestBody Account account) throws Exception {
        TestId.testId(account);
        accountService.insertAccountById(account);
        return "success";
    }
    //删除账户
    @RequestMapping("/deleteAccountById")
    public String deleteAccountById(@RequestParam("id") Integer id){
        accountService.deleteAccountById(id);
        return "success";
    }

    //修改账户
    @RequestMapping("/updateAccountById")
    public String updateAccountById(@RequestBody Account account){
        accountService.updateAccountById(account);
        return "success";
    }

}
