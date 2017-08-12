
package ejercicio1;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Circle {
    // Instance variables
    private double radius = 1.0;
    private String color = "red";
    
    // Default Constructor.
    public Circle(){
        
        this.radius = 1.0;
        this.color = "red";
        
    }
    
    // Constructor that receives a radius data and the color data it's the default data.
    public Circle(double radius){
        
        this.radius = radius;
        this.color = "red";
    }
    
    // Constrcutor that receives a radius and a color data.
    public Circle(double radius, String color){
        
        this.radius = radius;
        this.color = color;
    }

    // Method that returns the radius value.
    public double getRadius() {
        return radius;
    }

    // Method that returns the area value after calculating the area.
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method that returns the color value of the object Circle.
    public String getColor() {
        return this.color;
    }

    // Method that reassign the radius value.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method that reassign the color value of the object Circle.
    public void setColor(String color) {
        this.color = color;
    }

    // toString method that prints an output with the format the teacher asked.
    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ", color=" + color + ']';
    }           
}
