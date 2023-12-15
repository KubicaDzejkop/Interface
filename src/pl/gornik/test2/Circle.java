package pl.gornik.test2;

import static java.lang.Math.*;

public class Circle implements Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return PI * pow(radius, 2);
    }
}
