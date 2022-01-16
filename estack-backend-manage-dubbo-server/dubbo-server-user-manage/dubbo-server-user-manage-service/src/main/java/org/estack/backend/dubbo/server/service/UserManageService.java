package org.estack.backend.dubbo.server.service;

import org.estack.backend.dubbo.server.pojo.Users;


public interface UserManageService {
    /**
     * add new user
     *
     * @param users
     *
     * @return -1: the format of parameter is wrong
     * 0: fail to insert new user into database
     * 1: succeed
     */
    int addUsers(Users users);
}
