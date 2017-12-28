package org.lqb.java.Test171011;

public class enumTest {
    public static void main(String[] args) {
        Test1011 left = Test1011.valueOf("LEFT");
        left.name = "right";
        System.out.println(left.getName());
    }
}
