package com.lanxiang.springboot.thriftproxy;

import org.junit.Test;

/**
 * Created by lanxiang on 2018/7/23.
 */
public class GenThriftAndCompile {


    private static final String FOLDER = "/Users/lanxiang/IdeaProject/springboot-learn/thrift-proxy/src/main/resources/";

    private static final String THRIFT_FILE_NAME = "CinemaRelationRemoteService.thrift";

    private static final String THRIFT_2_JAVA_CMD = "thrift -out %s --gen java %s";

    private static final String JAVA_2_CLASS_CMD = "javac -d %s %s/*.java";

    @Test
    public void genThrift() throws Exception {
        String command = String.format(THRIFT_2_JAVA_CMD, FOLDER, FOLDER + THRIFT_FILE_NAME);
        System.out.println(command);
        Runtime.getRuntime().exec(command);
//        Process process = Runtime.getRuntime().exec(command);
//        process.waitFor();
    }

    @Test
    public void compileJava() throws Exception {
    }
}
