package com.list.list_user_api.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "study-user")
public interface UserApi {
    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    User getUserById(Integer id);
}