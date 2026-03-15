package com.Inheritance;


//single inheritance:- it is mechanism where one class inherits the properties of derived class


class Animal{

    public void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal{
    public void bark() {
        System.out.println("barking");
    }
}



public class Main {

    public static void main(String[] args) {

        Dog obj=new Dog();

        obj.eat();
        obj.bark();
    }

}

