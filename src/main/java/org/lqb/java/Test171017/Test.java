package org.lqb.java.Test171017;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    /**
     * 计算字符串中子串出现的次数
     */
    public static void main(String[] args) {
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
}
