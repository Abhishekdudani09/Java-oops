package com.Inheritance;

//## Multiple inheritance
//
//- One class tries to inherit from the more than one parent class
//- java does not support with classes because it is diamond problem
//- it is pssible using interface.


interface A{
    void show();
}

interface B{
    void display();

}


class C implements A,B{
    public void show () {
        System.out.println("show method");
    }

    public void display() {
        System.out.println("Display method");

    }
}


public class Main04 {

    public static void main(String[] args) {
        C obj=new C();

        obj.show();
        obj.display();

    }

}

