// Ghulam Ahmed     CS-113 002
//  Homework 4       2/22/2022

import java.util.Random;
import java.util.Scanner;
public class CircleTest{
    public static void main (String args[]){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int point1x, point1y, circle1Radius;
        double centerDistance, areaAvg;
        
        point1x = rand.nextInt(25) + 1;
        point1y = rand.nextInt(25) + 1;

        Point point1 = new Point(point1x, point1y);
        Point point2 = new Point(0,0);

        System.out.println("Enter the Radius for Circle 1:");
        circle1Radius = scan.nextInt();

        Circle circle1 = new Circle(circle1Radius, point2 );
        Circle circle2 = new Circle(10, point1);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);

        centerDistance = circle1.getCenter().distance(circle2.getCenter());
        System.out.println("Center Distance: " + centerDistance);

        if (circle1.equals(circle2)){
            System.out.println("The circles are equal");
        }
        else{
            System.out.println("The circles are not equal");
        }

        areaAvg = (circle1.area() + circle2.area())/2.0;
        System.out.println("The average area between Circle 1 and Circle 2 is: " + areaAvg);
    }
}

