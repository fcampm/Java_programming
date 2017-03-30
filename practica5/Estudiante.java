
package practica5;

/**
 * Autor 1: Fabián Camp Mussa A01378565.
 * Autor 2: José Javier Rodríguez Mota A01372812.
 * Autor 3: Lenin Silva Gutiérrez A01373214.
 * 
 * Fecha: 27 Febrero, 2017.
 * 
 * Practica #5
 *
 */

// Se pone el comando extends para incluir los valores que recibira esrudiante por medio de herencia.
public class Estudiante extends Persona{
    
    // Atributos de instancia
    private String carrera;
    private int matricula;
    private double promedio;
    private double beca;
    
    // Atributo de clase constante
    private static final double MAXIMO_BECA = 90.0;

    // Primer constructor que recibe de parametros el nombre, apellido, fecha, carrera, matricula promedio y beca.
    public Estudiante(String nombre, String apellido, Fecha fecha, String carrera, int matricula, double promedio, double beca){
        
        // Con el comando super se importan los valores nombre, apellido y fecha por medio de herencia y siempre es la primera linea del constructor.
        super(nombre, apellido, fecha);
        
        // Se valida que la matricula sea un numero positivo en caso de no serlo se establece el valor de default en 0.
        if (matricula >= 0){
            this.matricula = matricula;
        }
        else {
            this.matricula = 0;
        }
        
        // Se valida que el promedio sea positivo y que no sobrepase las 100 unidades; de lo contrario se establece el valor de default en 0.0
        if (promedio >= 0 && promedio <=100){
            this.promedio = promedio;
        }
        else{
            this.promedio = 0.0;
        }
        
        // Se valida que la beca sea positiva y que no sobrepase la constante de clase MAXIMO_BECA; de lo contrario se establece el default en 0.0 0.0
        if (beca >= 0 && beca <= Estudiante.MAXIMO_BECA){
            this.beca = beca;
        }
        else {
            this.beca = 0.0;
        }
        this.carrera = carrera;
    }
    
    // Segundo constructor causando sobrecarga de metodos que recibe de parametros nombre, apellido, fecha, carrera y matricula.
    public Estudiante(String nombre, String apellido, Fecha fecha, String carrera, int matricula){
        super(nombre, apellido, fecha);
        
        this.promedio = 0.0;
        this.beca = 0.0;
        this.matricula = matricula;
        this.carrera = carrera;
    }
    
    // Establece carrera directamente porque no pide ninguna validacion.
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Establece el promedio si se cumple la condicion de que promedio sea positivo y menor o igual que 100.
    public void setPromedio(double promedio) {  
        if (promedio >= 0 && promedio <= 100){
            this.promedio = promedio;
        }
    }

    // Establece la beca si se cumple la condicion de que beca sea positiva y menor o igual que la constante de clase MAXIMO_BECA.
    public void setBeca(double beca) {  
        if (beca >= 0 && beca <= Estudiante.MAXIMO_BECA){
            this.beca = beca;
        }
    }

    // Regresa el valor de carrera.
    public String getCarrera() {
        return this.carrera;
    }

    // Regresa el valor de matricula.
    public int getMatricula() {
        return this.matricula;
    }

    // Regresa el valor de promedio.
    public double getPromedio() {
        return this.promedio;
    }

    // Regresa el valor de beca.
    public double getBeca() {
        return this.beca;
    }

    // El toString regresa el output esperado como es especificado en la practica5.
    @Override
    public String toString() {
        return "\n***** Alumno *****" +
               super.toString() +
               "\nCarrera: " + this.carrera + 
               "\nMatricula: " + this.matricula + 
               "\nBeca: " + this.beca + 
               "\nPromedio: " + this.promedio;
    }   

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
    
}
