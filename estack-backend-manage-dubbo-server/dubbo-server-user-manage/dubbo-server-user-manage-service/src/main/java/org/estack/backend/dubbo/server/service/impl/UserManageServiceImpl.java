package org.estack.backend.dubbo.server.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.estack.backend.dubbo.server.pojo.Users;
import org.estack.backend.dubbo.server.service.UserManageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserManageServiceImpl extends BaseServiceImpl implements UserManageService{
    /**
     * add new user
     *
     * @param users
     *
     * @return -1: the format of parameter is wrong
     * 0: fail to insert new user into database
     * 1: succeed
     */

    @Override
    public int addUsers(Users users){
        //verification logic
        if(StringUtils.isBlank(users.getEmail())){
            return -1;
        }
        return super.save(users);
    }
}
