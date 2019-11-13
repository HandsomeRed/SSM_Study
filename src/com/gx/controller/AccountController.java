package com.gx.controller;

import com.gx.domain.Account;
import com.gx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AccountController {

    @Autowired   //按类型注入
    private AccountService accountService;

    @RequestMapping("/account/findAll")
    public String findAll(Integer i){
        System.out.println("Controller表现层：查询所有账户...");
        //List<Account> list = accountService.findAll();
        System.out.println("接受到前台传来参数"+i);
        return "list";  //在视图解析器中配置了前缀后缀
    }
}
