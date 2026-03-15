package com.Encapsulation;


  class Human {



    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name=n;
    }

    public void setAge(int a) {
        age= a;
    }

}


public class Main {

    public static void main(String[] args) {

        Human obj=new Human();

        obj.setAge(25);
        obj.setName("John");

        System.out.println("The name is:" + obj.getName());
        System.out.println("The Age is:" + obj.getAge());


    }

}
