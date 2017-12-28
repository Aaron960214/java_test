package org.lqb.java.Test171012;

import org.lqb.java.util.MD5Util;

public class Test {
    /**
     * 定义一个字符串，使用JAVA提供的工具类对其加密
     */

    public static void main(String[] args) {
        String str = "Aaron960214";

        String str2 = "123456";
        String s = MD5Util.string2MD5(str2);

        System.out.println(s);

    }


}
