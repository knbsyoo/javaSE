package entity;

public class Person {

    private String name;
    private String sex;//男，女
    private int year;//年龄
    private int sort;//排序

    public Person(String name, String sex){
        this.name = name;
        this.sex = sex;
    }

    public Person(){

    }

    public Person(String name, String sex, int year){
        this.name = name;
        this.sex = sex;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @Override
    public String toString(){
        return "name:" +this.name +
                " ,sex:" + this.sex +
                " ,year:" + this.year +
                " ,sort:" + sort;
    }
}
