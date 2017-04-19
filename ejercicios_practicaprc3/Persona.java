/* 
 * Clase Fecha
 * Autor: Angeles Junco
 */

package ejercicios_practicaprc3;

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected Fecha fechaNacimiento;
    
    
    public Persona(String nombre, String apellido, Fecha fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = new Fecha(fechaNacimiento);
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public Fecha getFechaNacimiento() {
        return this.fechaNacimiento;
    }

   @Override
    public String toString() {
        return "\nNombre: " + this.nombre + 
                "\nApellido: " + this.apellido + 
                "\nFecha nacimiento: " + this.fechaNacimiento;
    }
   
}
