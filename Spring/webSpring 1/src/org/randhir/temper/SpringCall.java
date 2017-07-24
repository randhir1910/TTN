package org.randhir.temper;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by randhir on 8/7/17.
 */
public class SpringCall
{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
      //  Database database=(Database)applicationContext.getBean("database1");
      //  System.out.println(database.getName()+"  "+database.getPort());

    }
}
