package parcial2;

/*
 * Clase Persona
 *
 * Autor: Angeles Junco 
 */
 
public class Persona {
    protected String nombre;
    protected String apellido;
    
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    @Override
    public String toString() {
        return "nombre=" + nombre + ", apellido=" + apellido;
    }
}
