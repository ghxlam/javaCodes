// Ghulam Ahmed     CS-113  002  
// Homework 4      2/22/2022

import java.util.Scanner;
import java.util.Random;
public class Circle{

    private int radius;
    private Point center;

    public Circle ( int radius, Point center){
        this.center = center;
        this.radius = radius;
    }


    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public Point getCenter(){
        return center;
    }

    public boolean equals(Circle other){
        return radius == other.getRadius();
    }

    public double area(){
        return Math.PI * Math.pow(radius,2);
    }

    public String toString(){
        return ("The center of the circle is at " + center  + ". The area of the circle is " + area() + " units " + "squared and the radius is " + radius);
    }

}
