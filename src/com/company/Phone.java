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

public class Phone extends Rectangle{

    // Create a child  from the class Rectangle

    String brand;
    int price;
    double diagonal;
    int сamera;
    int memoryCapacity;
    int numberOfProcessorCores;

    public Phone(int length, int width, String brand, int price, double diagonal, int сamera, int memoryCapacity, int numberOfProcessorCores) {
        super(length, width);
        this.brand = brand;
        this.price = price;
        this.diagonal = diagonal;
        this.сamera = сamera;
        this.memoryCapacity = memoryCapacity;
        this.numberOfProcessorCores = numberOfProcessorCores;
    }

    // getters and setters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public int getСamera() {
        return сamera;
    }

    public void setСamera(int сamera) {
        this.сamera = сamera;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    public int getNumberOfProcessorCores() {
        return numberOfProcessorCores;
    }

    public void setNumberOfProcessorCores(int numberOfProcessorCores) {
        this.numberOfProcessorCores = numberOfProcessorCores;
    }

    // method toString()
    @Override
    public String toString() {
        return "Phone{" +
                "length = " + super.getLength() +
                ", width = " + super.getWidth() +
                ", perimeter = " + super.getPerimeter() +
                ", area = " + super.getArea() +
                ", brand ='" + brand + '\'' +
                ", price =" + price +
                ", diagonal =" + diagonal +
                ", сamera =" + сamera +
                ", memoryCapacity =" + memoryCapacity +
                ", numberOfProcessorCores =" + numberOfProcessorCores +
                '}';
    }
}
