package org.lqb.java.线程;

/**
 * @author Aaron960214
 * @create 2017-12-29 14:53
 * @ClassName Main1
 * @desc
 **/
public class Main1 {

    public static int num = 1;

    public static Main1 main1 = new Main1();

    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        ThreadTest2 test2 = new ThreadTest2();
        test1.start();
        test1.setName("奇数");
        new Thread(test2,"偶数").start();
    }
}
