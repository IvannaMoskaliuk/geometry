/*
 * Classname Parallelepiped
 *
 * 07/06/2020
 *
 * Copyright Moskaliuk Ivanna KNUTE
 *
 * Module 2. Task 1.
 * Create a class from the attached document according to the order in your group .
    The class must contain
    1. Constructor.
    2. Getters/Setters.
    3. 5 methods.
    4. Override toString() method
    5. Override hash() and equals() methods.
 */
package com.company;

import java.util.Objects;

public class Parallelepiped {

    private int lengthA;
    private int widthB;
    private int heightC;

    // Constructor empty

    public Parallelepiped() {
    }

    // Constructor full

    public Parallelepiped(int lengthA, int widthB, int heightC) {
        this.lengthA = lengthA;
        this.widthB = widthB;
        this.heightC = heightC;
    }

    // Getters and Setters

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getWidthB() {
        return widthB;
    }

    public void setWidthB(int widthB) {
        this.widthB = widthB;
    }

    public int getHeightC() {
        return heightC;
    }

    public void setHeightC(int heightC) {
        this.heightC = heightC;
    }

    // the perimeter of the parallelepiped

    public int getPerimeterBase(){
        return 2 * ( this.lengthA + this.widthB);
    }

    // the area of the base of the parallelepiped

    public int getAreaBase(){
        return this.lengthA * this.widthB;
    }

    // the area of the side surface of the parallelepiped

    public int getAreaSideSurface(){
        return this.getPerimeterBase() * this.heightC ;
    }

    // the area of the parallelepiped

    public int getArea(){
        return this.getAreaSideSurface() + 2 * this.getAreaBase();
    }

    // the volume of the parallelepiped

    public int getVolume(){
        return this.getAreaBase() * this.heightC;
    }

    // Override toString() method

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "lengthA=" + lengthA +
                ", widthB=" + widthB +
                ", heightC=" + heightC +
                '}';
    }

    // Override hash() and equals() methods.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelepiped that = (Parallelepiped) o;
        return getLengthA() == that.getLengthA() &&
                getWidthB() == that.getWidthB() &&
                getHeightC() == that.getHeightC();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLengthA(), getWidthB(), getHeightC());
    }
}
