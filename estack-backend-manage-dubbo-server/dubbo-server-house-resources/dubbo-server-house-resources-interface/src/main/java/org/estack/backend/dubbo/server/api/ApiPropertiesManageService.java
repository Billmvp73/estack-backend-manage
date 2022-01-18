package org.estack.backend.dubbo.server.api;

import org.estack.backend.dubbo.server.pojo.Properties;

public interface ApiPropertyManageService {

    /**
     * add new properties
     *
     * @param properties
     *
     * @return -1: the format of parameter is wrong
     * 0: fail to insert new properties into database
     * 1: succeed
     */
    int addProperties(Properties properties);
}
