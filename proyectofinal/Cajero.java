
package proyectofinal;
import java.util.Scanner;
/**
 *
 * @author Fabian Camp Mussa A01378565
 */
public class Cajero extends Persona implements Empleado{
    
    private static final double BONO_VENTA = 200.0;
    private static final double SUELDO_MINIMO = 1800.0;
    private static final double SUELDO_MAXIMO = 6000.0;
    private final double impuestos = 0.08;
    private double sueldo;
    private double ahorros;
    private int puntajeCajero, promedio = 0;
    private double valoracion = 0.0;
    private int ventas;
    private String puesto;
    Scanner puntaje = new Scanner(System.in);
    
    public Cajero (String nombre, String apellido, int numeroEmpleado, String correo, String puesto, double sueldo, int ventas){
        
        super(nombre, apellido, numeroEmpleado, correo);
        this.puesto = puesto;
        if (sueldo >= SUELDO_MINIMO && sueldo <= SUELDO_MAXIMO){
            
            this.sueldo = sueldo;
        }
        else {
            
            this.sueldo = SUELDO_MINIMO;
        }
        if (ventas >= 0){
            
            this.ventas = ventas;          
        }
        else{
            
            this.ventas = 0;
        }
        this.ahorros = 0.0;
        impuestos();
        puntaje();
    }
    
    public Cajero (String nombre, String apellido, int numeroEmpleado, String correo, String puesto){
        
        super(nombre, apellido, numeroEmpleado, correo);
        this.puesto = puesto;
        this.sueldo = SUELDO_MINIMO;
        this.ventas = 0;
        this.ahorros = 0.0;
        impuestos();
        puntaje();
    }

    public double getSueldo(){
        return this.sueldo;
    }

    public void setVentas(int ventas) {
        if (ventas >= 0){
            this.ventas = ventas;
        }
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    @Override
    public double setSueldoIntegrado() {
        this.sueldo += this.ventas * BONO_VENTA;
        return this.sueldo;
    }

    @Override
    public String accion() {
        return "checar que los anaqueles esten ordenados, las cajas cerredas y listos para la llegada del siguiente cliente";
    }

    @Override
    public void puntaje() {
        int entrada;
        
        entrada = puntaje.nextInt();
        this.puntajeCajero += entrada;
        this.promedio ++;
        this.valoracion = this.puntajeCajero/this.promedio;
    }

    @Override
    public void impuestos() {
        setSueldoIntegrado();
        this.ahorros += this.sueldo * this.impuestos;
        this.sueldo *= this.impuestos;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPuesto: " + this.puesto +
               "\nSueldo: " + this.setSueldoIntegrado() +
               "\nSueldo despues de impuestos: " + this.sueldo +
               "\nAfore: " + this.ahorros + 
               "\nAccion : " + this.accion() + 
               "\nValoracion: " + this.valoracion;
    }
            
}
