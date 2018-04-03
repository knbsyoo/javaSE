package dataType;

import util.Out;

/**
 * Description
 */
public class ShortType {
    public static void test(){
        Short t1 = Short.parseShort("11");//调用Integer.parseInt(s, radix)方法，然后强转为short类型。
        Short t2 = Short.valueOf("11");
        Short t3 = Short.decode("#f");
        int hashCode = Short.hashCode(t1);//调用public static int hashCode()，强转int类型。
        Out.println("t1：" + t1);
        Out.println("t2：" + t2);
        Out.println("t3：" + t3);
        Out.println("compare：" + Short.compare(t1,t3));//重写compare方法
    }
}
