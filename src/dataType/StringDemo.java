package dataType;

import util.Out;

public class StringDemo {
    public static void test(){
        String month = "201811";
        Out.println(month.substring(4,6));
    }

    public static void testSub(){
        String imgPaths = "";
        if(imgPaths.trim().equals("")){
            Out.println("return");
            return;
        }
        String[] arrayImgPath = imgPaths.split(",");
        int i = 1;
        for(String s:arrayImgPath){
            Out.println(i + ":" + s);
            i++;
        }
    }
}
