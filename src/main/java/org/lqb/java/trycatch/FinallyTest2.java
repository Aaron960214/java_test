package org.lqb.java.trycatch;

/**
 * @author Aaron960214
 * @create 2017-12-26 16:17
 * @ClassName FinallyTest2
 * @desc
 **/
public class FinallyTest2 {


    public static void test() {
        try {
            System.out.println("try");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        test();
    }

}
