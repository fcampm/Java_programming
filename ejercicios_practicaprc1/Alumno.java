
package ejercicios_practicaprc1;

/*
* @author Fabian Camp Mussa
*
* Date: April 19, 2017.
*/


public class Alumno {
    
    private String nombre;
    private String apellido;
    private String matricula;
    private double promedio;
    private double beca;
    private static final double MAXIMO_BECA = 90.0;
    private static final double MINIMO_BECA = 10.0;

	
	public Alumno(String nombre, String apellido, String matricula, double promedio) {
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.matricula = matricula;
            
            if (promedio < 0 || promedio > 100){
                this.promedio = 0;
            }
            
            else{
                this.promedio = promedio;
            }
            
            becaPorPromedio();
            
	}
        
        public double getBeca(){
 
            return this.beca;
        }

	public String getNombre() {
            
            return this.nombre;
	}

	public String getApellido() {

            return this.apellido;
	}

	public String getMatricula() {
            
            return this.matricula;
	}

	public double getPromedio() {
            
            return this.promedio;
	}
	
	public void setPromedio(double promedio){
            
            if (promedio >= 0 || promedio <= 100){
                
                this.promedio = promedio;
            }
            
            becaPorPromedio();
	}
	
	public void becaPorPromedio() {
            
            
            if (this.promedio < 70.0){
                
                this.beca = 0.0;
            }
            
            if (this.promedio >= 70.0 && this.promedio < 80.0 ){
                
                this.beca = MINIMO_BECA;
            }
            
            if (this.promedio >= 80.0 && this.promedio < 85.0){
                
                this.beca = 40.0;
            }
            
            if (this.promedio >= 85.0 && this.promedio < 90.0){
                
                this.beca = 60.0;
            }
            
            if (this.promedio >= 90.0 && this.promedio < 95.0){
                
                this.beca = 80.0;
            }
            
            if (this.promedio >= 95.0 && this.promedio <= 100.0){
                
                this.beca = MAXIMO_BECA;
            }
	}

	@Override
	public String toString() {
	
            return "Alumno [nombre= " + this.nombre + ", apellido= " + this.apellido + ", matricula= " + this.matricula + ", promedio= " + this.promedio + ", beca= " + this.beca + "]";
	}
	
}

