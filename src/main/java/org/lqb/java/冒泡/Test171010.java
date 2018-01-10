package org.lqb.java.冒泡;

import java.util.Random;

public class Test171010 {

    public static void main(String[] args) {
        Integer[] arr = new Integer[20];

       for (int i=0;i<20;i++){
           Random random  = new Random();
//           double random1 = Math.random();
           arr[i] = random.nextInt();
       }

       int num = 0;
      for (int i = 0;i<arr.length;i++){
           for (int j = 0; j< arr.length-1;j++){
               if(arr[j]>arr[j+1]){
                   num = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = num;
               }
           }
      }
        for (Integer i :
                arr) {
            System.out.println(i);
        }
    }
}
