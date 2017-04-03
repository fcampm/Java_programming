
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public class Gato extends Animal{
    
    // Variables de instancia.
    private String nombre;
    private String raza;
    private String comida;

    // Constructor que recibe nombre, raza y comida
    public Gato(String nombre, String raza, String comida) {
        super("gato");
        this.nombre = nombre;
        this.raza = raza;
        this.comida = comida;
    }

    // Metodo que establece el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Metodo que establece la comida
    public void setComida(String comida){
        this.comida = comida;
    }

    // Metodo toString que imprime lo que el usuario vera
    @Override
    public String toString() {
        return super.toString() +" " + this.nombre + " el " + this.raza + " la comida que come es " + this.comida;
    }

    // Metodo que era abstracto y que se instancia
    @Override
    public String sonido() {
        return "miau, miau";
    }

    // Metodo que era abstracto y que se instancia
    @Override
    public String actitud() {
        return "afilar sus uñas en los muebles";
    }
    
    
}
