
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

    public Gato(String nombre, String raza, String comida) {
        super("gato");
        this.nombre = nombre;
        this.raza = raza;
        this.comida = comida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setComida(String comida){
        this.comida = comida;
    }

    @Override
    public String toString() {
        return super.toString() +" " + this.nombre + " el " + this.raza + " la comida que come es " + this.comida;
    }

    @Override
    public String sonido() {
        return "miau, miau";
    }

    @Override
    public String actitud() {
        return "afilar sus uñas en los muebles";
    }
    
    
}
