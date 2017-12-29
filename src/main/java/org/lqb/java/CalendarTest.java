package org.lqb.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    /**
     * 获取前三个月的月份
     * @param args
     */


    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH,-3);
        Date date = calendar.getTime();
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(format);


    }
}
