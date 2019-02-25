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

    public void subendsoon(){
        BigDecimal total = new BigDecimal(106);
        BigDecimal valueTop3 = new BigDecimal(52);
        Out.println(valueTop3.divide(total));
//        Out.println( new BigDecimal(1).subtract(new BigDecimal(valueTop3).divide(new BigDecimal(total))).setScale(2, BigDecimal.ROUND_HALF_UP)  + "%");
    }

    public void stringSetBigDecimal(){
        String a = new String("0.01");
        BigDecimal total = new BigDecimal(a);
        Out.println(total);
    }

}
