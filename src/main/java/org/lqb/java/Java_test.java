package org.lqb.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_test {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("f:\\access.20120104.log"));
        String tmp = null;
        String reg = "[w]\\w+\\.\\w+\\.\\w+";
        while((tmp=reader.readLine())!=null){
            Pattern p = Pattern.compile(reg);
            Matcher matcher = p.matcher(tmp);
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }
    }

}
