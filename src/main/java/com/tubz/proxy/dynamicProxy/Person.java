package com.tubz.proxy.dynamicProxy;

public class Person implements Human
{
    @Override
    public void walk() {
        System.out.println("I am Walking");
    }

    @Override
    public void talk() {
        System.out.println("I am talking");
    }
}
