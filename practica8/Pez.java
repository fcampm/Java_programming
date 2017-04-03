
package practica8;

/**
 *
 * @author root
 */
public class Pez extends Animal implements Mascota{
    
    private String nombre;

    public Pez(String nombre) {
        super(0);
        this.nombre = nombre;
    }

    @Override
    public String comer() {
        return "come planckton y kamgreburguers";
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
        return "saliendo disparado del monte Kikirizquiaga";
    }
    
    @Override
    public String caminar(){
        return "no puede caminar";
    }

    @Override
    public String toString() {
        return "Un pez que se llama " + this.nombre + " que " + caminar() + " que " + comer() + " y juega " + jugar();
    }
    
    
    
}
