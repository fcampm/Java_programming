
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Perro extends Animal{
    
    // Variables de instancia.
    private String nombre;
    private String raza;
    private String comida;

    // COnstructor que recibe nombre, raza, comida
    public Perro(String nombre, String raza, String comida) {
        super("perro");
        this.nombre = nombre;
        this.raza = raza;
        this.comida = comida;
    }

    // Metodo que establece el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Metodo toString que imprime lo que el ususario vera
    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el " + this.raza + " la comida que come es " + this.comida;
    }

    // Metodo que era abstracto y que se instancia
    @Override
    public String sonido() {
        return "woof, woof";
    }

    // Metodo que era abstracto y que se instancia
    @Override
    public String actitud() {
        return "agitar la cola cuando su amo llega";
    }
    
    // Metodo que establece la comida
    public void setComida(String comida){
        this.comida = comida;
    }
}
