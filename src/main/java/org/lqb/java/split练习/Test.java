package org.lqb.java.split练习;

/**
 * @author Aaron960214
 * @create 2017-12-12 20:36
 * @ClassName Test
 * @desc Split
 **/
public class Test {
    public static void main(String[] args) {
        String str = "scan|你好|kmfldsmalfmdl";
        String[] split = str.split("\\|");
        System.out.println(split[0]);
    }

}
