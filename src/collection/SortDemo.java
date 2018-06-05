package collection;

import util.Out;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Description 集合排序
 */
public class SortDemo {
    public void test(){
        //方法一，通过实现Comparable<T>接口，调用Collections.sort()方法实现排序，缺点不合适动态排序
        A a1 = new A(2,"张三");
        A a2 = new A(1,"李四");
        A a3 = new A(3,"王五");
        List<A> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        Out.println(list.get(0).toString());
        Out.println(list.get(1).toString());
        Out.println(list.get(2).toString());
        Collections.sort(list);
        Out.println(list.get(0).toString());
        Out.println(list.get(1).toString());
        Out.println(list.get(2).toString());

        //方法二
        B b1 = new B(2,"张三");
        B b2 = new B(1,"李四");
        B b3 = new B(3,"王五");
        List<B> list2 = new ArrayList<>();
        list2.add(b1);
        list2.add(b2);
        list2.add(b3);
        Collections.sort(list2, new Comparator<B>() {
            @Override
            public int compare(B o1, B o2) {
                //正序
//                return o1.getId().compareTo(o2.getId());
                //倒序
                return o2.getId().compareTo(o1.getId());
            }
        });
        Out.println(list.get(0).toString());
        Out.println(list.get(1).toString());
        Out.println(list.get(2).toString());
    }

    public  class A  implements Comparable<A>{
        private Integer id;
        private String name;

        public A(){
        }
        public A(Integer id , String name){
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return "id:" + id + ";name:" + name;
        }

        @Override
        public int compareTo(A o) {
            //正序
            return o.getId().compareTo(this.getId());
            //倒序
            //return this.getId().compareTo(o.getId());
        }
    }

    public  class B  {
        private Integer id;
        private String name;

        public B(){
        }
        public B(Integer id , String name){
            this.id = id;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return "id:" + id + ";name:" + name;
        }
    }
}
