package org.lqb.java.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Aaron960214
 * @create 2017-12-29 20:23
 * @ClassName CachedThreadPool
 * @desc 缓存线程池
 *
 *  线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
 **/
public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++){
            final int index = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            cachedThreadPool.execute( ()-> System.out.println(Thread.currentThread().getName()+" "+index));
        }
        System.out.println("---------------------------华丽的分割线-----------------------------");

        //執行cachedThreadPool的execute方法  输出当前线程的名字
        cachedThreadPool.execute( ()-> System.out.println(Thread.currentThread().getName()));

        //重复输出十次线程名  为同一线程
//        cachedThreadPool.execute( ()->{
//            for (int i = 0; i < 10; i++){
//                System.out.println(Thread.currentThread().getName());
//            }
//        });





    }

}
