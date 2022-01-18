package org.estack.backend.dubbo.api.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.estack.backend.dubbo.server.pojo.Properties;
import org.springframework.stereotype.Service;
import org.estack.backend.dubbo.server.api.ApiPropertiesManageService;

@Service
public class PropertiesManageService {
    @Reference(version = "1.0.0")
    private ApiPropertiesManageService apiPropertiesManageService;

    public boolean add(Properties properties){
        int result = this.apiPropertiesManageService.addProperties(properties);
        return result == 1;
    }
}
