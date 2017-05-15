
package ejercicios_practicaprc4;
/* 
 * Clase Pediatra
 * Autor: 
 * Matr�cula:
 */

 
 import java.util.Arrays;
 
 public class Pediatra extends Medico {
 	
    protected static final String[] ESPECIALIDADES = {"Otorrino", "Nutriologo", "Cirugia Pediatrica", "Infectologo", "Dermatologo", "Hematologo", "Alergologo"};
    private int totPacientes;
    private String[] especialidades;
    private static final double SUELDO_BASE = 5000.0;
    private static final double BONO_PACIENTE = 500.0;

// Codificar: Colocar los atributos de la clase Neurologo
 		

 	
// Codificar: Constructor	
    public Pediatra(String nombre, String apellido, Fecha fecha, String universidad, String cedula, int totPacientes, String[] especialidades){
 	
        super (nombre, apellido, fecha, universidad, cedula);
        
        if (totPacientes >= 0){
            
            this.totPacientes = totPacientes;
        }
        setEspecialidades(especialidades);
        setSueldo();
    }
 	
    
// Codificar: M�todo setSueldo
    @Override
    public void setSueldo() {
        
 	this.sueldo = SUELDO_BASE + this.totPacientes * BONO_PACIENTE;
    }
 	
 	
// Codificar: M�todo setEspecialidades
    public void setEspecialidades(String [] especialidades){
        String string="";
        for(int i=0;i< especialidades.length;i++)
        {
            for(String dato: Pediatra.ESPECIALIDADES)
            {
                if(especialidades[i].equalsIgnoreCase(dato)){
                    string+=dato+" ";
                    break;
                }
            }
        }
        if(string !="")
        this.especialidades=string.split(" ");
    }
	
    
 
    
    public String[] getEspecialidad(){
 	return this.especialidades;
    }

    public void setTotPacientes(int totPacientes) {
        if (totPacientes >= 0)
            this.totPacientes = totPacientes;
    }
    	  
    @Override
    public String toString(){
     	return super.toString() + " Total pacientes: " + this.totPacientes + " Sueldo: " + this.sueldo + " Especialidades:"  + Arrays.toString(this.especialidades);
    }	

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pediatra other = (Pediatra) obj;
        if (this.especialidades != other.especialidades) {
            return false;
        }
        return true;
    }

    
} 	
 	