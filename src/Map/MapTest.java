package Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import util.Out;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Description
 */
public class MapTest {
    public static void test(){
        HashMap map = new HashMap();
        map.put("ageStart",'0');
        map.put("ageEnd","18");
        ageToDate(map);
        map.put("1",1);
        Date now = new Date();
        map.put("nowMap",now);
        Date nowMap = (Date)map.get("nowMap");
        System.out.println(nowMap);
    }

    public static Map ageToDate( Map<String, Object> param ){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String nowStr = format.format(new Date());
        Integer year = new Integer( nowStr.substring(0,4));
        if(param.containsKey("ageStart") && null != param.get("ageStart")){
            Integer ageStart = new Integer(param.get("ageStart").toString());
            String endBirthday = (year - ageStart) + nowStr.substring(4,4);
            param.remove("ageStart");
            param.put("endBirthday",endBirthday);
        }
        if(param.containsKey("ageEnd") && null != param.get("ageEnd")){
            Integer ageEnd = new Integer(param.get("ageEnd").toString());
            String startBirthday = (year - ageEnd) + nowStr.substring(4,4);
            param.remove("ageEnd");
            param.put("startBirthday",startBirthday);
        }
        return param;
    }

    public static void testNullOrEmpty(){
        HashMap map = new HashMap();
        map.put("a1",null);
        if(null == map.get("a1")||map.get("a1").toString().equals(1)){
            Out.println("1:OK");
        }
    }

    public static void testNullMap(){
        HashMap map = null;
        if(!map.containsKey("a")){
            Out.println("1:OK");
        }
    }

    public static void testObjectMap(){
        HashMap<String , Object> map = new HashMap<>();
        map.put("age", 22);
        map.put("name","xiaoMing");
        JSONObject jsonObject = JSONObject.parseObject(JSON.toJSON(map).toString());
        Person person = JSONObject.toJavaObject(jsonObject, Person.class);
        Out.print(person.toString());
    }

    public static class  Person{
        private String name;
        private Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString(){
            return "name:" + this.name + ",age:"+ this.age;
         }
    }
}
