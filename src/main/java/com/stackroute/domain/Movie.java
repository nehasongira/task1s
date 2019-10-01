package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie  {

    Actor actor;


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void print()
    {
        actor.prints();
    }



}
