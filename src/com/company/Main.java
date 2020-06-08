/*
 * Classname Main
 *
 * 07/06/2020
 *
 * Copyright Moskaliuk Ivanna KNUTE
 *
 * Module 2. Task 1.
 * Create a class from the attached document according to the order in your group .
    The class must contain
    1. Constructor.
    2.. Getters/Setters.
    3. 5 methods.
    4. Override toString() method
    5. Override hash() and equals() methods.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------OOP--------");

        Parallelepiped parallelepiped1 = new Parallelepiped(8, 5, 7);
        System.out.println(parallelepiped1);

        System.out.println("The area of the parallelepiped is " +
                parallelepiped1.getArea() + " sm.kv.");
        System.out.println("The volume of the parallelepiped is " +
                parallelepiped1.getVolume() + " sm.cub.");


        Phone myPhone = new Phone(12,
                6,
                "Samsung",
                18000,
                5.5,
                16,
                64,
                8);
        System.out.println(myPhone);

        Cube cube1 = new Cube(4,5,4,4);
        System.out.println(cube1);
        System.out.println(cube1.isCube());

    }
}
