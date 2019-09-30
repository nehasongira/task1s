package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App
{
    public static void main( String[] args)
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie=context.getBean("movie",Movie.class);
       movie.print();
      //  System.out.println( "Hello World!" );
        XmlBeanFactory factory=new XmlBeanFactory (new ClassPathResource("beans.xml"));
        Movie movie1=factory.getBean("movie",Movie.class);
        movie1.print();

    }

}
