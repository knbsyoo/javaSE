package math;

import util.Out;

import java.math.BigDecimal;

/**
 * Created by knbsyoo on 2018/3/7
 * Description
 */
public class MathTest {
    public static void test(){
        Double t1 = 100d;
//        Double t2 = (t1*100)/100;
//        Out.println("t2：" + t2);
        Out.println("t1：" + getDoubleValue(t1,1));
    }

    public static Double getDoubleValue(Double value, Integer digit) {
        if (digit <= 0d) {
            return 0d;
        }
        BigDecimal bd = new BigDecimal(value.toString()).setScale(digit, BigDecimal.ROUND_HALF_UP);
        return bd.doubleValue();
    }
}
