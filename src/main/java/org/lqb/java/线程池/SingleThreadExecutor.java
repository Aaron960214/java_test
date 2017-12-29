package org.lqb.java.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Aaron960214
 * @create 2017-12-29 21:35
 * @ClassName SingleThreadExecutor
 * @desc 创建单线程化的线程池
 **/
public class SingleThreadExecutor {

    public static void main(String[] args) {
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 1; i < 10; i++) {
            final int index1 = i;
            singleThreadExecutor.execute(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " " + index1);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
