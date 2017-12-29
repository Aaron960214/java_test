package org.lqb.java.线程;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Aaron960214
 * @create 2017-12-29 13:37
 * @ClassName Main
 * @desc    实现线程的三种方式
 **/
public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadTest1 test1 = new ThreadTest1();
        test1.start();

//        ThreadTest2 threadTest2 = new ThreadTest2();
//        new Thread(threadTest2).start();

        new Thread(new Runnable() {
            public void run() {
                System.out.println("hello world");
            }
        }).start();

        ThreadTest3 threadTest3 = new ThreadTest3();
        FutureTask<String> task = new FutureTask<String>(threadTest3);
        new Thread(task).start();
        String s = task.get();
        System.out.println(s);
    }
}
