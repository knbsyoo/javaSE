package dataType;


import util.Out;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 * Description 时间日期类
 */
public class DateDemo {
    public static void test(){
        //java.sql.Date 和 java.util.Date
//        java.util.Date d1 = new java.util.Date();
//        java.sql.Date d2 = new Date(d1.getTime());
//        Out.println("d1:" + d1.toString());
//        Out.println("d2:" + d2.toString());
        Out.println(addDate(-1));
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,-11);
        calendar.set(Calendar.DAY_OF_MONTH,1);
        new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }


    /**
     * 获取当前之前的日期
     * @param mun 天数
     * @return
     */
    public static java.sql.Date addDate(int mun){
        return new java.sql.Date(new java.util.Date().getTime() + mun*1000*3600*24);
    }

    public static void testMonth(){
        Date now = new Date();
        for(int i=-12; i < 0; i++){
            String month = stepMonth(now, i);
            Out.println(month);
        }
    }
    public static String stepMonth(Date sourceDate, int month) {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        Calendar c = Calendar.getInstance();
        c.setTime(sourceDate);
        c.add(Calendar.MONTH, month);
        return format.format(c.getTime());
    }


    public static String getYesterday(){
        String yesterday =  new SimpleDateFormat("yyyyMMdd").format(new Date(new Date().getTime() - 24*60*60*1000));
        Out.println(yesterday);
        return yesterday;
    }
}
