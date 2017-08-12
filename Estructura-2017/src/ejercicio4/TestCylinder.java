
package ejercicio4;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestCylinder {
   
    // Main method.
    public static void main(String[] args) {
        
        /* Creation of object Cylinder c1 using the default constructor 
           that prints radius, height, base area, volume and color.*/
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:" 
        + " radius=" + c1.getRadius()
        + " height=" + c1.getHeight()
        + " base area=" + c1.getArea()
        + " volume=" + c1.getVolume()
        + " color=" + c1.getColor());
        
        /* Creation of object Cylinder c2 using the constructor that receives a radius value
           that prints radius, height, base area, volume and color.*/
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
        + " radius=" + c2.getRadius()
        + " height=" + c2.getHeight()
        + " base area=" + c2.getArea()
        + " volume=" + c2.getVolume()
        + " color=" + c2.getColor());
        
        /* Creation of object Cylinder c3 using the constructor that receives a radius value
           and a height value that prints radius, height, base area, volume and color.*/
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
        + " radius=" + c3.getRadius()
        + " height=" + c3.getHeight()
        + " base area=" + c3.getArea()
        + " volume=" + c3.getVolume()
        + " color=" + c3.getColor());
        
        /* Creation of object Cylinder c2 using the constructor that receives a radius value,
           a height value and a color value that prints radius, height, base area, volume and color.*/
        Cylinder c4 = new Cylinder(4.0, 12.0, "purple");
        System.out.println("Cylinder:"
        + " radius=" + c4.getRadius()
        + " height=" + c4.getHeight()
        + " base area=" + c4.getArea()
        + " volume=" + c4.getVolume()
        + " color=" + c4.getColor());
    }
}
