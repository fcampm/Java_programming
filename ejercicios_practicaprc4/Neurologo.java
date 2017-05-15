
package ejercicios_practicaprc4;
/* 
 * Clase Neurologo
 * Autor: 
 * Matr�cula:
 */

 public class Neurologo extends Medico {
     
     private int totPacientes;
     private int totCirugias;
     private static final double SUELDO_BASE = 10000.0;
     private static final double BONO_CIRUGIA = 2500.0;
     private static final double BONO_PACIENTE = 600.0;
// Codificar: Colocar los atributos de la clase Neurologo
 	
// Codificar: Constructor	
    public Neurologo(String nombre, String apellido, Fecha fecha, String universidad, String cedula, int totPacientes, int totCirugias){
        
        super(nombre, apellido, fecha, universidad, cedula);
        
        if (totPacientes >= 0) {
            
            this.totPacientes = totPacientes;
        }
        
        else{
            this.totPacientes = 0;
        }
        
        if (totCirugias >= 0){
            
            this.totCirugias = totCirugias;
        }
        
        else{
            
            this.totCirugias = 0;
        }
        setSueldo();
    }
    
    
// Codificar: M�todo setSueldo
     @Override
    public void setSueldo() {
        
        this.sueldo = SUELDO_BASE + this.totPacientes * BONO_PACIENTE + this.totCirugias * BONO_CIRUGIA;
    }
 




    public void setTotCirugias(int totCirugias) {
        if (totCirugias >= 0)
            this.totCirugias = totCirugias;
    }

    public void setTotPacientes(int totPacientes) {
        if (totPacientes >= 0)
            this.totPacientes = totPacientes;
    }	
 	
    @Override
    public String toString(){
 		return super.toString() + " Total pacientes: " + this.totPacientes + " Total cirugias: " + this.totCirugias + " Sueldo: " + this.sueldo;
    }
} 	
 	