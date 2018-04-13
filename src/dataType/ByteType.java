package dataType;

/**
 * Created by knbsyoo on 2018/2/28
 * 解析笔记：https://blog.csdn.net/qq_21397851/article/details/79900658
 */
public class ByteType {
    public static void test(){
        //Byte声明
        byte byte1 = 1;
        Byte b1 = new Byte(byte1);
        Byte b2 = new Byte("1");
        Byte b3 = byte1;//自动装箱
        out(b1==b2);//fasle
        out(b1==b3);//fasle
        //初始化方法，除构造方法和自动装箱
        Byte b4 = Byte.parseByte("1",10);//最终byte自动装箱
        Byte b5 = Byte.parseByte("1");//同上
        Byte b6 = Byte.valueOf("1",10);//最终取ByteCache
        Byte b7 = Byte.valueOf("1");//同上
        Byte b8 = Byte.valueOf(byte1);//同上
        out(b4==b2);//fasle
        out(b4==b1);//fasle
        out(b4==b3);//true
        out(b4==b5);//true
        out(b6==b7);//true
        out(b6==b8);//true

        //其他方法
        Byte.toString(byte1);//1
        b8.toString();//1
        b8.hashCode();//1
        Byte.decode("0x8");//8
        b4.equals(b2);//true
        byte byte2 = -1;
        Byte.toUnsignedInt(byte1);//1
        Byte.toUnsignedLong(byte1);//1
        Byte.toUnsignedInt(byte2);//255 强转为int的-1，-1的二进制补码：1111,1111,1111,1111,1111,1111,1111,1111，进行& 0xff，截取byte表示8位以外的其他高位。
        Byte.toUnsignedLong(byte2);//255
    }

    private static void out(Object o){
        System.out.println(o);
    }
}
