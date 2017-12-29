package org.lqb.java.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Aaron960214
 * @create 2017-12-29 20:48
 * @ClassName FixedThreadPoolTest
 * @desc 定长线程池练习
 *  因为线程池大小为3，每次任务执行后sleep 2秒，所以会输出3句后等待两秒 再输出三句
 **/
public class FixedThreadPoolTest {

    public static void main(String[] args) {
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            final int index1 = i;
            fixedThreadPool.execute( () -> {
                    try {
                        System.out.println(Thread.currentThread().getName() + " " + index1);
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            );
        }

    }
}
