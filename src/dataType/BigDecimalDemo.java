package dataType;

import util.Out;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public void compare(){
        BigDecimal a1 = new BigDecimal(10);
        BigDecimal a2 = new BigDecimal(111);
        Out.println(a1.compareTo(a2));
    }

    public void setScale(){
        BigDecimal a1 = new BigDecimal(10213123.1112);
        BigDecimal a2 = new BigDecimal(a1.doubleValue()/10000);
        a2.setScale(2);
        Out.println(a2);
    }
}
