
package practica7;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 */
public abstract class Animal {
    
    // Variable de instancia.
    protected String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "Un " + this.tipoAnimal;
    }
    
    public abstract String sonido();
    public abstract String actitud();
}
