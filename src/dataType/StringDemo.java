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

    /**
     * 计算年龄段
     */
    public static void ageRange(){
        String ids = "340102201503075037,340102201503075352,340102201503079599,340102201503079396,340102201503074253," +
                "110101200303078854,110101200303079830,110101200303074132," +
                "110101199003075234,110101199003072690," +
                "110101198703078415,110101198703073999,110101198703076997,110101198703073737,110101198703077770,110101198703070018," +
                "110101197603074711," +
                "110101196703070190,110101196703078838," +
                "110101194903072511," +
                "110101191303078393,110101191303076371,110101191303071730,110101191303070113,150102192903073412,150102192903071433";
        //0-10 : 2018-2008
        //11-20 : 2007-1998
        //21-30:  1997-1988
        //31-40:  1987-1978
        //41-50:  1977-1968
        //51-60:  1967-1958
        //61-70:  1957-1948
        //71以上: 1947-
        String[] idArray = ids.split(",");
        int i0 = 0;
        int i11 = 0;
        int i21 = 0;
        int i31 = 0;
        int i41 = 0;
        int i51 = 0;
        int i61 = 0;
        int i71 = 0;
        for(String id:idArray){
            String yearStr = id.substring(6,10);
            Integer year = new Integer(yearStr);
            Out.println("year:" + year);
            if(year <= 2018 && year >= 2008){
                i0 ++;
            }else if(year <= 2007 && year >= 1998){
                i11 ++;
            }else if(year <= 1997 && year >= 1988){
                i21 ++;
            }else if(year <= 1987 && year >= 1978){
                i31 ++;
            }else if(year <= 1977 && year >= 1968){
                i41 ++;
            }else if(year <= 1967 && year >= 1958){
                i51 ++;
            }else if(year <= 1957 && year >= 1948){
                i61 ++;
            }else {
                i71 ++;
            }
        }
        Out.println(i0);
        Out.println(i11);
        Out.println(i21);
        Out.println(i31);
        Out.println(i41);
        Out.println(i51);
        Out.println(i61);
        Out.println(i71);
    }
}
