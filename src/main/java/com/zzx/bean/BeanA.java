package com.zzx.bean;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
@Component
public class BeanA {
    private String property = "bean a";

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public BeanA() {
        this.property = "hi";
    }
}
