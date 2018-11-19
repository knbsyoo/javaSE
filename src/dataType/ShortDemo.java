package dataType;

import util.Out;

/**
 * ShortDemo
 * Created by knbsyoo on 2018/4/14
 * 解析笔记：https://blog.csdn.net/qq_21397851/article/details/79930298
 */
public class ShortDemo {
    public static void test(){
        //初始化例子
        short  s_1 = 1;
        short s_2 = -1;
        String str_1 = "1";
        Short s1 = new Short(str_1);
        Short s2 = new Short(s_1);
        Short s3 = s_1;
        Short s4 = Short.parseShort(str_1);
        Short s5 = Short.valueOf(str_1);
        Out.println(s1 == s2);//fasle
        Out.println(s1 == s3);//fasle
        Out.println(s2 == s3);//fasle
        Out.println(s4 == s3);//true
        Out.println(s5 == s3);//true

        String str_2 = "0x21";
        Short s6 = Short.decode(str_2);//33
        Out.println(s6.toString());//33
        Out.println(Short.toString(s6.shortValue()));//33
        Out.println(s6.hashCode());//33
//        Out.println(Short.toUnsignedInt(s_1));//1
//        Out.println(Short.toUnsignedInt(s_2));//65535
//        Out.println(Short.toUnsignedLong(s_1));//1
//        Out.println(Short.toUnsignedLong(s_2));//65535
        Out.println(s4.equals(s1));//true
        //高位低位反转 正数
        Short s7 = 2;
        Short s8 = Short.reverseBytes(s7);
        Out.println(s8);//512
        //负数
        short s_3 = (short)-0B000000000000011;
        short s_4 = (short)-0B000001000000001;
        Out.println(s_4 == Short.reverseBytes(s_3));//true
        Out.println(s_4 );
        Integer i = 0B11111111111111111111111111111101;
        Short s_5 = i.shortValue();//去掉前面16位
        Out.println("i:" + i);
        //属性
        Out.println("MAX:" + Short.MAX_VALUE);
        Out.println("MIN:" + Short.MIN_VALUE);
//        Out.println("BYTES:" + Short.BYTES);
        Out.println("bit size:" + Short.SIZE);
        Out.println("primitive type:" + Short.TYPE);
    }
}
