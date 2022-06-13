package com.tubz.builder.fluent;

public class Demo {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Person tubin_shaji = employeeBuilder.withName("Tubin Shaji").worksAt("IT").build();
        System.out.println(tubin_shaji);
    }
}
