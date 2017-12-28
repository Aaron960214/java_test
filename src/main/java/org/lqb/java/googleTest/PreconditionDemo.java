package org.lqb.java.googleTest;

/**
 * @author Aaron960214
 * @create 2017-12-26 18:11
 * @ClassName PreconditionDemo
 * @desc       练习使用谷歌guava依赖
 **/
public class PreconditionDemo {

    public static void main(String[] args) {
//        new Car(null);

        new Car("Audi").drive(0);
    }

}
