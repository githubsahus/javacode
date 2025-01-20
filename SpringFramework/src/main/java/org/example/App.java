package org.example;

import config.configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Java based configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(configuration.class);
        Alien obj = context.getBean(Alien.class);
        obj.code();
//        DesktopCustom dt = context.getBean(DesktopCustom.class);
//        DesktopCustom dt1 = context.getBean(DesktopCustom.class);
//        dt.code();

        /*XML Based configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.setAge(10);
        System.out.println(obj.getAge());
        obj.code();

        Alien obj2 = (Alien) context.getBean("alien");
        System.out.println(obj2.getAge());*/
    }
}
