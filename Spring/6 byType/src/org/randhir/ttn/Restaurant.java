package org.randhir.ttn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by randhir on 8/7/17.
 */
public class Restaurant
{
    public HotDrink getHotDrink1() {
        return hotDrink1;
    }

    public void setHotDrink1(HotDrink hotDrink1) {
        this.hotDrink1 = hotDrink1;
    }

    private HotDrink hotDrink1;
    public Tea getTea() {
        return tea;
    }


    public void setTea(Tea tea) {
        this.tea = tea;
    }

  private   Tea tea;

    public ExpressTea getExpressTea() {
        return expressTea;
    }

    public void setExpressTea(ExpressTea expressTea) {
        this.expressTea = expressTea;
    }

    private ExpressTea expressTea;

    public HotDrink getHotDrink() {
        return hotDrink;
    }

    public void setHotDrink(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    private HotDrink hotDrink;

}
