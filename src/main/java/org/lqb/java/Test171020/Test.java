package org.lqb.java.Test171020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) {
        /**
         * 创建当前日期对象。（20分）
         * 格式化当前日期对象，按以下格式输出至控制台：yyyy-MM-dd。（40分）
         * 格式化当前日期对象，按以下格式输出至控制台：yyyy-MM-dd HH:mm:ss。
         */
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        String date1 = format.format(date);
//        System.out.println(date1);
//
//        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date2 = format1.format(date);
//        System.out.println(date2);


        try {
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
            String d = "12/01/2017";
            Date parse = format.parse(d);            System.out.println(parse);
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String format2 = format1.format(parse);
            System.out.println(format2);
        } catch (ParseException e) {


        }


    }

}
