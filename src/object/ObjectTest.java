package object;

import util.Out;

/**
 * Description  base Class, all class extend Object
 */
public class ObjectTest {
    public static void test(){
        Out.println("Object class:" + new Object().getClass());
        Out.println("ObjectTest class:" +  new ObjectTest().getClass());//subClass
        Out.println("a Object hashCode:" + new Object().hashCode());
        Out.println("a Object hashCode:" + new Object().hashCode() + ",another hashCode:" + new Object().hashCode());//hashCode method can be Override
        Out.println("Override:a ObjectTest hashCode:" + new ObjectTest().hashCode() + ",another hashCode:" + new ObjectTest().hashCode());
        Out.println("Object equals:" + new Object().equals(new Object()));//equals"==":判断两个对象的地址是不是相等
        Out.println("Override:ObjectTest equals:" + new ObjectTest().equals(new ObjectTest()));
    }

    @Override
    public int hashCode(){
        return 1;
    }
}
