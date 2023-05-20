package com.nanda.java.patterns.builder;



public class PersonRequest {

    private Person person;

    public PersonRequest(Builder builder) {
        this.person = new Person(builder.name, builder.age, builder.mobileNumber);
        this.person.setEmail(builder.email);
    }

    public Person getPerson() {
        return person;
    }

    static class Builder {

        private String name;
        private int age;
        private String email;
        private int mobileNumber;


        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder mobileNumber(int mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Person build() {
           return new PersonRequest(this).getPerson();
        }
    }
}
