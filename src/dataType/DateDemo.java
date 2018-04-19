package dataType;


import util.Out;

import java.sql.Date;

/**
 * Description 时间日期类
 */
public class DateDemo {
    public static void test(){
        //java.sql.Date 和 java.util.Date
        java.util.Date d1 = new java.util.Date();
        java.sql.Date d2 = new Date(d1.getTime());
        Out.println("d1:" + d1.toString());
        Out.println("d2:" + d2.toString());
        Out.println(addDate(-1));
    }


    /**
     * 获取当前之前的日期
     * @param mun 天数
     * @return
     */
    public static java.sql.Date addDate(int mun){
        return new java.sql.Date(new java.util.Date().getTime() + mun*1000*3600*24);
    }
}
