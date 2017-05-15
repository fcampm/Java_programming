
package ejercicios_practicaprc4;
/* 
 * Clase Medico
 * Autor: 
 * Matr�cula:
 */
 
 public abstract class Medico extends Persona {
 
// Codificar: Colocar los atributos de la clase Medico
    protected String universidad;
    protected String cedula;
    protected double sueldo;
 	
	
// Codificar: Constructor
    public Medico(String nombre, String apellido, Fecha fecha, String universidad, String cedula){
        
        super(nombre, apellido, fecha);
        this.universidad = universidad;
        this.cedula = cedula;
        setSueldo();
    }
 	
 
// Codificar: Colocar el m�todo setSueldo()	
    public abstract void setSueldo();
 
 	
 	
 	
 	
    public String getCedula(){
 		return this.cedula;
    }
 	
    public double getSueldo(){
 		return this.sueldo;
    }
 	
    @Override
    public String toString(){
 		return "\n\n" + super.toString() + " Universidad: " + this.universidad + " Cedula: " + this.cedula + " Sueldo: " + this.sueldo;
    }
    
 }