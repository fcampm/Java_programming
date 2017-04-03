
package practica8;

/**
 *
 * @author root
 */
public class Arana extends Animal{

    public Arana() {
        super(8);
    }

    
    @Override
    public String comer() {
        return " come hobbits y orcos a las brasas";
    }

    @Override
    public String toString() {
        return "La arana " + super.toString();
    }
    
    
    
}
