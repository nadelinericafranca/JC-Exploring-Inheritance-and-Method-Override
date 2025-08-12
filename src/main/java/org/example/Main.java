package org.example;

public class Main {
    public static void main(String[] args) {
        // Exercise 1 - Basic Inheritance: The extends Keyword
//        Car myCar = new Car();
//        myCar.honk();
//        myCar.display();

        // Exercise 1 Mini Challenge
//        Bicycle myBicycle = new Bicycle();
//        System.out.print("Bicycle says: ");
//        myBicycle.honk();
//        System.out.print("Bicycle says: ");
//        myBicycle.ringBell();

        // Exercise 2 - Abstract Classes: Defining a Template
//        Circle myCircle = new Circle();
//        System.out.println(myCircle.display());
//
//        Rectangle myRectangle = new Rectangle();
//        System.out.println(myRectangle.display());

        // Exercise 2 Mini Challenge
//        Dog myDog = new Dog();
//        myDog.breathe();
//        myDog.makeSound();

        // Exercise 3 - Method Overriding: Providing a New Implementation
//        Editor myEditor = new Editor();
//        CodeEditor myCodeEditor = new CodeEditor();
//        Editor polyEditor = new CodeEditor();
//
//        System.out.println("--- Regular Editor ---");
//        myEditor.openFile();
//
//        System.out.println("\n--- Code Editor ---");
//        myCodeEditor.openFile();
//
//        System.out.println("\n--- Polymorphic Editor ---");
//        polyEditor.openFile();

        // Exercise 3 Mini Challenge
//        GameCharacter regularChar = new GameCharacter(100);
//        ArmoredCharacter armoredChar = new ArmoredCharacter(100);
//
//        regularChar.takeDamage(100);
//        System.out.println("Regular character takes " + regularChar.damage + " damage. New health: " + regularChar.health);
//        armoredChar.takeDamage(100);
//        System.out.println("Armored character takes " + armoredChar.damage + " damage. New health: " + armoredChar.health);

        // Exercise 4 - Inheriting Variables & Access Rules
        CheckingAccount myChecking = new CheckingAccount(100.0);
         myChecking.deductMonthlyFee();
    }
}