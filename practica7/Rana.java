
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Rana extends Animal{
    
    // Variables de instancia
    private String nombre;
    private String veneno_mata;
    private String familia;
    private String comida;

    // Constructor que recibe nombre, veneno, familia, comida
    public Rana(String nombre, String veneno_mata, String familia, String comida) {
        super("rana");
        this.nombre = nombre;
        this.veneno_mata = veneno_mata;
        this.familia = familia;
        this.comida = comida;
    }

    // Metodo que establece el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo que regresa el nombre
    public String getNombre() {
        return nombre;
    }
    
    // Metodo que regresa el veneno
    public String getVeneno_mata() {
        return veneno_mata;
    }
    
    // Metodo que establece la comida
    public void setComida(String comida){
        this.comida = comida;
    }

    // Metodo que era abstracto y se instancia
    @Override
    public String sonido() {
        return "croak, croak";
    }

    // Metodo que era abstracto y se instancia
    @Override
    public String actitud() {
        return "saltar y lanzar su estomago";
    }

    // Metodo toString que regresa lo que el usuario vera
    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el " + this.familia + " la comida que come es " + this.comida;
    }
    
    
}
