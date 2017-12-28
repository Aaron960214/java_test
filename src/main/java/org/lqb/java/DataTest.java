package org.lqb.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {

    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = format.format(date);
        System.out.println(s.substring(0,4));


//        Random random = new Random();
//       for (int i = 0; i< 50;i++){
//           int num= random.nextInt(10);
//           System.out.println(num+1);
//       }



    }
}
