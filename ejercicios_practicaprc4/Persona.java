package ejercicios_practicaprc4;

/* 
 * Clase Persona
 * Autor: Angeles Junco
 */

public class Persona {
    
    protected String nombre;
    protected String apellido;
    protected Fecha fechaNacimiento;
    
    public Persona(String nombre, String apellido, Fecha fecha){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = new Fecha(fecha);
    }

    public String getApellido() {
        return this.apellido;
    }

    public Fecha getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    @Override
    public String toString() {
        return "Nombre : " + this.nombre + "\nApellido : " + this.apellido + "\nFecha nacimiento : " + this.fechaNacimiento;
    }
}