package com.wky.foo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: wangkunyang
 * @date 2022/01/08 09:59
 */
@ConfigurationProperties("foo")
public class FooProperties {

    private Integer id;
    private Integer name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }
}
