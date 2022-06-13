package com.tubz.builder.faceted;

public class PersonEmploymentDetailsBuilder extends PersonBuilder {
    public PersonEmploymentDetailsBuilder(Person person) {
        this.person = person;
    }


    public PersonEmploymentDetailsBuilder worksAt(String worksAt) {
        person.worksAt = worksAt;
        return this;
    }

    public PersonEmploymentDetailsBuilder salary(String salary) {
        person.salary = salary;
        return this;
    }

    public PersonEmploymentDetailsBuilder position(String position) {
        person.position = position;
        return this;
    }
}
