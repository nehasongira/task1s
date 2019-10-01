package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware,BeanFactoryAware {



    public BeanFactory getBean() {
        return bean;
    }

    public String getName() {
        return name;
    }

    public Movie getMoviecontext() {
        return moviecontext;
    }

    ApplicationContext context;
    BeanFactory bean;
    String name;
    Movie moviecontext;
    Actor actor;

    public ApplicationContext getContext() {
        return context;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void print()
    {
        actor.prints();
    }




    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
      this.context=applicationContext;
        moviecontext= (Movie)context.getBean("movie",Movie.class);
        moviecontext.print();
    }

    @Override
    public void setBeanName(String bean) {
        System.out.println(name);
    }

    @Override
    public void setBeanFactory(BeanFactory bean) throws BeansException {
        this.bean = bean;
        moviecontext= (Movie)bean.getBean("movie",Movie.class);
        moviecontext.print();
    }
}
