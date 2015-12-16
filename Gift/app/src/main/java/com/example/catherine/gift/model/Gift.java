package com.example.catherine.gift.model;

import java.io.Serializable;

/**
 * Created by catherine on 15/12/14.
 */
public class Gift implements Serializable {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
