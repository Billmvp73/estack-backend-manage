package org.estack.backend.dubbo.server.service;

import org.estack.backend.dubbo.server.pojo.Properties;

public interface PropertiesManageService {

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
