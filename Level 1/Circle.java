//2
/* Write a program to create a Circle class with an attribute radius. Add methods to calculate and display the
area and circumference of the circle.
 */

import java.lang.Math;
public class Circle{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI*(radius*radius);
    }
    public double findCircumference(){
        return 2*Math.PI*radius;
    }
    public void display(double area, double circumference){
        System.out.println("Area - " + area);
        System.out.println("Circumference - " + circumference);
    }
    public static void main(String[] args) {
        Circle c1 = new Circle(2);
        double a = c1.findArea();
        double b = c1.findCircumference();
        c1.display(a, b);
    }
}
