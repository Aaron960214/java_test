package org.lqb.java.Test171014;

public class Test {

    /**
     * 递归计算1-100的和
     * 递归计算6(即求6的阶乘)
     */
    public static void main(String[] args) {

        System.out.println(calculate(6));
        System.out.println(add(100));
    }

    public static Integer add(int num){
        if(num<=1){
            return 1;
        }else{
            return add(num-1)+num;
        }
    }


    public static Integer calculate(Integer num){
        if(num<=1){
            return 1;
        }else {
            int i = num * calculate(num - 1);
            return i;
        }

    }

}
