package DataType;

import Util.Out;

/**
 * Created by knbsyoo on 2018/3/1
 * Description
 */
public class IntegerType {
    public static void main(String[] args){
        //缓存策略的好处：避免对象的重复创建，节约内存，提高效率
        //IntegerCache内部静态类，缓存Integer数组，-128-high
        // high可以从JVM启动的时候设置参数获取值（范围127-MAX），默认127。

        // 0x7fffffff 16进制 转换为 2进制 0111,1111,1111,1111,1111,1111,1111,1111
        int max = Integer.MAX_VALUE;
        // 0x80000000 16进制转换为2进制 1000,0000,0000,0000,0000,0000,0000,0000
        // 取补码 1,0000,0000,0000,0000,0000,0000,0000,0000
        int mix = Integer.MIN_VALUE;
        Class<Integer>  type = Integer.TYPE;
        Out.println("max：" + max);
        Out.println("mix：" + mix);
        Out.println("base type:" +  type);

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
    }
}
