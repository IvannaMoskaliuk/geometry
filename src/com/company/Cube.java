/*
 * Classname Rectangle
 *
 * 07/06/2020
 *
 * Copyright Moskaliuk Ivanna KNUTE
 *
 * Module 2. Task 2.
      Inheritance
    1. Create a child  from the class Rectangle.
    2. Create another class as a super class for your one.
        Or create a daughterly class for your one.
 */
package com.company;

public class Cube extends Parallelepiped{

    private int side;

    // Constructors

    public Cube(int side) {
        this.side = side;
    }

    public Cube(int lengthA, int widthB, int heightC, int side) {
        super(lengthA, widthB, heightC);
        this.side = side;
    }

    // Getters and Setters

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    // Method isCube

    public boolean isCube(){
        return ( this.getSide() == super.getLengthA() &&
                        this.getSide() == super.getWidthB() &&
                        this.getSide() == super.getHeightC() ? true : false);
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Cube{" +
                "lengthA=" + super.getLengthA() +
                ", widthB=" + super.getWidthB() +
                ", heightC=" + super.getHeightC() +
                ", side=" + this.getSide() +
                '}';
    }
}
