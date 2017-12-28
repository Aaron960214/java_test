package org.lqb.java;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Hashtable;

public class replace {
    public void method(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
//        int a = 1;
//        int b = 2;
//        replace re = new replace();
//        re.method(a,b);
//        System.out.println(a+"\n"+b);

        try {
            String encode = URLEncoder.encode("http://2108a312.nat123.cc/wechat"+"/toLogin", "UTF-8");
            System.out.println(encode);
        } catch (Exception e) {
            e.printStackTrace();
        }

        HashMap map = new HashMap();
        map.put(1,2);

        Hashtable t = new Hashtable();




    }


}
