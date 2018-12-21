package dataType;

import util.Out;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class LongDemo {
    public static void testDecimal(){
        Long a = 10100L;
        Long total = 10000000L;
        double proportionDouble = a.doubleValue()/total.doubleValue();
        Out.println(proportionDouble);
        proportionDouble = new BigDecimal(proportionDouble).setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
        Out.println(proportionDouble * 100 + "%");
        NumberFormat nf = NumberFormat.getPercentInstance();
        nf.setMinimumFractionDigits(2);//控制保留小数点后几位，2：表示保留2位小数点
        Out.println(nf.format(proportionDouble));
    }
}
