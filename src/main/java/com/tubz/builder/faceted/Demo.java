package com.tubz.builder.faceted;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.name("Tubin")
                .livesSt().address("F GL").streetAddress("LB").postCode("NN£")
                .at().worksAt("Imm Sim").position("SE").salary("550000").build();
        System.out.println(person);

    }
}
