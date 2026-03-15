package com.Inheritance;


//Multiple child class inherit from the same parent class


class Animal03{

    public void eat() {
        System.out.println("animal is eating");

    }
}

class Dog04 extends Animal03{

    public void bark() {
        System.out.println("Dog is barking");
    }
}


class Cat extends Animal03{

    void meow() {
        System.out.println("meowing");
    }

}
public class Main03 {

    public static void main(String[] args) {

        Dog04 d=new Dog04();
        Cat c=new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();

    }

}
