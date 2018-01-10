package org.lqb.java.判断为一年中的第几天;

public class Test {

    /**
     * 1.自定义一个日期。
     * 2.判断该日期在这一年中是第几天。
     */

    public static void main(String[] args) {
//        Date date = new Date();
//        SimpleDateFormat format = new SimpleDateFormat();
//        String time = format.format(date);
//        System.out.println(time);

        Integer date = date(2017, 3, 10);
        System.out.println(date);


    }

    public static Integer date(int year,int month,int day){

        int num = 0;

        int[] m1 = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] m2 = {31,29,31,30,31,30,31,31,30,31,30,31};

        boolean flag = false;

        //首先判断是否为闰年
        if(year%4 ==0 && year%100 != 0 || year%400 == 0&& year%4 == 0){
            flag = true;
        }

        if(flag){
            for (int i = 0; i< month-1; i++){
                num+=m2[i];
            }
        }else{
            for (int i = 0; i< month-1; i++){
                num+=m1[i];
            }
        }
        num+=day;
        return num;
    }


}
