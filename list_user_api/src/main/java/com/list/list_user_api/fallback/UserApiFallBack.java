package com.list.list_user_api.fallback;

import com.list.list_user_api.user.User;
import com.list.list_user_api.user.UserApi;
import org.springframework.stereotype.Component;

@Component
public class UserApiFallBack implements UserApi {

    @Override
    public User getUserById(Integer id) {
        System.out.println("调用降级方法");
        User user = new User();
        user.setName("熔断用户");
        return user;
    }
}