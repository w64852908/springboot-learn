package com.lanxiang.springboot.thriftproxy.aftergen.thrift;

/**
 * Created by lanxiang on 2018/7/24.
 */
public class Sysout {

    public Lanxiang printWord() {
        Lanxiang lanxiang = new Lanxiang();
        lanxiang.setName("lanxiang");
        lanxiang.setAge(20);
        System.out.println(lanxiang);
        return lanxiang;
    }
}