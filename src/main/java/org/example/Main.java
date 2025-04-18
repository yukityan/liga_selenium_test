package org.example;

public class Main {
    public static void main(String[] args) {

        Cat firstCat = new  Cat("nut", "white", 3);

        Cat secondCat = new  Cat("timon", "black", 2);

        System.out.println("first cat " + firstCat.getName()+ " " + firstCat.getAge() );
        System.out.println("second cat " + secondCat.getName()+ " " + secondCat.getAge() );
        }
    }