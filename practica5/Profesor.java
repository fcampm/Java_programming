
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

// Se pone el comando extends porque va a heredar los atributos de nombre, apellido y fecha.
public class Profesor extends Persona{
    
    // Atributos de instancia
    private String carrera;
    private String grado;
    private int nomina;
    private double sueldo;
    private String[] materias;
    
    // Atributos de clase constantes
    private static final double MAXIMO_SUELDO = 50000.0;
    private static final double MINIMO_SUELDO = 25000.0;

    // Constructor de profesor que recibe como parametros nombre, string, fecha, carrera, grado, nomina, sueldo y un arrey de materias.
    public Profesor(String nombre, String apellido, Fecha fecha, String carrera, String grado, int nomina, double sueldo, String[] materias) {
        
        // Con el comando super se importan las variables o parametros de nombre, apellido y fecha.
        super(nombre, apellido, fecha);
        
        // Se valida que nomina sea positivo de caso contrario se establece el valor de default en 0.
        if (nomina >= 0){
            this.nomina = nomina;
        }
        else{
            this.nomina = 0;
        }
        
        // Se valida que sueldo sea mayor o igual que MINIMO_SUELDO (atributo de clase constante) y que sueldo sea menor o igual que  MAXIMO_SUELDO (atributo de clase constante).
        if (sueldo >= Profesor.MINIMO_SUELDO && sueldo <= Profesor.MAXIMO_SUELDO){
            this.sueldo = sueldo;
        }
        else{
            this.sueldo = Profesor.MINIMO_SUELDO;
        }
        
        // Se establece el array de materias 
        this.materias = new String[materias.length];
        for (int i = 0; i < materias.length ; i++){
            this.materias[i] = materias[i];
        }
        
        this.carrera = carrera;
        this.grado = grado;
    }

    // Se regresa la carrera.
    public String getCarrera() {
        return this.carrera;
    }

    // Se regresa el grado.
    public String getGrado() {
        return this.grado;
    }

    // Se regresa la nomina.
    public int getNomina() {
        return this.nomina;
    }

    // Se regresa el sueldo.
    public double getSueldo() {
        return this.sueldo;
    }

    // Se regresa el array de las materias.
    public String[] getMaterias() {
        return this.materias;
    }

    // Se asigna this.grado a grado.
    public void setGrado(String grado) {
        this.grado = grado;
    }

    // Se hace una validación de que el sueldo este en el rango de minimo sueldo, que no se menor el sueldo que antes recibia el profesor y que no sobrepase el maximo sueldo.
    public void setSueldo(double sueldo) {
        if (sueldo >= Profesor.MINIMO_SUELDO && sueldo >= this.sueldo && sueldo <= Profesor.MAXIMO_SUELDO){
            this.sueldo = sueldo;
        }
    }

    // Se hace la asignación the materias que se encuentran dentro del array.
    public void setMaterias(String[] materias) {
        this.materias = new String[materias.length];
        for (int i = 0; i < materias.length ; i++){
            this.materias[i] = materias[i];
        }
    }

    // Se hace la funcion de cadenaMaterias() que regresara un print que despues sera utilizado.
    private String cadenaMaterias(){
        String s = "";
        String materias_separadas[];
        for (int i = 0; i< this.materias.length; i++){
            materias_separadas = this.materias[i].split(" ");
            s += "\nNombre materia: " + materias_separadas[0] +
                 "\nClave materia: " + materias_separadas[1] +
                 "\nSemestre materia: " + materias_separadas[2];
            }
        
        return s;
    }
    
    // Se establece el toString que duvuelve la salida esperada llamando a cadenaMaterias() que ya tiene el formato de impresion necesario.
    @Override //Este metodo esta sobreescribiendo object por eso es que sale el @Override
    public String toString() {
        return "\n***** Profesores *****" +
               super.toString() + 
               "\nCarrera: " + this.carrera + 
               "\nNomina: " + this.nomina +
               "\nGrado: " + this.grado + 
               "\nSueldo: " + this.sueldo + 
               "\nMaterias: " +
               "\n" + this.cadenaMaterias();
    }
    
    
    
}
