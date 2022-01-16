package org.estack.backend.dubbo.api.service;

import org.estack.backend.dubbo.server.api.ApiUserManageService;
import org.estack.backend.dubbo.server.pojo.Users;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;


@Service
public class UserManageService {

    @Reference(version = "1.0.0")
    private ApiUserManageService apiUserManageService;

    public boolean add(Users users){
        int result = this.apiUserManageService.addUsers(users);
        return result == 1;
    }
}
