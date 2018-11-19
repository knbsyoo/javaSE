package expection;

import util.Out;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: JianBin.Liu
 * @Date: 2018/10/22 17:42
 * @Description:
 */
public class ExpectionDemo {
    public static void testMapExpection(){
        try {
            Map map = new HashMap();
            Object a = map.get("key1");
            Out.println(a);
        }catch (Exception e){
            throw e;
        }
    }
}
