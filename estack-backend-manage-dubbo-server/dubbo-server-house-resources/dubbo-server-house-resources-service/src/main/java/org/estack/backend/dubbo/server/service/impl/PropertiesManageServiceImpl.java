package org.estack.backend.dubbo.server.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.estack.backend.dubbo.server.pojo.Properties;
import org.estack.backend.dubbo.server.service.BaseServiceImpl;
import org.estack.backend.dubbo.server.service.PropertiesManageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PropertiesManageServiceImpl extends BaseServiceImpl implements PropertiesManageService {
    /**
     * add new properties
     *
     * @param properties
     *
     * @return -1: the format of parameter is wrong
     * 0: fail to insert new properties into database
     * 1: succeed
     */
    @Override
    public int addProperties(Properties properties){
        if(StringUtils.isBlank(properties.getPropertyType())){
            return -1;
        }
        System.out.println(properties.getStreet());
        return super.save(properties);
    }
}
