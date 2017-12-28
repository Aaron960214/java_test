package org.lqb.java.Test171019;

import java.util.*;

public class Test {
    private double v;

    /**
     * 创建一个List对象，大小为15，放入15个随机生成的正整数。（20分）
     * 将上述List对象的内容放入一个Map对象中。（40分）
     * 输入Map对象中的所有值。（40分）
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        for(int i=1;i<=15;i++){
            double random = Math.random();
            int a = (int)Math.ceil(random*1000);
            list.add(a);
        }
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0;i<list.size();i++){
            map.put(""+list.get(i)+"",list.get(i));
        }
        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.print(key+"\t");
            System.out.println(value);
        }



    }
}
