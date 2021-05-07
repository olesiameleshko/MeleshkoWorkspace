package com.olesiameleshko.homework5.Task1;
//Task 1
public class FirstClass {
    private double height;
    private double weight;
    private double depth;

    public FirstClass (double height, double weight, double depth) {
        this.height = height;
        this.weight = weight;
        this.depth = depth;
    }
    public double getArea () {
        return weight * height * depth;
    }
}
