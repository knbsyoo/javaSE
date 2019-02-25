package collection;

import entity.Person;
import util.Out;

import java.util.*;

public class ListDemo {

    /**
     * 一维数组转化为二维数组，根据一维数组的实体属性来分组
     */
    public void list2TwoDimensionalList(){
        Person p1 = new Person("张三", "男");
        Person p2 = new Person("张三1", "男");
        Person p3 = new Person("张三2", "男");
        Person p4 = new Person("张三3", "男");

        Person p6 = new Person("黄奕", "女");
        Person p7 = new Person("黄奕", "女");
        Person p8 = new Person("黄奕", "女");
        Person p9 = new Person("黄奕", "女");
        Person p10 = new Person("黄奕", "女");

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        HashMap<String,List<Person>> map = new HashMap<String,List<Person>>();

        for(Person person: list){
            person.getSex();
        }


        HashMap<String, List<Person>> map2 = new HashMap<>();
        map2.put("111", list);
    }

    /**
     * 排序，并且赋值排序编号
     */
    public static void listSort(){
        //逻辑：先排序，后比较，设置编号
        Person p1 = new Person("张三", "男", 1);
        Person p2 = new Person("张三1", "男", 3);
        Person p3 = new Person("张三2", "男",2);
        Person p4 = new Person("张三3", "男",20);

        Person p6 = new Person("黄奕", "女", 1);
        Person p7 = new Person("黄奕", "女", 20);
        Person p8 = new Person("黄奕", "女", 18);
        Person p9 = new Person("黄奕", "女", 17);
        Person p10 = new Person("黄奕", "女", 18);
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                long cv = o2.getYear() - o1.getYear();
                if(cv >= 0){
                    return 1;
                }else {
                    return -1;
                }
            }
        });

        //设置排序编号
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setSort(i+1);
        }

        //排序
        if(list.size() >= 2){
            for (int i = 1; i < list.size(); i++) {
                if(list.get(i).getYear() == list.get(i-1).getYear()){
                    list.get(i).setSort(list.get(i-1).getSort());
                }
            }
        }

        for(Person p: list){
            Out.println(p.toString());
        }
    }

    public static void bean2List(){
        Person p1 = new Person("张三", "男");
        Person p2 = new Person("张三1", "男");
        Person p3 = new Person("张三2", "男");
        Person p4 = new Person("张三3", "男");

        Person p6 = new Person("黄奕", "女");
        Person p7 = new Person("黄奕", "女");
        Person p8 = new Person("黄奕", "女");
        Person p9 = new Person("黄奕", "女");
        Person p10 = new Person("黄奕", "女");

        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);

        List<String> dicts = new ArrayList<>();
        dicts.add("男");
        dicts.add("女");
        Map result = new HashMap();
    }
}
