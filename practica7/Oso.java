
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Oso extends Animal{
    
    private String nombre;
    private String familia;
    private String comida;
    private String color;

    public Oso(String nombre, String familia, String comida, String color) {
        super("oso");
        this.nombre = nombre;
        this.familia = familia;
        this.comida = comida;
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String sonido() {
        return " grrr, grrr ";
    }

    @Override
    public String actitud() {
        return " acosar niñas pequeñas ";
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el oso " + this.familia + " la comida que come es " + this.comida;
    }
    
    
    
}
