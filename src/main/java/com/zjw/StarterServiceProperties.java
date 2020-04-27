package com.zjw;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by xz on 2019/9/19.
 */

@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private String config;

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
