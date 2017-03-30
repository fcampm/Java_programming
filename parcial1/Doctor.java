package parcial1;
/**
 *
 * Autor: Fabian Camp Mussa
 * Matriula: A01378565
 *
 */

public class Doctor {
    // Variables de instancia constructoras
    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldo;
    private int total_asociaciones;
    private int nivel;
    
    // Variables de clase constructoras
    private static final double MINIMO_SUELDO = 5000.0; // Está en mayúsculas por convención por ser constantes
    private static final double MAXIMO_SUELDO = 25000.0;
    private static final double BONO_POR_ASOCIACION = 3000.0;
    
    
    
    public Doctor(String nombre, String apellido, String cedula, double sueldo, int total_asociaciones) {
       this.nombre = nombre; // Se usa el this.xxxx hace referencia a la variable de instancia y simepre ponerlo
       this.cedula = cedula;
       this.apellido = apellido;
       this.sueldo = sueldo;
        if (MINIMO_SUELDO <= sueldo && sueldo <= MAXIMO_SUELDO){
            this.sueldo = sueldo;
        }
 
        if (total_asociaciones >= 0){
            this.total_asociaciones = total_asociaciones;
        }
        else {
            this.total_asociaciones = 0;
        }
        calculaNivel();   
    }


    public String getNombre() {
        return this.nombre;
    }


    public String getApellido() {
        return this.apellido;      
    }


    public String getCedula() {
        return this.cedula;
    }


    public double getSueldo() {
        return this.sueldo;
    }
    
    
    public double getSueldoIntegrado() {
        return this.sueldo + (this.total_asociaciones * BONO_POR_ASOCIACION);
    }


    public int getTotal_asociaciones() {
        return this.total_asociaciones;       
    }
    

    public int getNivel() {
        return this.nivel;
    }
    
    
    public void setSueldo(double sueldo) {
        if (MINIMO_SUELDO < sueldo && sueldo <= MAXIMO_SUELDO){
            this.sueldo = sueldo;
        }
    }


    public void setTotal_asociaciones(int total_asociaciones) {
        if (total_asociaciones >= 0){
            this.total_asociaciones = total_asociaciones;
            calculaNivel();
        }
        
    }


    private void calculaNivel() {
        int asociaciones;
        asociaciones = this.total_asociaciones;
        switch (asociaciones){
            case 0:
                nivel = 0;
                break;
            case 1:                
            case 2:
                nivel = 1;
                break;
            case 3:                
            case 4:
                nivel = 2;       
                break;
            default:
                nivel = 3;                
        }
    }

    @Override
    public String toString() {
        return "Doctor{" + "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", sueldo=" + sueldo + ", total_asociaciones=" + total_asociaciones + ", nivel=" + nivel + '}';
    }


    
    

    public String evaluaDoctor() {
        calculaNivel();
        if (nivel == 0){
            return "Nivel muy bajo: se sugiere integrarse a equipos de trabajo";
        }
        if (nivel == 1){
            return "Primer nivel: se sugiere capacitarse en diversos temas";
        }
        if (nivel == 2){
            return "Segundo nivel: se sugiere publicar trabajos";
        }
        if (nivel == 3){
            return "Tercer nivel: Felicidades!";
        }
        return null;
    }
    
    
}
