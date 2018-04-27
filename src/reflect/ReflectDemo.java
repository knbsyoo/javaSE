package reflect;

import util.Out;

import java.lang.reflect.Method;

/**
 * Description:reflect
 */
public class ReflectDemo {

    public static class DemoClass{
        private  int i;
        private  int j;
        public DemoClass(){};
        public DemoClass(int i,int j){
            this.i = i;
            this.j = j;
        };
        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }

        public  void printOne(){
            System.out.println(1);
        }
        public  void printTwo(){
            System.out.println(2);
        }
        public  int hashcode(){
            return i;
        }
        public java.sql.Date getC(){
            System.out.println(3);
            return new java.sql.Date((new java.util.Date()).getTime());
        }
    }

    public static  void test()
    {
        DemoClass demoClass = new DemoClass();
        try {
            Class c = demoClass.getClass();
            Method m[] = c.getDeclaredMethods();
            for (int i = 0; i < m.length; i++){
                System.out.println(m[i].toString());
                if(m[i].toString().contains("getC()")){
                    m[i].invoke(demoClass);
                }
            }
            Method method = c.getMethod("getC");
            method.invoke(demoClass);
            Class clazz = method.getReturnType();
            Out.println(clazz.getName().equals("java.sql.Date"));
        }
        catch (Throwable e) {
            System.err.println(e);
        }
    }
}
