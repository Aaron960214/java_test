package org.lqb.java.trycatch;

/**
 * @author Aaron960214
 * @create 2017-12-26 16:14
 * @ClassName FinallyTest1
 * @desc
 **/
public class FinallyTest1 {
    public static void test() {
        try {
            int i = 5 / 0;
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }

    }

    public static void main(String[] args) {
        test();
    }

}
