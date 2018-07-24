package com.lanxiang.springboot.thriftproxy;


import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.junit.Test;

/**
 * Created by lanxiang on 2018/7/24.
 */
public class DynamicCompile {

    private static final String FILE_PATH = "/Users/lanxiang/IdeaProject/springboot-learn/thrift-proxy/src/main/resources/com/lanxiang/springboot/thriftproxy/aftergen/thrift";

    private static final String THRIFT_JAR_PATH = "/Users/lanxiang/.m2/repository/org/apache/thrift/libthrift/0.11.0/libthrift-0.11.0.jar";

    private static final String SLF4j_API_PATH = "/Users/lanxiang/.m2/repository/org/slf4j/slf4j-api/1.7.12/slf4j-api-1.7.12.jar";

    private static final String CLASS_OUTPUT_PATH = "/Users/lanxiang/Documents/work/IdeaProject/springboot-learn/thrift-proxy/src/main/resources";

    @Test
    public void compileJava() throws Exception {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardJavaFileManager = compiler.getStandardFileManager(null, null, null);

        File folder = new File(FILE_PATH);
        File[] files = new File[folder.listFiles().length];
        int i = 0;
        for (File file : folder.listFiles()) {
            if (file.getName().endsWith(".java")) {
                files[i] = file;
                i++;
            }
        }
        files = Arrays.copyOf(files, i);

        Iterable<? extends JavaFileObject> it = standardJavaFileManager.getJavaFileObjects(files);

        List<String> options = Arrays.asList(
                //编译后的class文件存放目录，目录必须存在
                "-d", CLASS_OUTPUT_PATH,
                //编译的java文件依赖的jar包
                "-classpath", THRIFT_JAR_PATH + ":" + SLF4j_API_PATH
        );
        JavaCompiler.CompilationTask task = compiler.getTask(null, standardJavaFileManager, null, options, null, it);
        task.call();

        invokeClass();

        standardJavaFileManager.close();
    }

    @Test
    public void invokeClass() throws Exception {

        Object objService = Class.forName("com.lanxiang.springboot.thriftproxy.aftergen.thrift.Sysout").newInstance();
        Class<?> clazz = objService.getClass();
        Method method = clazz.getMethod("printWord", null);

        method.invoke(objService, null);

    }
}
