package org.estack.backend.dubbo.server;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class DubboProvider {
    public static void main(String[] args){
        new SpringApplicationBuilder(DubboProvider.class)
                .web(WebApplicationType.NONE) // non-web application
                .run(args);
    }
}
