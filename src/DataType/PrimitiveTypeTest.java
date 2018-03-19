package DataType;

import Util.Out;

/**
 * Created by knbsyoo on 2018/3/19
 * Description 基础数据类型的包装类一览
 */
public class PrimitiveTypeTest {
    public static void main(String[] args){
        //byte
        Out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        Out.println("包装类：java.lang.Byte");
        Out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        Out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);

        //short
        Out.println("基本类型：short 二进制位数：" + Short.SIZE);
        Out.println("包装类：java.lang.Short");
        Out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        Out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);

        //int
        Out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        Out.println("包装类：java.lang.Integer");
        Out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        Out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);

        //long
        Out.println("基本类型：long 二进制位数：" + Long.SIZE);
        Out.println("包装类：java.lang.Long");
        Out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        Out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);

        //float
        Out.println("基本类型：float 二进制位数：" + Float.SIZE);
        Out.println("包装类：java.lang.Float");
        Out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        Out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);

        //double
        Out.println("基本类型：double 二进制位数：" + Double.SIZE);
        Out.println("包装类：java.lang.Double");
        Out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        Out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);

        // char
        Out.println("基本类型：char 二进制位数：" + Character.SIZE);
        Out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        Out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE );
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        Out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE  );
    }
}
