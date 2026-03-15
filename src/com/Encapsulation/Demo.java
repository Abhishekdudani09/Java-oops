package com.Encapsulation;


//this keyword
//
//1. The most common use of this is to distinguish between instance variables (fields) and local variables or parameters when they have the same name
//2. `this' keyword is reference variable that refers to the current object


class Main01{

    String name;
    int age;

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


}


public class Demo {

    public static void main(String[] args) {
        Main01 m=new Main01();

        m.setName("Abhishek");
        m.setAge(25);

        System.out.println(m.getName() + " " + m.getAge());

    }

}
