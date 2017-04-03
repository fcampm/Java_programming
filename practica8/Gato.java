
package practica8;

/**
 *
 * @author root
 */
public class Gato extends Animal implements Mascota{
    
    private String nombre;
    
    public Gato(String nombre) {
        super(4);
        this.nombre = nombre;
    }

    public Gato(Gato g){
  
        this("Pepelepu");
    }

    @Override
    public String comer() {
        return "come lassagna de queso con ratones salteanos en ajo al vapor";
    }

    @Override
    public String regresarNombre() {
        return this.nombre;
    }

    @Override
    public void cambiarNombre(String n) {
        this.nombre = n;
    }
    
    @Override
    public String jugar() {
        return "juega con una bola de estambre y con los sentimientos de el";
    }

    @Override
    public String toString() {
        return "Un gato que se llama " + this.nombre + " que " + super.toString()+ " que " + jugar();
    }

    
   
    
    
}
