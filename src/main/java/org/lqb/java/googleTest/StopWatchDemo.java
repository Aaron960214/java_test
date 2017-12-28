package org.lqb.java.googleTest;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;


/**
 * @author Aaron960214
 * @create 2017-12-26 18:18
 * @ClassName StopWatchDemo
 * @desc 计时器
 **/
public class StopWatchDemo {

    //TODO 暂未解决
    public static void main(String[] args) {
        final Stopwatch stopwatch = Stopwatch.createUnstarted().start();
        stopwatch.start();

        try {
            System.out.println("you can do something!");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stopwatch.stop();

        long elapsed = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println(elapsed);

    }
}
