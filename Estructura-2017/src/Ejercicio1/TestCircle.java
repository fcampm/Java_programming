/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestCircle {
    
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle color " + c3.getColor() + " has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("Circle 4 radius is: " + c4.getRadius());
        c4.setColor("orange");
        System.out.println("Circle 4 color is: " + c4.getColor());
        
        System.out.println(c1.toString());
    }
}
