package org.estack.backend.dubbo.server.api;

import com.alibaba.dubbo.config.annotation.Service;
import org.estack.backend.dubbo.server.pojo.Properties;
import org.estack.backend.dubbo.server.service.PropertiesManageService;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0")
public class ApiPropertiesManageServiceImpl implements ApiPropertiesManageService{
    @Autowired
    private PropertiesManageService propertiesManageService;

    @Override
    public int addProperties(Properties properties){
        return this.propertiesManageService.addProperties(properties);
    }
}
