package org.lqb.java.entity;

import com.alibaba.fastjson.JSON;
import org.lqb.java.util.JedisClusterUtil;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author auto create
 * @since 1.0,2017-11-29 23:11:31
 */
public class Nation implements Serializable {

    private static final long serialVersionUID = 6009769501750512L;

    private Integer id;//

    private String code;//编码

    private String province;//

    private String city;//

    private String district;//

    private String parent;//

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getParent() {
        return this.parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }


//    public static void main(String[] args) {
//
//        //从数据库查询所有的省
//        List<Nation> listprovince = new ArrayList<Nation>();
//        for(Nation nation :listprovince){
//            JedisClusterUtil.jedisCluster.hset("province",nation.getId().toString(), JSON.toJSONString(nation));
//        }
//        //province
//        //查询所有的城市
//        //city
//        List<Nation> city = new ArrayList<Nation>();
//        for(Nation p :listprovince){
//            List<Nation> list = new ArrayList<Nation>();
//            for(Nation nation :city){
//                if(p.getId().toString().equals(nation.getParent())){
//                    list.add(nation);
//                }
//            }
//            JedisClusterUtil.jedisCluster.hset("city",p.getId().toString(), JSON.toJSONString(list));
//            //JedisClusterUtil.jedisCluster.hget("city",shengid);
//        }
//
//        //district
//        List<Nation> district = new ArrayList<Nation>();
//        for(Nation p :city){
//            List<Nation> list = new ArrayList<Nation>();
//            for(Nation nation :district){
//                if(p.getId().toString().equals(nation.getParent())){
//                    list.add(nation);
//                }
//            }
//            JedisClusterUtil.jedisCluster.hset("district",p.getId().toString(), JSON.toJSONString(list));
//
//            //String json = JedisClusterUtil.jedisCluster.hget("district".cityid);
//           // List<Nation> nations = JSON.parseArray(json, Nation.class);
//        }
//
//
//
//    }

}
