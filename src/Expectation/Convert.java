package Expectation;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2018/1/4.
 */
public class Convert {
    public static void main(String[] args){
        String a = "aaasdf1";
        try {
            BigDecimal a1 = new BigDecimal(a);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
    }
}
