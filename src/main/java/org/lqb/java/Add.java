package org.lqb.java;

public class Add {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a<<3;

//        int c = a++;
//        int d = c-b;
//        System.out.println(b);

//        String s1 = "xyz";
//        String s2 = new String("xyz");

        /**
         *   调用intern方法时，如果String Pool中已经包含一个等于此对象的字符串（用 equals(Object)方法确定），
         *   则返回pool中的字符串，否则，将次String对象添加到池中，并返回此String对象在String pool中的引用
         */
//        String intern = s2.intern();
//        System.out.println(s1==intern);

        String ss1 = new String("aa") ;
        String ss2 = new String("aa") ;

        int i = ss1.hashCode();
        int i1 = ss2.hashCode();

        System.out.println("i:"+i);
        System.out.println("i1:"+i1);
//        System.out.println(ss1==ss2);
        System.out.println(ss1.equals(ss2));


        int a = 9;
        int b = a-- + --a;
        int c = a++ + ++a;
        int d = c-- - ++b;
        System.out.println(d--);

    }
}
