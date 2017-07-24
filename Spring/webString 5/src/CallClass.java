import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by randhir on 8/7/17.
 */
public class CallClass
{
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        DataClass dataClass=(DataClass)context.getBean("complexBean");
        dataClass.listDisplay();
        dataClass.setDiaply();
        System.out.println(dataClass.getComplexMap());
    }
}
