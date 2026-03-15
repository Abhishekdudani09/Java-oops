package com.Abstraction;

//- It is the process of hiding the implementation details and shwoing only essential features
//1. Abstract class:- It is restricted class cannot be used to create objects.( to access it it must be inherited from another class.
//2. Abstract method:- its is only used in abstract class and it does not have a body.


abstract class Animal{


    abstract void sound();

    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog obj=new Dog();

        obj.sound();
        obj.eat();
    }

}



