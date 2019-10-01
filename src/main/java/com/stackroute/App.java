package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class App
{
    public static void main( String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = context.getBean("movie", Movie.class);
        Movie movie1 = context.getBean("movie1", Movie.class);
        Movie movie2 = context.getBean("movie2", Movie.class);
        Movie movie3 = context.getBean("movie2", Movie.class);
        Movie movie4= context.getBean("Movie2", Movie.class);
        movie.print();
        movie1.print();
        movie2.print();
        movie4.print();
        if (movie2 == movie3)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }

}
