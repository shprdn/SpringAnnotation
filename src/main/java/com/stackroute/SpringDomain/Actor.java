package com.stackroute.SpringDomain;

public class Actor {
    //data members
    private String name;
    private String gender;
    private int age;


    //constructor
    public Actor() {
    }

    //Constructor DI
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //getters for data members
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

}
