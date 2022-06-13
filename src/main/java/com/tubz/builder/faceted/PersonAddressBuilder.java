package com.tubz.builder.faceted;

public class PersonAddressBuilder extends PersonBuilder{
    public  PersonAddressBuilder(Person person) {
        this.person = person;
    }

    public PersonAddressBuilder streetAddress(String streetAddress) {
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder address(String address) {
        person.address = address;
        return this;
    }

    public PersonAddressBuilder postCode(String postCode) {
        person.postCode = postCode;
        return this;
    }


}
