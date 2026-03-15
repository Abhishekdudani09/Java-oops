package com.Polymorphism;

//Polymorphism in Java means "one name, many forms."
// --->It allows a single method or object to behave differently depending on the situation.

//Java mainly supports two types of polymorphism:
// 1.Compile Time Polymorphism (Method Overloading)
// 2.Runtime Polymorphism (Method Overriding)


class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {

    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}