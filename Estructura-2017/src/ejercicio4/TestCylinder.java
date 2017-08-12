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
public class TestCylinder {
   
    public static void main(String[] args) {
        
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" 
        + " radius=" + c1.getRadius()
        + " height=" + c1.getHeight()
        + " base area=" + c1.getArea()
        + " volume=" + c1.getVolume()
        + " color=" + c1.getColor());
        
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
        + " radius=" + c2.getRadius()
        + " height=" + c2.getHeight()
        + " base area=" + c2.getArea()
        + " volume=" + c2.getVolume()
        + " color=" + c2.getColor());
        
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
        + " radius=" + c3.getRadius()
        + " height=" + c3.getHeight()
        + " base area=" + c3.getArea()
        + " volume=" + c3.getVolume()
        + " color=" + c3.getColor());
        
        Cylinder c4 = new Cylinder(4.0, 12.0, "purple");
        System.out.println("Cylinder:"
        + " radius=" + c4.getRadius()
        + " height=" + c4.getHeight()
        + " base area=" + c4.getArea()
        + " volume=" + c4.getVolume()
        + " color=" + c4.getColor());
    }
}
