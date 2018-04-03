package dataType;

import util.Out;

/**
 * Description
 */
public class CharType {
    public static void test(){
        Character t1 = 'a';
        Character t2 = 2;
        Out.println("t1:" + t1);
        Out.println("t1.value:" + t1.charValue());
        Out.println("t1.hashCode:" + t1.hashCode());//调用public static int hashCode(char value) {return (int)value;}
        Out.println("t1.equals:" + t1.equals(97));//重写equals方法，比较charValue值，不比较hashCode
        Out.println("compare:" + Character.compare(t1,t2));
        Out.println("size:" + Character.SIZE);
        Out.println("MIN_CODE_POINT:" + Character.MIN_CODE_POINT);//Unicode最小值
        Out.println("MAX_CODE_POINT:" + Character.MAX_CODE_POINT);
        Out.println("isValidCodePoint:" + Character.isValidCodePoint((int)Math.pow(2,18)));//介于MIN_CODE_POINT和MAX_CODE_POINT
        Out.println("isBmpCodePoint:" + Character.isBmpCodePoint((int)Math.pow(2,11)));//BPM 0-2~16,BPM无法表示所有的Unicode，所以引入增补字符
        Out.println("isBmpCodePoint:" + Character.isBmpCodePoint((int)Math.pow(2,17)));//>2~16 <=Character.MAX_CODE_POINT 增补字符
        Out.println("MIN_SUPPLEMENTARY_CODE_POINT:" + Character.MIN_SUPPLEMENTARY_CODE_POINT);
        Out.println("MIN_SUPPLEMENTARY_CODE_POINT:" + Character.MIN_SUPPLEMENTARY_CODE_POINT);
        Out.println("isSupplementaryCodePoint:" + Character.isSupplementaryCodePoint((int)Math.pow(2,11)));//SupplementaryCode 增补字符 >=MIN_SUPPLEMENTARY_CODE_POINT && <= MAX_CODE_POINT
        Out.println("isSupplementaryCodePoint:" + Character.isSupplementaryCodePoint((int)Math.pow(2,17)));
        Out.println("isSupplementaryCodePoint:" + Character.isSupplementaryCodePoint((int)Math.pow(2,17)));
        Out.println("charCount:" + Character.charCount((int)Math.pow(2,11)));//增补字符返回2 不是返回 1
        Out.println("charCount:" + Character.charCount((int)Math.pow(2,17)));
        Out.println("MIN_LOW_SURROGATE:" + (int)Character.MIN_LOW_SURROGATE);
        Out.println("MAX_HIGH_SURROGATE:" + (int)Character.MAX_HIGH_SURROGATE);
        conver("u7F6E");
    }

    public static void conver(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++) {
            String temp = "";
            int strInt = str.charAt(i);
            if(strInt > 127) {
                temp += "\\u" + Integer.toHexString(strInt);
            } else {
                temp = String.valueOf(str.charAt(i));
            }
            result += temp;
        }
        Out.println("result:" + result);
    }
}
