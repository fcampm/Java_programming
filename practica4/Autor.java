
package practica4;

/**
 *
 * @author Fabián
 */
public class Autor {
    
    private String nombre;
    private String email;
    private char genero;

    public Autor(String nombre, String email, char genero) {
        this.nombre = nombre;
        this.email = email;
        this.genero = genero;
    }

    // Constructor de copia
    public Autor(Autor a) {
        this.nombre = a.nombre;
        this.email = a.email;
        this.genero = a.genero;
    }

    
    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + "(" + genero + ")" + "at " + email ;
    }
    
    
}
