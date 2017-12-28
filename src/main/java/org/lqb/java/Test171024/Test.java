package org.lqb.java.Test171024;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {
    /**
     * 1.定义一个数组，放入50个随机生成的的整数，整数范围为1—10的闭区间
     * 2.计算1—10这10个整数在数组中分别出现的次数
     * @param args
     */
    public static void main(String[] args) {
        Integer []arr = new Integer[50];
//       for (int i = 0; i <50; i++){
//           double random = Math.random()*10;
//           long round = Math.round(random);
//           arr[i] = (int)round;
//       }
        Random random = new Random();
        for (int i = 0; i< 50;i++){
            int num= random.nextInt(10);
            arr[i] = num+1;
        }

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int [] count = {0,0,0,0,0,0,0,0,0,0};

//        for (Integer i : arr) {
//            Integer value = map.get(i);
//            map.put(i,value++);
//           for (Integer j : arr) {
//
//               count++;
//
//           }
//        }


        int i=0;
        while(i<arr.length){
            count[arr[i]-1]++;
            i++;
        }

//        Set<Integer> keys = map.keySet();
//        for (Integer key :
//                keys) {
//            System.out.println(key+"\t"+map.get(key));
//        }
        for (int j= 0;j<count.length;j++){
            int num = count[j];
            System.out.println((j+1)+"\t"+num);
        }


    }
}
