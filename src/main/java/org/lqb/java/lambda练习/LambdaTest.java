package org.lqb.java.lambda练习;

import com.google.common.base.Converter;
import com.google.common.base.Function;

import javax.jnlp.IntegrationService;
import java.util.Arrays;

/**
 * @author Aaron960214
 * @create 2018-01-08 19:28
 * @ClassName LambdaTest
 * @desc
 **/
public class LambdaTest {
    public static void main(String[] args) {
        Arrays.asList("a","b","c","d").forEach(e->System.out.println(e));
        String smoething ="";

        Function<String,Boolean> converter = "java"::startsWith;


    }
}
