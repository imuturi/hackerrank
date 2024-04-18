package com.midas.hackerrank.utils;

public class Person {
    String name;
    int netWorth;
    int age;

    public Person(String name, int netWorth, int age) {
        this.name = name;
        this.netWorth = netWorth;
        this.age = age;
    }

    public Person(String name, int netWorth) {
        this.name = name;
        this.netWorth = netWorth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(int netWorth) {
        this.netWorth = netWorth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
