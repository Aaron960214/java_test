package org.lqb.java.合数的个数;

public class Test {
    public static void main(String[] args) {
        /**
         * 1.数学中有一类正整数叫合数，指的除了能被1和本身整除，还能被其它正整数整除的正整数。
         * 计算100-1000之间合数的数量。
         */

        cal(1000);

    }
    public static void cal(Integer num){
        int count = 0;
        boolean flag = false;
        for(int i=100; i<=num;i++){
            if(num%i==0){
                flag = true;
                count++;
            }
        }
        System.out.println("100到1000之间的合数有"+count);
//        if(flag){
//            System.out.println("100到1000之间的合数有"+count);
//        }else{
//            System.out.println(num+"不是合数");
//        }

    }
}
