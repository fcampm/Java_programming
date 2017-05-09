
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @authors Fabian Camp Mussa A01378565
 */
public class Gerente extends Persona implements Empleado{
    
    private static final double BONO_CONTRATACION = 500.0;
    private static final double SUELDO_MINIMO = 3000.0;
    private static final double SUELDO_MAXIMO = 8000.0;
    private final double impuestos = 0.1; 
    private int contrataciones;
    private double sueldo;
    private String puesto;
    private double ahorros;
    private int puntajeGerente, promedio = 0;
    private double valoracion = 0.0;
    Scanner puntaje= new Scanner(System.in);

    public Gerente(String nombre, String apellido, int numeroEmpleado, String correo, String puesto, double sueldo, int contrataciones) {
        super (nombre, apellido, numeroEmpleado, correo);
        this.puesto = puesto;
        if (sueldo >= SUELDO_MINIMO && sueldo <= SUELDO_MAXIMO){
            
            this.sueldo = sueldo;
        }
        else{
            
            this.sueldo = SUELDO_MINIMO;
        }
        if (contrataciones >= 0){
            
            this.contrataciones = contrataciones;
        }
        else {
            
            this.contrataciones = 0;
        }
        this.ahorros = 0.0;
        setSueldoIntegrado();
        
    }

    public Gerente(String nombre, String apellido, int numeroEmpleado, String correo, String puesto){
        
        super (nombre, apellido, numeroEmpleado, correo);
        this.puesto = puesto;
        this.sueldo = SUELDO_MINIMO;
        this.contrataciones = 0;
        this.ahorros = 0.0;
        setSueldoIntegrado();
        
        
    }
    
    public double getSueldo() {
        return this.sueldo;
    }

    public void setContrataciones(int contrataciones) {
        if (contrataciones >= 0){                    
            this.contrataciones = contrataciones;
        }
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= SUELDO_MINIMO && sueldo <= SUELDO_MAXIMO){
            
            this.sueldo = sueldo;
        }
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public double setSueldoIntegrado() {
        
        return this.sueldo + this.contrataciones * BONO_CONTRATACION;
    }

    @Override
    public String accion() {
        
        return "Supervisar que las funcionalidades de la tienda siempre sean las optimas";
    }

    @Override
    public void puntaje() {
        int entrada;
        
        entrada = puntaje.nextInt();
        this.puntajeGerente += entrada;
        this.promedio ++;
        this.valoracion = this.puntajeGerente/this.promedio;
        
        System.out.println("Valoracion: " + this.valoracion);
    }

    @Override
    public void impuestos() {
        setSueldoIntegrado();
        this.ahorros += this.getSueldo() * this.impuestos;
        this.sueldo -= this.ahorros;
        System.out.println("Ahorros: " + this.ahorros);
        System.out.println("Sueldo despues de ahorros:" + this.sueldo);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPuesto: " + this.puesto +
               "\nSueldo: " + this.setSueldoIntegrado() +               
               "\nAfore: " + this.ahorros +
               "\nAccion: " + this.accion() + 
               "\nValoracion: " + this.valoracion;
    }      
}
