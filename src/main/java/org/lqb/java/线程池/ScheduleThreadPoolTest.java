package org.lqb.java.线程池;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author Aaron960214
 * @create 2017-12-29 21:13
 * @ClassName ScheduleThreadPoolTest
 * @desc 定长线程池，支持定时及周期性执行任务
 *
 **/
public class ScheduleThreadPoolTest {

    public static void main(String[] args) {

        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(3);
        //延迟一秒后每隔3秒输出一次
        scheduledThreadPool.scheduleAtFixedRate( ()-> System.out.println(Thread.currentThread().getName()),1,3, TimeUnit.SECONDS);
    }
}
