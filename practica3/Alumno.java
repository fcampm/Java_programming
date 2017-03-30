
package practica3;

/**
 * Clase Alumno.java
 * 
 * Autor 1: A01378565 Fabian Camp Mussa
 * Autor 2: A01372812 Jose Javier Rodriguez Mota.
 * Autor 3: A01373214 Lenin Silva Gutierrez.
 * 
 * Fecha: Febrero 20, 2017.
 */
public class Alumno {
    
    // Variables de instancia constructoras
    private String nombre;
    private String apellido;
    private String matricula;
    private double promedio;
    private double beca;
    
    // Variables de clase constructoras
    private static final double MINIMO_BECA = 15.0;
    private static final double MAXIMO_BECA = 85.0;

    // En este apartado se pide inicializar las variables nombre, apellido, matricula y promedio
    public Alumno(String nombre, String apellido, String matricula, double promedio) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.promedio = promedio;
        
        // Se hace una validacion; en caso de que el promedio sea menor que 0 o mayor que 100 al promedio se le asignara el valor de 0
        if (promedio < 0 || promedio > 100){
            this.promedio = 0;
        }
        // Si no se cumple la anterior validacion, el promedio es asignado a la variable promedio
        else {
            this.promedio = promedio;
        }
        // Se llama becaPorPromedio para poder tomar los valores de los promedios
        becaPorPromedio();
    }

    // Regresa la variable nombre
    public String getNombre() {
        return this.nombre;
    }

    // Regresa la variable apellido
    public String getApellido() {
        return this.apellido;
    }

    // Regresa la variable matricula
    public String getMatricula() {
        return this.matricula;
    }

    // Regresa la variable promedio
    public double getPromedio() {
        return this.promedio;
    }

    // Regresa la variable de beca
    public double getBeca() {
        return this.beca;
    }

    // Se valida si el promedio se encuentra entre los rangos de 0 a 100 y luego se llama la funcion becaPorPromedio
    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 100.0){
           this.promedio = promedio;
        becaPorPromedio();
        }
    }
    
    // Variable becaPorPromedio que devuelve el resultado del total de beca que se le va a ofrecer al alumno con respecto al promedio
    private void becaPorPromedio(){
        if (promedio < 70.0){
            this.beca = 0.0;
        }
        if (promedio >= 70.0 && promedio < 80.0){
            this.beca = MINIMO_BECA;
        }
        if (promedio >= 80.0 && promedio < 85.0){
            this.beca = 40.0;
        }
        if (promedio >= 85.0 && promedio < 90.0){
            this.beca = 60.0;
        }
        if (promedio >= 90.0 && promedio < 95.0){
            this.beca = 80.0;
        }
        if (promedio >= 95.0 && promedio <= 100.0){
            this.beca = MAXIMO_BECA;
        }
        
    }

    // Variable toString que regresa la cadena del output esperado despues de la ejecucion
    @Override
    public String toString() {
        return "Alumno[" + "nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", promedio=" + promedio + ", beca=" + beca + ']';
    }
    
    
    
}
