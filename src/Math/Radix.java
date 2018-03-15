package Math;

import Util.Out;

/**
 * Created by knbsyoo on 2018/3/9
 * Description JDK1.7新特性 用二进制来表示整数（byte,short,int和long）
 */
public class Radix {
    public static void main(String[] agrs){
        //java中的整数，像：1，2，234，1000等默认都是int类型的，在-128~+127范围内的值可以直接赋值给byte类型，自动识别为byte，同理，在-32768~+32767之间值也可以直接赋值给short
        byte t1 = 0b01111111;//未指定类型，默认为int类型，0b01111111，缺省位默认填充0，实际上为：0b00000000000000000000000001111111
        byte t1a = 0b00000000000000000000000001111111;
        Out.println("t1:" + t1);
        Out.println("t1a:" + t1a);
        byte t2 = (byte)0b10000000;
        int t2a = 0b000000000000000000000000100000000;
//            byte t2b = 0b000000000000000000000000100000000; //未指定类型，默认int，解析为256，无法转换为byte类型
        Out.println("t2:" + t2);
        Out.println("t2a:" + t2a);
        short t3 = (short)0b0111111111111111;
        Out.println("t3:" + t3);
        short t4 = (short)0b1000000000000000;
        Out.println("t4:" + t4);
        long t5 = 0b0111111111111111111111111111111111111111111111111111111111111111L;
        Out.println("t5:" + t5);
        long t6 = 0b1000000000000000000000000000000000000000000000000000000000000000L;
        Out.println("t6:" + t6);
    }
}
