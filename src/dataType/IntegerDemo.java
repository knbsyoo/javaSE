package dataType;

import util.Out;

/**
 * Created by knbsyoo on 2018/3/1
 * Description 常用Integer方法操作解析
 */
public class IntegerDemo {
    public static void test(){
        //compareUnsigned
//        Integer a0 = 0b00000000000000000000000000000111;
//        Integer a1 = 0b10000000000000000000000000000000;
//        Integer a2 = 0b00000000000000000000000000000011;
//        Integer a3 = 0b10000000000000000000000000000001;
//        Integer a4 = 0b10000000000000000000000000000011;
//        Integer a5 = 0B00000000000000000000000000000000;
//        int r1 = Integer.compareUnsigned(a1.intValue(),a2.intValue());
//        int r2 = Integer.compareUnsigned(a1.intValue(),a3.intValue());
//        int r3 = Integer.compareUnsigned(a3.intValue(),a4.intValue());
//        Out.println("a1,a2,a3,a4,a5：" + a1 +"," + a2 + "," + a3 + "," + a4 + ",a5:" + a5);
//        Out.println("r1,r2,r3：" + r1 +"," + r2 + "," + r3);
//
//        //init method
//        Out.println(Integer.numberOfLeadingZeros(a1));
//        Out.println(Integer.numberOfLeadingZeros(a3));
//        Integer a11 = 3;
//        Integer a6 = Integer.parseInt("11",2);
//        Integer a7 = Integer.parseUnsignedInt("80000000",16);
//        Integer a9 = Integer.valueOf(3);
//        Integer a10 = new Integer(3);
//        boolean b1 = a6==a9;//true
//        boolean b2 = a6==a11;//true
//        boolean b3 = a6==a10;//false
//        Out.println("b1:" + b1 + ";b2:" + b2 + ";b3:" +b3);

        //some toString method
//        String s1 = Integer.toString(-10,2);
//        Out.println("s1:" + s1);
//        String s1 = Integer.toBinaryString(100);
//        String s2 = Integer.toOctalString(100);
//        String s3 = Integer.toHexString(100);
//        Out.println("s1,s2,s3:" + s1 + "," + s2 + "," +s3);
        for(int i = 0;i<65536;i++){
            int q = (i * 52429) >>> (16+3);//相当于q = i/10;
            int j = i/10;
            if(q != j){
                Out.println(false);
            }
        }
    }
}
