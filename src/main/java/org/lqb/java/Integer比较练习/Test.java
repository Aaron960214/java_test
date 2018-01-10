package org.lqb.java.Integer比较练习;

/**
 * @author Aaron960214
 * @create 2018-01-09 13:47
 * @ClassName Test
 * @desc
 **/
public class Test {
    public static void main(String[] args) {
        int i = 128;
        Integer i1 = new Integer(128);
        Integer i2 = new Integer(128);
        Integer i3 = 128;
        Integer i4 = 128;
        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i==i1);
        System.out.println(i1==i2);
        System.out.println(i3==i4);
        System.out.println(i5==i6);
    }
}
