package com.Inheritance;


//where a class inherits from another class and that class is also inherited from another class
class Animal01{

    public void eat() {
        System.out.println("animal is eating");
    }

}


class Dog01 extends Animal01{
    public void bark() {
        System.out.println("Dog is barking");
    }
}


class Puppy extends Dog01{

    public void  weep() {
        System.out.println("puppy is weeping");
    }
}



public class Main01 {

    public static void main(String[] args) {

        Puppy obj=new Puppy();

        obj.eat();
        obj.bark();
        obj.weep();

    }

}