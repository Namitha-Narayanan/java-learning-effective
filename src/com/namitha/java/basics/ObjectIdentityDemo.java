package com.namitha.java.basics;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

public class ObjectIdentityDemo {

    public static void main(String[] args) {

        Person p1 = new Person("Namitha");
        Person p2 = new Person("Namitha");

        System.out.println(p1 == p2);
        System.out.println(p1.name.equals(p2.name));
    }
}
