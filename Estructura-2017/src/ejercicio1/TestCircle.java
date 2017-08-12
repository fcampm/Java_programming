
package ejercicio1;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestCircle {
    // Main method.
    public static void main(String[] args) {
        
        // Object circle c1 that uses the default constructor.
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        
        // Object circle c2 that uses the constructor that receives a radius and the default color.
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        // Object circle c3 that uses the constructor that receives a radius and a color.
        Circle c3 = new Circle(3.0, "green");
        System.out.println("The circle color " + c3.getColor() + " has radius of " + c3.getRadius() + " and area of " + c3.getArea());
        
        // Object circle c4 that uses the default constructor.
        Circle c4 = new Circle();
        // Reassign the value of the radius variable.
        c4.setRadius(5.0);
        System.out.println("Circle 4 radius is: " + c4.getRadius());
        // Reassign the value of the color variable.
        c4.setColor("orange");
        System.out.println("Circle 4 color is: " + c4.getColor());
        
        System.out.println(c1.toString());
    }
}
