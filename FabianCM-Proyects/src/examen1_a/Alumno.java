package examen1_a;
/*
Author: Fabian Camp Mussa.
Date: July 27, 2017.
Topic: Practice exercises.
*/


public class Alumno {
    
    public String nombre;
    public String apellido;
    public String matricula;
    public double beca;
    private static final double MAXIMO_BECA = 90.0;
    private static final double MINIMO_BECA = 10.0;
    private double promedio;
	
	public Alumno(String nombre, String apellido, String matricula, double promedio) {
		
            this.nombre = nombre;
            this.apellido = apellido;
            this.matricula = matricula;
            if (promedio >= 0 && promedio <= 100){
                
                this.promedio = promedio;
            }
            else{
                
                this.promedio = 0;
            }
            becaPorPromedio();
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
		
            if(promedio >= 0 && promedio <= 100){
                
                this.promedio = promedio;
            }
            becaPorPromedio();
	}
	
	public void becaPorPromedio() {
		            
            if(promedio < 70.0){
                this.beca = 0.0;
            }
            if(promedio >= 70.0 && promedio < 80.0){
                this.beca = MINIMO_BECA;
            }
            if(promedio >= 80.0 && promedio < 85.0){
                this.beca = 40.0;
            }
            if(promedio >= 85.0 && promedio < 90.0){
                this.beca = 60.0;
            }
            if(promedio >= 90.0 && promedio < 95.0){
                this.beca = 80.0;
            }
            if(promedio >= 95.0 && promedio <= 100.0){
                this.beca = MAXIMO_BECA;
            }
	}

	@Override
	public String toString() {
	
            return "Alumno [nombre= " + this.nombre + ", apelldio= " + this.apellido + 
                   ", matricula= " + this.matricula + ", promedio= " + this.promedio +
                   ", beca= " + this.beca;
        }
	
}

