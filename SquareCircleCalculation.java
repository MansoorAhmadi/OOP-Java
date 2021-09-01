//SQUARE CLASS
package Geometry;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

//    public Square() {
//
//    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea(){
        return this.side * this.side;
    }

    public double calculatePerimeter(){
        return this.side * 4;
    }
}




//CIRCLE CLASS
package Geometry;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0){
            System.out.println("0 cannot be assigned, sorry");
            return;
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double calculatePerimeter() {
        return Math.PI * 2 * this.radius;
    }
}






//MAIN
package Geometry;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Circle circleOne = new Circle(9.5);
        double c1Area = circleOne.calculateArea();
        double c1Perimeter = circleOne.calculatePerimeter();


        Circle circleTwo = new Circle(15.6);
        double c2Area = circleTwo.calculateArea();
        double c2Perimeter = circleTwo.calculatePerimeter();

        if (circleOne.equals(circleTwo)){
            System.out.println("Circle one and two are equal.");
        }else {
            System.out.println("Circle one and two are not equal.");
        }

        //List<Circle> circles = Arrays.asList(c1Area,c2Area);

        double globalArea = 0.0;
        double globalPerimeter = 0.0;

//        for (Circle myCircle: circles) {
//            globalArea += myCircle.calculateArea();
//            globalPerimeter += myCircle.calculatePerimeter();
//        }

        System.out.println("Area for the circle is: " + globalArea);
        System.out.println("Area for the perimeter is: " + globalPerimeter);


        System.out.println("SQUARE STARTS HERE!");

        Square firstSquare = new Square(9.1);

        double calculateSquareArea = firstSquare.calculateArea();
        System.out.println("The calculated area is: " + calculateSquareArea);

        double calculateSquarePerimeter = firstSquare.calculatePerimeter();
        System.out.println("The calculated perimeter is: " + calculateSquarePerimeter);


        Square secondSquare = new Square(10.5);

        List<Square> myList = Arrays.asList(firstSquare, secondSquare);
        double globalSquareArea = 0.0;
        double globalSquarePerimeter = 0.0;

        for (Square mySquare: myList) {
            globalSquareArea += mySquare.calculateArea();
            globalSquarePerimeter += mySquare.calculatePerimeter();
        }
        System.out.println("Area for the square is: " + globalSquareArea);
        System.out.println("Area for the square perimeter is: " + globalSquarePerimeter);
    }
}


//OUTPUT
//Circle one and two are not equal.
//Area for the circle is: 0.0
//Area for the perimeter is: 0.0
//SQUARE STARTS HERE!
//The calculated area is: 82.80999999999999
//The calculated perimeter is: 36.4
//Area for the square is: 193.06
//Area for the square perimeter is: 78.4



