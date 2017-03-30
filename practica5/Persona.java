
package practica5;

import java.util.Objects;

/**
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * 
 * Fecha: 27 Febrero, 2017.
 * 
 * Practica #5
 */
public class Persona {
    
    // Atributos de instancia que seran heradados por lo que se definen como protected.
    protected String nombre;
    protected String apellido;
    protected Fecha fecha;
    
    // Constructor de la clase persona que recibe como parametro el nombre, apellido y fecha que por medio de composicion es importada.
    public Persona(String nombre, String apellido, Fecha fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = new Fecha (fecha);
    }
    
    // Regresa el String con el nombre.
    public String getNombre() {
        return this.nombre;
    }
    
    // Regresa el String con el apellido.
    public String getApellido() {
        return this.apellido;
    }
    
    // Regresa la fecha.
    public Fecha getFecha() {
        return this.fecha;
    }
    
    // El toString imprime la salida esperada con el formato especificado en la practica5
    @Override
    public String toString() {
        return "\nNombre: " + this.nombre +
               "\nApellido: " + this.apellido +
               "\nFecha de nacimiento: " + this.fecha;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // Se valida que los dos objetos que vas a comparar que los objetos si existan; en caso de que uno de los dos no existe regresa false 
        if (obj == null) {
            return false;
        }
        // Se compara que sean de la misma clase en caso de que no sean de la misma clase regresa false
        if (getClass() != obj.getClass()) {
            return false;
        }
        // Se conoce como Downcast o especialización, o sea de un objeto abstracto especializa a un objeto especifico o sea, se especializa a persona
        final Persona other = (Persona) obj;
        
        // Se valida que el nombre de los objetos sean o no iguales, en caso de que no sean iguales regresa false
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        
        // Se valida que el apellido de los objetos sean o no iguales, en caso de que no sean iguales regresa false
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
}
