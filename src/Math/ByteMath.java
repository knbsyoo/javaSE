package Math;

import Util.Out;

/**
 * Created by knbsyoo on 2018/3/15
 * Description：位移运算
 * 数据存储在内存中都是以二进制表示的，JDK自带的一些方法的实现含有位移运算，所以必须了解位运算。
 */
public class ByteMath {
    public static void main(String args[]){
        //以32位为例子，Java声明的为原码，进行位运算。
        int t1 = 0b00000000000000000000000000001011;
        int t2 = 0B01111111111111111111111111111111;
        int t3 = 0B10000000000000000000000000000001;
        Out.println("按位与，符号位一致：" + Integer.toBinaryString(t1&t2));
        Out.println("按位与，符号位不一致：" + Integer.toBinaryString(t1&t3));
        Out.println("按位异或，符号位一致：" + Integer.toBinaryString(t1^t2));//相同位则为0，不同位则为1
        Out.println("按位异或，符号位不一致：" + Integer.toBinaryString(t1^t3));
        Out.println("按位取反，正整数：" + Integer.toBinaryString(~t1));
        Out.println("按位取反，正整数：" + ~t1);
        Out.println("按位取反，负整数：" + Integer.toBinaryString(~t3));
        Out.println("按位取反，负整数：" + ~t3);
        Out.println("左移2位，正整数：" +  Integer.toBinaryString(t1<<2));
        Out.println("左移2位，负整数：" +  Integer.toBinaryString(t3<<2));
        Out.println("带符号右移2位：" + Integer.toBinaryString(t1>>2));
        Out.println("无符号右移2位：" + Integer.toBinaryString(t1>>>2));
        Out.println("带符号右移2位：" + Integer.toBinaryString(t3>>2));
        Out.println("无符号右移2位：" + Integer.toBinaryString(t3>>>2));
    }
}
