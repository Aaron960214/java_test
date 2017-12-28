package org.lqb.java.Test171011;

public enum Test1011 {

    DOG("dog"),BAT("bat"),CAT("cat"),LEFT("left");

    public  String name;

    //枚举的构造方法必须为私有
    private Test1011(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
