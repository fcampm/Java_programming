
package ejercicios_practicaprc3;

/*
* @author Fabian Camp Mussa
*
* Date: April 19, 2017.
*/

public class Doctor extends Persona {
    
    private String cedula;
    private String especialidad;
    private double pagoBase;
    private int totalAsociaciones;
    private static final double MINIMO_PAGO_BASE = 5000.0;
    private static final double MAXIMO_PAGO_BASE = 35000.0;
    private static final double BONO_POR_ASOCIACION = 500.0;
    private static int totalDoctores = 0;

    public Doctor(String nombre, String apellido, Fecha fecha, String cedula, String especialidad, double pagoBase, int totalAsociaciones) {
        super(nombre, apellido, fecha);
        this.cedula = cedula;
        this.especialidad = especialidad;
        
        if(pagoBase >= MINIMO_PAGO_BASE && pagoBase <= MAXIMO_PAGO_BASE){
            
            this.pagoBase = pagoBase;
        }
        else {
            
            this.pagoBase = MINIMO_PAGO_BASE;
        }
        
        if(totalAsociaciones >= 0){
            
            this.totalAsociaciones = totalAsociaciones;
        }
        this.totalDoctores += 1;
        totalDoctores();
    }

    public Doctor(String nombre, String apellido, Fecha fecha, String cedula, String especialidad) {
        
        super(nombre, apellido, fecha);
        this.cedula = cedula;
        this.especialidad = especialidad;
        this.pagoBase = MINIMO_PAGO_BASE;
        this.totalAsociaciones = 0;
        this.totalDoctores += 1;
        totalDoctores();
    }

    public String getCedula() {
        return this.cedula;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public double getPagoBase() {
        return this.pagoBase;
    }

    public int getTotalAsociaciones() {
        return this.totalAsociaciones;
    }

    public void setPagoBase(double pagoBase) {
        if(pagoBase >= MINIMO_PAGO_BASE && pagoBase <= MAXIMO_PAGO_BASE){
            
            this.pagoBase = pagoBase;
        }
    }

    public void setTotalAsociaciones(int totalAsociaciones) {
        if(totalAsociaciones >= 0){
            
            this.totalAsociaciones = totalAsociaciones;
        }
        
    }
    
    private double bonoPorEspecialidad(){
        double res = 0.0;
        switch(this.especialidad){
            
            case "neurologia": 
                res += 1000.0;
                break;
            case "cardiologia": 
                res += 800.0;
                break;
            case "oncologia": 
                res += 600.0;
                break;
            case "pediatria": 
                res += 400.0;
                break;
            default: 
                res += 0.0;
                break;
        }
        return res;
    }
    
    public double getSueldo(){
        
        return this.totalAsociaciones * BONO_POR_ASOCIACION + this.pagoBase + bonoPorEspecialidad();
    }

    @Override
    public String toString() {
        return "*** Doctor ***" +
               super.toString() +
               "\nCedula: " + this.cedula +
               "\nEspecialidad: " + this.especialidad + 
               "\nPagoBase: " + this.pagoBase +
               "\nTotalAsociaciones: " + this.totalAsociaciones +
               "\nSueldo: " + getSueldo();
               
    }
  
    public static int totalDoctores(){
        
        return Doctor.totalDoctores;
    }
    
}
