package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @program: enable-auto
 * @description:
 * @author: wangwenhong
 * @create: 2019-09-11 18:59
 **/
@EnableConfigurationProperties(HelloProperties.class)
public class HelloAutoConfiguration {
    public HelloAutoConfiguration() {
        System.out.println("-----------------------");
    }

    @Autowired
    HelloProperties helloProperties;


}
