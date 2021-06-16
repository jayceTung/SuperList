package com.list.trade.controller;

import com.list.list_user_api.user.User;
import com.list.list_user_api.user.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by super on 2021/6/16.
 */
@RestController
@RequestMapping("/trade")
public class TradeController {

    @Autowired
    private UserApi userApi;

    @RequestMapping(value = "/testTrade/{userid}",method = RequestMethod.GET)
    public String testTrade(@PathVariable Integer userid){
        User user= userApi.getUserById(userid);
        String name = user.getName();
        System.out.println("用户"+name+"下单成功....");
        return "用户"+name+"下单成功";
    }
}
