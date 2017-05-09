
package proyectofinal;

/**
 *
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota
 *          Lenin Silva Gutierrez
 */
public abstract class Persona {
    
    protected String nombre;
    protected String apellido;
    protected int numeroEmpleado;
    protected String correo;

    public Persona(String nombre, String apellido, int numeroEmpleado, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroEmpleado = numeroEmpleado;
        this.correo = correo;
    }

    public abstract double setSueldoIntegrado();
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public int getNumeroEmpleado() {
        return this.numeroEmpleado;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getCorreo() {
        return this.correo;
    }

    @Override
    public String toString() {
        return "***   Empleado   ***\n" + 
               "\nNombre: " + this.nombre + " " + this.apellido +
               "\nNumero empleado: " + this.numeroEmpleado +
               "\nCorreo: " + this.correo;
    }
   
    
}
