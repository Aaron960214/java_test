package org.lqb.java.trycatch;

/**
 * @author Aaron960214
 * @create 2017-12-26 15:02
 * @ClassName FinallyTest
 * @desc
 **/
public class FinallyTest {

    public static int test1(){
        int result = 1;
        try {
            result = 2;
            return result;
        }catch (Exception e){
            return 0;
        }finally {
            result = 3;
//            return result;
        }

    }

    public static void main(String[] args) {
        System.out.println(test1());
    }
}
