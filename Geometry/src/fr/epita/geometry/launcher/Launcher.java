package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Triangle;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TransferQueue;

public class Launcher {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        double areaC1 = c1.calculateDiameter();
        double diameterC1 = c1.calculatePerimeter();

        System.out.println("Area for C1: " + areaC1);
        System.out.println("Diameter for C1: " + diameterC1);


        Circle c2 = new Circle(100);
        double areaC2 = c2.calculateDiameter();
        double diameterC2 = c2.calculatePerimeter();

        System.out.println("Area for C2: " + areaC2);
        System.out.println("Diameter for C2: " + diameterC2);

        //for each loop
        double globalDiameter = 0.0;
        double globalPerimeter = 0.0;
        List<Circle> circles = Arrays.asList(c1, c2);
        //circles is the name of the list

        for(Circle circle : circles){
            //we iterate over circles each time to store in circle variable

            globalDiameter += circle.calculateDiameter();
            //it replaces indexing like we do for the for loop

            globalPerimeter += circle.calculatePerimeter();
            //it appends or adds
        }

        System.out.println("Diameter for circle: " + globalDiameter);
        System.out.println("Perimeter for circle: " + globalPerimeter);


        //Triangle
        Triangle t1 = new Triangle(10, 30);
        double areaT1 = t1.calculateArea();
        double perimeterT1 = t1.calculatePerimeter();

        System.out.println("Area for triangle: " + areaT1);
        System.out.println("Perimeter for triangle: " + perimeterT1);


        Triangle t2 = new Triangle(20, 45);
        double areaT2 = t2.calculateArea();
        double perimeterT2 = t2.calculatePerimeter();

        System.out.println("Area for triangle: " + areaT2);
        System.out.println("Perimeter for triangle: " + perimeterT2);

        //Data Structures
        List<Triangle> triangles = Arrays.asList(t1, t2);

        //For Each LOOP
        double globalAreaTriangle = 0.0;
        double globalPerimeterTriangle = 0.0;

        for(Triangle triangle : triangles){
            globalAreaTriangle += triangle.calculateArea();
            globalPerimeterTriangle += triangle.calculatePerimeter();
        }

        System.out.println("Area for the Triangle: " + globalAreaTriangle);
        System.out.println("Perimeter for the Triangle: " + globalPerimeterTriangle);

    }
}
