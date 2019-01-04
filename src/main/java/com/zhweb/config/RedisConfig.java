package com.zhweb.config;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: ZH
 * @Date: 2019/1/4 0004 10:33
 * @Description:
 */

public class RedisConfig {
    private Logger jedisConfigLogger= LoggerFactory.getLogger(RedisConfig.class);

    @Value("${spring.redis.host}")
    private String host;

    @Value("${spring.redis.port}")
    private Integer port;

    @Value("${spring.redis.timeout}")
    private Integer timeout;

    public Logger getJedisConfigLogger() {
        return jedisConfigLogger;
    }

    public void setJedisConfigLogger(Logger jedisConfigLogger) {
        this.jedisConfigLogger = jedisConfigLogger;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

}
