package org.estack.backend.dubbo.api.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@ConfigurationProperties(prefix="spring.redis.cluster")
public class ClusterConfigurationProperties {
    private List<String> nodes;
    private Integer maxRedirects;
}
