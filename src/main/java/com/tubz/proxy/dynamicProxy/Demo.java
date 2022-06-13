package com.tubz.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

public class Demo {

    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(itf.getClassLoader(), new Class<?>[]{itf}, new LoggingHandler(target));
    }


    public static void main(String[] args) {

    Person person = new Person();
        Human human = withLogging(person, Human.class);
        human.talk();
        human.walk();
        human.walk();
        System.out.println(human.toString());
    }
}
