package Map;

import util.Out;

import java.util.HashMap;

/**
 * Description
 */
public class MapTest {
    public static void test(){
        HashMap map = new HashMap();
        map.put("1","a");
        map.put("2","b");
        Out.println("map:"+ map);
    }
}
