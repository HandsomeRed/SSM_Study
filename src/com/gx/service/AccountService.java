package com.gx.service;

import com.gx.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public interface AccountService {
    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);
}
