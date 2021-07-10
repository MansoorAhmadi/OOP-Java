package fr.epita.geometry.datamodel;

public class Triangle {
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double calculateArea(){
        return (base * this.height) / 2;
    }

    public double calculatePerimeter(){
        return base + height;
    }
}
