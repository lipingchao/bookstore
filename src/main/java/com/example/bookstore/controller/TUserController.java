package com.example.bookstore.controller;

import com.example.bookstore.pojo.TUser;
import com.example.bookstore.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @User lpc/李金超
 * @ClassName TUserController  类名
 * @Author AUSUA  作者
 * @Date 2020/4/22 13:27  时间
 * @Version 1.0 版本
 */
@Controller
public class TUserController {

    @Autowired
    private TUserService tUserService;

    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @RequestMapping("/toLogin")
    public String toLogin(TUser tUser){
        return null;
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/toRegister")
    public String toRegister(TUser tUser){

        return "redirect:/";
    }

}
