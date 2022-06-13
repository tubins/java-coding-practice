package com.tubz.builder.faceted;

public class PersonBuilder {
    protected Person person = new Person();
    public Person build() {
        return person;
    }

    public PersonBuilder name( String name) {
        person.name = name;
        return this;
    }

    public  PersonAddressBuilder livesSt() {
        return new PersonAddressBuilder(this.person);
    }
    public  PersonEmploymentDetailsBuilder at() {
        return new PersonEmploymentDetailsBuilder(this.person);
    }

}
