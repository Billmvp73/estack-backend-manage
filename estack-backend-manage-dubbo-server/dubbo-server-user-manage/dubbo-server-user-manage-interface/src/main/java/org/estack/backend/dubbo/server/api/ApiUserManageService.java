package org.estack.backend.dubbo.server.api;

import org.estack.backend.dubbo.server.pojo.Users;

public interface ApiUserManageService {
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
