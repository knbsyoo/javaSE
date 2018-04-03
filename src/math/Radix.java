package math;

import util.Out;

/**
 * Created by knbsyoo on 2018/3/9
 * Description JDK1.7新特性 用二进制来表示整数（byte,short,int和long）
 */
public class Radix {
    public static void test(){
        //java中的整数，像：1，2，234，1000等默认都是int类型的，在-128~+127范围内的值可以直接赋值给byte类型，自动识别为byte，同理，在-32768~+32767之间值也可以直接赋值给short
        byte t1 = 0b01111111;//127,未指定类型，默认为int类型，0b01111111，缺省位默认填充0，实际上为：0b00000000000000000000000001111111
        byte t1a = 0b00000000000000000000000001111111;//127
        byte t2 = (byte)0b10000000;//-128
        int t2a = 0b000000000000000000000000100000000;//256
        byte t2b = 0b11111111111111111111111110000000;//-128,补码为：0b00000000000000000000000010000000
        int t2c = 0b100000000;//256
        Out.println("t1:" + t1);
        Out.println("t1a:" + t1a);
        Out.println("t2:" + t2);
        Out.println("t2a:" + t2a);
        Out.println("t2b:" + t2b);
        Out.println("t2c:" + t2c);

        byte b_max = (byte)0b01111111;//127
        byte b_min = (byte)0b10000000;//-128
        short s_max = (short)0b0111111111111111;//32767
        short s_min = (short)0b1000000000000000;//-32768
        long l_max = 0b0111111111111111111111111111111111111111111111111111111111111111L;//9223372036854775807
        long l_min = 0b1000000000000000000000000000000000000000000000000000000000000000L;//-9223372036854775808
        Out.println("b_max:"+b_max);
        Out.println("b_min:"+b_min);
        Out.println("s_max:"+s_max);
        Out.println("s_min:"+s_min);
        Out.println("l_max:"+l_max);
        Out.println("l_min:"+l_min);
    }
}
