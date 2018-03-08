package DataType;

import java.math.BigDecimal;

/**
 * Created by knbsyoo on 2018/2/28
 * Description: 熟悉Byte数据类型及
 */
public class ByteType {


    public static void main(String[] args){
        //Byte8位，第一位为符号位。
        Byte max = Byte.MAX_VALUE;//01111111-> 127
        out("Byte最大值：" + max);
        Byte mix = Byte.MIN_VALUE;//11111111-> -128 负数使用补码表示，在原码的基础上（不包含符号位）取反加1
        out("Byte最小值：" + mix);
        Class<Byte> type = Byte.TYPE;
        out("Byte对应的基础数据类型：" + type);
        int size = Byte.SIZE;
        out("Byte长度：" + size);

        //类型转换
        String maxStr = max.toString();
        out("maxStr=" + maxStr );
        byte byte1 = -1;
        //valueOf()方法调用ByteCache 内部私有类，初始化Byte数组，范围-128-127，可以直接从类内部获取Byte对象。
        Byte test1  = Byte.valueOf(byte1);
        out("test1：" + test1);
        try {
            Byte test2 = Byte.parseByte("123");//parseByte()返回byte类型，byte自动装箱转换为Byte。
            out("test2：" + test2);
        }catch (NumberFormatException e){
            out("get a NumberFormatException at line 28");
        }
        try {
            Byte test3 = Byte.parseByte("1231");
            out("test3：" + test3);
        }catch (NumberFormatException e){
            out("get a NumberFormatException at line 34");
        }
        try {
            Byte test3 = Byte.parseByte("11",2);
            out("test3：" + test3);
        }catch (NumberFormatException e){
            out("get a NumberFormatException at line 40");
        }
        try {
            Byte test3 = Byte.parseByte("1231");
            out("test3：" + test3);
        }catch (NumberFormatException e){
            out("get a NumberFormatException at line 46");
        }

        //8,10,16进制解码转换为Byte，调用Integer的decode()
        try {
            Byte test4 = Byte.decode("51");//10进制
            out("10进制：" + test4);
            Byte test5 = Byte.decode("-51");//10进制
            out("10进制：" + test5);
            Byte test6 = Byte.decode("063");//8进制以0开头
            out("8进制：" + test6);
            Byte test7 = Byte.decode("-063");//待符号的8进制，根据实现的代码逻辑，可以带负号
            out("8进制：" + test7);
            Byte test8 = Byte.decode("0x33");//16进制，以0X或者0x开头
            out("16进制：" + test8);
            Byte test9 = Byte.decode("-0x33");
            out("16进制：" + test9);
        }catch (NumberFormatException e){
            out("get a NumberFormatException at line 52 to line 63");
        }

        //显示转换 低-》高
        byte test10 = 5;
        Byte test11 = Byte.valueOf(test10);
        short test12 = test11.shortValue();
        int test13 = test11.intValue();
        long test14 = test11.longValue();
        float test15 = test11.floatValue();
        double test16 = test11.doubleValue();

        //hashCode
        int hashCode = test11.hashCode();
        out("hashCode：" + hashCode);

        //比较 实现Comparable接口，重写了compareTo()
        byte test17 = 7;
        byte test18 = 4;
        out(test11.equals(test10));//自动装箱
        out(test11.compareTo(test17));
        out(test11.compareTo(test18));
    }

    private static void out(Object o){
        System.out.println(o);
    }
}
