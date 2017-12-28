package org.lqb.java.JedisTest;

import com.alibaba.fastjson.JSON;
import org.lqb.java.entity.Nation;
import org.lqb.java.util.JedisClusterUtil;

import java.util.*;


/**
 * @author Aaron960214
 * @create 2017-12-08 22:02
 * @ClassName JedisTest
 * @desc redis的存取
 **/
public class JedisTest {

    public static void main(String[] args) {
//        String s = JedisUtils.set("openid", "123", 3600);
//        System.out.println("s:"+s);
//
//        String openid = JedisUtils.get("openid");
//        System.out.println("openid"+openid);

//        Nation nation = new Nation();
//        nation.setId(1);
//        nation.setProvince("北京");
//        nation.setCode("01001");
//        nation.setParent("0");
//
//        Nation nation1 = new Nation();
//        nation1.setId(2);
//        nation1.setProvince("上海");
//        nation1.setCode("01002");
//        nation1.setParent("0");
//
//        List<Nation> provinces = new ArrayList<Nation>();
//        provinces.add(nation);
//        provinces.add(nation1);


//        for(Nation province : provinces){
//            JedisClusterUtil.getJedisCluster().hset("province", province.getId().toString(), JSON.toJSONString(province));
//            jedisClusterUtil.get.hset("province",province.getId().toString(), JSON.toJSONString(province));
//        }
        Map<String, String> map = JedisClusterUtil.getJedisCluster().hgetAll("province");
        Set<String> keySet = map.keySet();

        for(String key : keySet){
            System.out.println(map.get(key));
        }

//        String province = JedisClusterUtil.
       // Map<String, String> province = getJedisCluster().hgetAll("province");

       // System.out.println(province.size());
    }

}
