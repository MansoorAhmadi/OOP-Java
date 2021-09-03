//TRIANGLE CLASS
package Geometry;

public class Triangle {
    private double sideA;
    private double sideB;
    private double base;
    private double height;

    public Triangle(double sideA, double sideB, double base, double height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.base = base;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return this.height * this.base / 2;
    }

    public double calculatePerimeter(){
        return this.sideA + this.sideB + this.base;
    }

}




//MAIN 
package Geometry;


import java.awt.*;
import java.util.ArrayList;
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

        List<Double> circles = Arrays.asList(c1Area,c2Area);

        double globalArea = 0.0;
        double globalPerimeter = 0.0;

//        for (Double myCircle: circles) {
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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for the square area: ");
        double squareAreaAsDouble = firstSquare.calculateArea();
        System.out.println("The result for the square input is:" + " " + squareAreaAsDouble);

        System.out.println("Enter a value for the square perimeter: ");
        double squarePerimeterAsDouble = firstSquare.calculatePerimeter();
        System.out.println("The result for the perimeter input is:" + " " + squarePerimeterAsDouble);


        System.out.println("TRIANGLE STARTS HERE");

        List<Shape> shapeList = new ArrayList<>();

        Triangle triangle1 = new Triangle(1,2,3,4);
        Triangle triangle2 = new Triangle(10, 20,30,40);
        Triangle triangle3 = new Triangle(100,200,300,400);
        Triangle triangle4 = new Triangle(1000,2000,3000,4000);

        double area = 0.0;
        for (Shape shape : shapeList) {
            area += shape.calculateArea();
            System.out.println(shape.getClass());
            //type casting example:
            if ( shape instanceof Triangle){
                Triangle triangle = (Triangle) shape;
                System.out.println("triangle base : " + triangle.getBase());
            }
        }
        scanner.close();
    }
}
