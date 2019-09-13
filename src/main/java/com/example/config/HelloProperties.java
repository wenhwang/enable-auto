package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program: enable-auto
 * @description:
 * @author: wangwenhong
 * @create: 2019-09-11 19:02
 **/
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {

    private boolean enable;

    private String name;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
