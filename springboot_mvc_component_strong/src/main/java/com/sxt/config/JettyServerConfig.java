package com.sxt.config;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JettyServerConfig {
    public ConfigurableServletWebServerFactory webServerFactory(){
        JettyServletWebServerFactory factory = new JettyServletWebServerFactory();
        return factory;
    }
}
