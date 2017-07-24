package org.randhir.ttn;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by randhir on 8/7/17.
 */
public class MainClass
{
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Restaurant restaurant=(Restaurant)context.getBean("teaRestaurant");
        restaurant.getTea().prepareHotDrink();
    }
}
