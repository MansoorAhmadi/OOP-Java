package fr.epita.geometry.datamodel;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double calculateDiameter(){
        return Math.PI * Math.pow(this.radius,2);
        //Math utility is a better choice.
        //we multiply to the power of 2 in order to get the full diameter.
    }

    public double calculatePerimeter(){
        return Math.PI * 2 * this.radius;
        //formula to calculate the perimeter is: c=PI*d
        //c=circumference, PI=3.14159, d=diameter, d=2.PI
    }
}
