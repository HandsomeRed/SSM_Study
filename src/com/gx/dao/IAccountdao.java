package com.gx.dao;

import com.gx.domain.Account;

import java.util.List;

public interface IAccountdao {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
