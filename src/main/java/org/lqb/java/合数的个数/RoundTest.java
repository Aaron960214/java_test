package org.lqb.java.合数的个数;

public class RoundTest {

    public static void main(String[] args) {
//        int i = 1;
//        int j = 0;
//        j = ++i + i++;

//        long l = Math.round(11.2);
//        long round = Math.round(-11.2);
//        System.out.println(l+"\t"+round);
//        System.out.println("i是"+i+"\t"+"j是"+j);

//        double f = 11.1E10f;
//
//        System.out.println();

//        System.out.println("2fdsa sgf dsgf ggf "+5);
//        System.out.println(5+2+"5"+"2");

        long i = Math.round(-11.6);
        double ceil = Math.ceil(-11.49);
        double floor = Math.floor(-11.1);

        System.out.println("四舍五入："+i);
        System.out.println("向上取整："+ceil);
        System.out.println("向下取整："+floor);

    }
}
