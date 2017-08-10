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
public class Circle {
    
    private double radius = 1.0;
    private String color = "red";
    
    public Circle(){
        
        this.radius = 1.0;
        this.color = "red";
        
    }
    
    public Circle(double radius){
        
        this.radius = radius;
        this.color = "red";
    }
    
    public Circle(double radius, String color){
        
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ", color=" + color + ']';
    }
    
    
    
}
