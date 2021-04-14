package com.java.javaConcepts;

public class ChildClass extends ParentClass {

    public ChildClass(){
        super();
    }

    public void displayWelcome(){
        System.out.println("Welcome from ChildClass");

    }

    public void displayStop(){
        System.out.println("I am going to Stop ");
    }

    public static void main(String args[]){

        ChildClass childClassObject = new ChildClass();


    }
}
