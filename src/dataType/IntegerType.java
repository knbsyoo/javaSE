package dataType;

import util.Out;

/**
 * Created by knbsyoo on 2018/3/1
 * Description 常用Integer方法操作解析
 */
public class IntegerType {
    public static void test(){
        //缓存策略的好处：避免对象的重复创建，节约内存，提高效率
        //IntegerCache内部静态类，缓存Integer数组，-128-high
        // high可以从JVM启动的时候设置参数获取值（范围127-MAX），默认127。
        int max = Integer.MAX_VALUE;// 0x7fffffff 16进制 转换为 2进制 0111,1111,1111,1111,1111,1111,1111,1111
        int mix = Integer.MIN_VALUE;// 0x80000000 16进制转换为2进制 1000,0000,0000,0000,0000,0000,0000,0000// 取补码 1,0000,0000,0000,0000,0000,0000,0000,0000
        Class<Integer>  type = Integer.TYPE;
        int size = Integer.SIZE;
        int byteSize = Integer.BYTES;
        Out.println("max：" + max);
        Out.println("mix：" + mix);
        Out.println("base type:" +  type);
        Out.println("size：" + size);
        Out.println("byteSize：" + byteSize);

        //进制转换
        Integer s1 = -128;
        Out.println("十进制：" + Integer.toString(s1));
        Out.println("二进制：" + Integer.toString(s1,2));
        Out.println("八进制：" + Integer.toString(s1,8));
        Out.println("十六进制：" +Integer.toString(s1,16));
        Out.println("三十二进制：" + Integer.toString(s1,32));
        Out.println("二进制：" + Integer.toBinaryString(s1));
        Out.println("八进制：" + Integer.toOctalString(s1));
        Out.println("十六进制：" +Integer.toHexString(s1));
        Integer t2 = 0B11111111111111111111111110000000;
        Out.println("t2：" +t2);
        Integer s2 = -128;
        Out.println("二进制：" + Integer.toUnsignedString(s2,2));
        Out.println("四进制：" + Integer.toUnsignedString(s2,4));
        Out.println("八进制：" + Integer.toUnsignedString(s2,8));
        Out.println("十进制：" + Integer.toUnsignedString(s2,10));
        Out.println("十六进制：" + Integer.toUnsignedString(s2,16));
        Out.println("三十二进制：" + Integer.toUnsignedString(s2,32));

        //math
        int math1 = 10,math2 = 20;
        int math_min = Integer.min(math1,math2);
        int math_max = Integer.max(math1,math2);
        int math_sum = Integer.sum(math1,math2);
        Out.println("math_min：" + math_min );
        Out.println("math_max：" + math_max);
        Out.println("math_sum：" + math_sum);


        //反字节
        int re1 = 10;
        int re2 = Integer.reverse(re1);
        Out.println("re1：" + Integer.toUnsignedString(re1,2));
        Out.println("re2：" + Integer.toUnsignedString(re2,2));

        //取符号位
        Out.println("-1:" + Integer.signum(0x7fffffff));
        Out.println("1:" +Integer.signum(0x80000001));

        //字符串转换为数值
        Out.println(Integer.parseInt("100"));
        Out.println(Integer.parseInt("100",2));
        Out.println(Integer.valueOf("100",2));
        Out.println(Integer.valueOf("100"));

        Out.println(Integer.decode("0x7fffffff"));//解码16进制和8进制，8进制以0开头，16进制以0x,0X,#开头
        Out.println(Integer.decode("011"));

        //比较
        Integer com_t1 = 10;
        Integer com_t2 = 100;
        Out.println(com_t1.compareTo(com_t2));

        //高位向地位转换
        Double d = 3.1d;
        Integer i = Integer.valueOf(d.intValue());
        Out.println("3.1d转换为Integer类型：" + i);
        Long l = 9223372036854775807L;
        Long l2 = 0x8000000000000000L;
        l.byteValue();
        i = Integer.valueOf(l.intValue());
        //111111111111111111111111111111111111111111111111111111111111111
        //1111，1111，1111，1111，1111，1111，1111，1111（截取低位）
        Out.println("9223372036854775807L转换为Integer：" + i);//结果-1
        i = Integer.valueOf(l2.intValue());
        //1000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000，0000
        //0000,0000,0000,0000,0000,0000,0000,0000
        Out.println("0x8000000000000000L转换为Integer：" + i);//结果0
    }
}
