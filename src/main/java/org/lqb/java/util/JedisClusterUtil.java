package org.lqb.java.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by qpx on 2017/12/8.
 */
public class JedisClusterUtil {

    public static  JedisCluster jedisCluster = null;


    static {
        init();
    }

    public static synchronized void init(){

        Set<HostAndPort> hostAndPortSet = new HashSet<HostAndPort>();
        hostAndPortSet.add(new HostAndPort("192.168.57.201",7000));
        hostAndPortSet.add(new HostAndPort("192.168.57.201",7001));
        hostAndPortSet.add(new HostAndPort("192.168.57.202",7002));
        hostAndPortSet.add(new HostAndPort("192.168.57.202",7003));
        hostAndPortSet.add(new HostAndPort("192.168.57.203",7004));
        hostAndPortSet.add(new HostAndPort("192.168.57.203",7005));

        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(300);
        jedisPoolConfig.setMaxIdle(200);
        jedisPoolConfig.setMaxWaitMillis(10000);
        jedisCluster = new JedisCluster(hostAndPortSet,jedisPoolConfig);
    }


    public static void setString(String key,String value,int timeout){
        jedisCluster.set(key,value);
        if(timeout>0){
            jedisCluster.expire(key,timeout);
        }
    }


    public static String getString(String key){
        if(jedisCluster.exists(key)){
            return  jedisCluster.get(key);
        }
        return null;
    }


    public static JedisCluster getJedisCluster() {
        return jedisCluster;
    }

    public static void setJedisCluster(JedisCluster jedisCluster) {
        JedisClusterUtil.jedisCluster = jedisCluster;
    }

    public static void main(String[] args) {
        setString("keys123","values12",0);
        String keys = getString("keys123");
        System.out.println(keys);
        //

    }
}
