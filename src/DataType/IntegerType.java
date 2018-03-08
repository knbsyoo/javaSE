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
        // 2进制表示有符号数字时候，首位0为正，1为负
        int max = Integer.MAX_VALUE;
        Out.println("max：" + max);
        // 0x80000000 16进制转换为2进制 1000,0000,0000,0000,0000,0000,0000,0000
        // 取补码 1,0000,0000,0000,0000,0000,0000,0000,0000
        int mix = Integer.MIN_VALUE;
        Out.println("mix：" + mix);

        Class<Integer>  type = Integer.TYPE;
        Out.println("base type:" +  type);
    }
}
