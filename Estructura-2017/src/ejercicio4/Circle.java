
package ejercicio4;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Circle {
    
    // Instance variables, they are protected beacuse we will import them using heritage.
    protected double radius = 1.0;
    protected String color = "red";
    
    // Default constructor.
    public Circle(){
        
        this.radius = 1.0;
        this.color = "red";        
    }
    
    // Constructor that receives a radius and a default color.
    public Circle(double radius){
        
        this.radius = radius;
        this.color = "red";
    }
    
    // Constructor that receives a radius an a color.
    public Circle(double radius, String color){
        
        this.radius = radius;
        this.color = color;
    }

    // Method that returns the radius value.
    public double getRadius() {
        return radius;
    }

    // Method that returns the area of a circle after the calculation.
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method that returns the color value.
    public String getColor() {
        return this.color;
    }

    // Method that reassign the radius value.
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method that reassign the color value.
    public void setColor(String color) {
        this.color = color;
    }

    // toString Method that prints an output with the format the teacher asked.
    @Override
    public String toString() {
        return "Circle[" + "radius=" + radius + ", color=" + color + ']';
    }            
}
