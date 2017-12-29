package org.lqb.java.线程;

/**
 * @author Aaron960214
 * @create 2017-12-29 13:39
 * @ClassName ThreadTest2
 * @desc
 **/
public class ThreadTest2 implements Runnable {

    public void run() {

        synchronized (Main1.main1){
            while (Main1.num<=100){

                if(Main1.num%2==1){
                    System.out.println("奇数: "+Main1.num);
                    Main1.main1.notify();
                    Main1.num++;
                }else{
                    try {
                        Main1.main1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("hello world2");
    }
}
