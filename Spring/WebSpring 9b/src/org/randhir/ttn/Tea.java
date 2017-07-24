package org.randhir.ttn;

/**
 * Created by randhir on 8/7/17.
 */
public class Tea implements HotDrink
{

    @Override
    public void prepareHotDrink() {
        System.out.println("Tea");
    }
     public Tea()
     {
         System.out.println("Tea constructor");
     }
     public void teaMethod()
     {
         System.out.println("Tea Method ");
     }
}
