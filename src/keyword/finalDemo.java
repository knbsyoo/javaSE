package keyword;

/**
 * Description:keyword demo
 */
public class finalDemo {
    class Value{
        private int i;

        public Value(){
        }
        public Value(int i){
            this.i = i;
        }
        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
        public final int test(){
            return 1;
        }
    }
    class SubValue extends Value{
        //子类无法重写父类的final方法。
//        @Override
//        public final int test(){//compilation error: overriden method is final
//            return 2;
//        }
    }
    public void finalTest(){
        //基本数据类型
        final int a ;
        a = 1;
        //final修饰的局部变量（基本数据类型）只能赋值一次，无法改变。
//        a = 2; 编译提醒报错
        //final修饰的引用变量，无法改变其引用的对象，无法再指向另一个对象。
        final Value value = new Value(2);
        value.i = 3;//改变对象的属性值，编译没报错
//         value = new Value(4);//新对象，编译报错
    }
    public void fianlParams1(final int i){
//        i = 3;//compilation error: can not assign a value to final variable "i"
    }
    public void fianlParams2(final Value i){
//        i = new Value(12);//compilation error: can not assign a value to final variable "i"
    }
}
