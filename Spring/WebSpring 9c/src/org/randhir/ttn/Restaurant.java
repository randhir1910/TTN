package org.randhir.ttn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by randhir on 8/7/17.
 */
public class Restaurant
{
    @Autowired
    public Restaurant(Tea tea)
    {
        System.out.println("Restaurant constructor");
        this.tea=tea;
    }

    private   Tea tea;
    public void teaMethod()
    {
     tea.teaMethod();
    }

}
