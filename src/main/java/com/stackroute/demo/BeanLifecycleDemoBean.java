package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void customInit()
    {
        System.out.println("customInit() called");
    }

    public void customDestroy()
    {

        System.out.println("customDestroy() called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method after property set");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
}
