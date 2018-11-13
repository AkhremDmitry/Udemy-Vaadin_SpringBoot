package com.felix.mapped;

import javax.persistence.*;

@Entity
@Table
public class Person extends AbstractPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return name + "_" + age;
    }
}
