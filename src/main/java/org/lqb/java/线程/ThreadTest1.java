package org.lqb.java.线程;

import com.sun.javaws.Main;

import java.util.HashMap;

/**
 * @author Aaron960214
 * @create 2017-12-29 13:37
 * @ClassName ThreadTest1
 * @desc
 **/
public class ThreadTest1 extends Thread {

    @Override
    public void run() {
        synchronized (Main1.main1){
            while (Main1.num<=100){

                if(Main1.num%2==0){
                    System.out.println("偶数："+Main1.num);
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


    }
}
