package com.gx.service.Impl;

import com.gx.domain.Account;
import com.gx.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Override
    public List<Account> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("Service业务层：保存帐户...");
    }
}
