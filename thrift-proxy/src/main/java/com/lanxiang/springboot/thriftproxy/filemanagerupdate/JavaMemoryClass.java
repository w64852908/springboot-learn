package com.lanxiang.springboot.thriftproxy.filemanagerupdate;

import javax.tools.JavaFileObject;
import javax.tools.SimpleJavaFileObject;

/**
 * Created by lanxiang on 2018/7/30.
 */
public class JavaMemoryClass extends SimpleJavaFileObject {

    private String className;

    public JavaMemoryClass(String className) {
        super();
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
