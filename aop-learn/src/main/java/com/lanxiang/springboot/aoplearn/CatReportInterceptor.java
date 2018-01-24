package com.lanxiang.springboot.aoplearn;

import java.lang.annotation.Annotation;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * Created by lanxiang on 2018/1/3.
 */
public class CatReportInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Annotation[] annotations = methodInvocation.getMethod().getDeclaredAnnotations();
        System.out.println("method annotation : " + annotations[0]);
        return methodInvocation.proceed();
    }
}
