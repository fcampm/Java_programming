package parcial2;

/*
 * Clase Profesor
 *
 * Autor: Fabian Camp Mussa
 * Matricula: A01378565.
 */
 
 public class Profesor extends Persona {

    protected double sueldo;
    protected String nomina;
    private static final double SUELDO_BASE = 2500.0;


    // IMPLEMENTAR
    public Profesor(String nombre, String apellido, double sueldo, String nomina){
        super (nombre, apellido);
        if (sueldo >= SUELDO_BASE){
            this.sueldo = sueldo;
        }
        else{
            this.sueldo = SUELDO_BASE; // Profesor.SUELDO_BASE
        }
        this.nomina = nomina;
    }



	// IMPLEMENTAR
    public Profesor(String nombre, String apellido, String nomina){
       super (nombre, apellido);
       this.nomina = nomina;
       this.sueldo = SUELDO_BASE;
    }
    
	

	// IMPLEMENTAR    
    @Override
    public String toString() {
       return "Profesor {" + super.toString() + ", sueldo= " + this.sueldo + ", nomina= " + this.nomina + "}";
    }
    
    
    
    
    
    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo >= Profesor.SUELDO_BASE)
            this.sueldo = sueldo;
    }
    
    public String getNomina() {
        return this.nomina;
    }

 }	
 	