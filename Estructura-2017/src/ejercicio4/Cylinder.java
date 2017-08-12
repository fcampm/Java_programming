
package ejercicio4;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Cylinder extends Circle{
   
    // Instance variables.
    private double height = 1.0;
    
    // Default constructor.
    public Cylinder(){
        
        // Uses the circle default constructor because cylinder extends circle.
        super();
        this.height = 1.0;
    }
    
    // Constructor that receives a radius.
    public Cylinder(double radius){
        
        // Uses the circle constructor that receive a radius and a default color.
        super(radius);
        this.height = 1.0;
    }
    
    // Constructor that receives a radius and a height.
    public Cylinder(double radius, double height){
        
        // Uses the circle constructor that receive a radius and a default color.
        super(radius);
        this.height = height;
    }
    
    // Constructor that receives a radius, a height and a color.
    public Cylinder(double radius, double height, String color){
        
        // Uses the circle constructor that receive a radius and a color.
        super(radius, color);
        this.height = height;
    }

    // Method that returns the height value.
    public double getHeight() {
        return this.height;
    }

    // Method that reassign the height value.
    public void setHeight(double height) {
        this.height = height;
    }
    
    // Method that returns the volume after the calculation of this.
    public double getVolume(){
        
        return super.getArea() * this.height;
    }

    // Method that overrides the method getArea of the circle to get the area of a cylinder.
    @Override
    public double getArea() {
        return (2 * Math.PI * this.radius * this.height)+ (2 * super.getArea()); //To change body of generated methods, choose Tools | Templates.
    }        
}
