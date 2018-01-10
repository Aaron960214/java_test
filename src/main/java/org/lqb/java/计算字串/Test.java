package org.lqb.java.计算字串;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    /**
     * 计算字符串中子串出现的次数
     */
    public static void main(String[] args) {
        str();
        chartest();
    }


    public static void str(){
        String string= "北京市人民政府和北京市政协";
        Integer i = 0;
        String  str = "北京";

        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(string);
        while(m.find()){
            i++;
        }
        System.out.println(str+"\t"+"在"+string+"中共出现了"+i+"次");
    }

    public static void chartest(){
        String a = "abac";
        char[] chars = a.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:chars){
            if(!map.containsKey(c)){
                map.put(c,1);
            }else{
                map.put(c,map.get(c)+1);
            }
        }

        for (Character c : map.keySet()){
            System.out.println(c+"出现了"+map.get(c)+"次");
        }

    }

}
