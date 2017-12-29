package org.lqb.java.线程;

import java.util.concurrent.Callable;

/**
 * @author Aaron960214
 * @create 2017-12-29 13:39
 * @ClassName ThreadTest3
 * @desc
 **/
public class ThreadTest3 implements Callable {
    public Object call() throws Exception {
        return  "hello world";
    }
}
