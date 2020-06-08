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

public class Rectangle {

    private int length;
    private int width;

    // Constructor full

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // getters and setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // method for finding the perimeter

    public double getPerimeter() {
        return 2 * (this.getLength() + this.getWidth());
    }

    // method for finding the area

    public double getArea() {
        return this.getLength()* this.getWidth();
    }

    // method toString() for class Rectangle
    @Override
    public String toString() {
        return "Rectangle{" +
                "length = " + length +
                ", width = " + width +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea() +
                '}';
    }
}
