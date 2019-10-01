package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App
{
    public static void main( String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        BeanLifecycleDemoBean lc=context.getBean("BEAN",BeanLifecycleDemoBean.class);
      //  System.out.println(lc);
        ((ConfigurableApplicationContext)context).close();
       // movie.print();

    }

}
