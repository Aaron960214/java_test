package org.lqb.java;

public class RegTest {

    public static void main(String[] args) {
        String str = "13935728556";
        String reg = "1[3|5|8|9]\\d{9}";
        boolean b = str.matches(reg);
        System.out.println(b);
    }
}