package Radix;

import util.Out;

/**
 * Description 了解Java使用二进制表示各种数值
 */
public class BinaryDemo {
    public static void test(){
//      byte b1 = 0B10000001;//Error:(10, 19) java: 不兼容的类型: 从int转换到byte可能会有损失
        byte b1 = (byte)0B10000001;//说明默认类型为int
        byte b2 = 0B0111111;//表示为0B000000000000000000000000111111
        int b3 = 0B11100000000000000000000001111111;
        Out.println("b1,b2,b3:" + b1 + "," +b2 + "," + b3);
    }
}
