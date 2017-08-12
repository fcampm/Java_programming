/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Cylinder extends Circle{
   
    private double height = 1.0;
    
    public Cylinder(){
        
        super();
        this.height = 1.0;
    }
    
    public Cylinder(double radius){
        
        super(radius);
        this.height = 1.0;
    }
    
    public Cylinder(double radius, double height){
        
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        
        return super.getArea() * this.height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * this.radius * this.height)+ (2 * super.getArea()); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
