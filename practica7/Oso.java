
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Oso extends Animal{
    
    // Variables de instancia
    private String nombre;
    private String familia;
    private String comida;
    private String color;

    // Constructor que recibe nombre, familia, comida y color
    public Oso(String nombre, String familia, String comida, String color) {
        super("oso");
        this.nombre = nombre;
        this.familia = familia;
        this.comida = comida;
        this.color = color;
    }

    // Metodo que establece el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo que establece la comida
    public void setComida(String comida) {
        this.comida = comida;
    }

    // Metodo que regresa el nombre
    public String getNombre() {
        return nombre;
    }

    // Metodo que regresa el color
    public String getColor() {
        return color;
    }

    // Metodo que era abstracto que se instancia
    @Override
    public String sonido() {
        return " grrr, grrr ";
    }

    // Metodo que era abstracto que se instancia
    @Override
    public String actitud() {
        return " acosar niñas pequeñas ";
    }

    // Metodo toString que regresa lo que el usuario vera
    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el oso " + this.familia + " la comida que come es " + this.comida;
    }
    
    
    
}
