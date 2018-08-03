package com.lanxiang.springboot.thriftproxy.filemanagerupdate;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;

import org.junit.Test;

import sun.misc.IOUtils;


/**
 * Created by lanxiang on 2018/7/25.
 */
public class DynamicCompileTest {

    @Test
    public void run() throws Exception {
        String fullName = "com.lanxiang.springboot.thriftproxy.onlinecase.MyClass";
        String filePath = "/Users/lanxiang/Documents/work/IdeaProject/springboot-learn/thrift-proxy/src/main/java/com/lanxiang/springboot/thriftproxy/onlinecase/MyClass.java";
        innerCompileAndLoadClass(fullName, filePath);
    }

    private void innerCompileAndLoadClass(String fullName, String filePath) throws Exception {
        File file = new File(filePath);
        InputStream in = new FileInputStream(file);
        byte[] bytes = IOUtils.readFully(in, -1, false);

        String src = new String(bytes);
        in.close();

        System.out.println(src);
        DynamicEngine de = DynamicEngine.getInstance();
        Object instance = de.javaCodeToObject(fullName, src.toString());

        Method method = instance.getClass().getMethod("say", String.class);

        Object result = method.invoke(instance, "lanxiang");
        System.out.println(result);
        System.out.println(instance);
    }

    public static Object compileAndLoadClass(String fullName, String filePath) throws Exception {
        File file = new File(filePath);
        InputStream in = new FileInputStream(file);
        byte[] bytes = IOUtils.readFully(in, -1, false);

        String src = new String(bytes);
        in.close();

        System.out.println(src);
        DynamicEngine de = DynamicEngine.getInstance();
        return de.javaCodeToObject(fullName, src.toString());
    }
}
