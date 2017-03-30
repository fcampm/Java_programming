
package practica6;
/**
 * @authors Fabián Camp Mussa A01378565.
 *          José Javier Rodríguez Mota A01372812.
 *          Lenin Silva Gutiérrez A01373214.
 */
public class VentasEmpleado {
    
    private String nombre;
    private String apellido;
    private ArregloVentas ventasMensuales; 

    // Constructor que recibe un nombre, apellido y crea un arreglo ventasMensuales en caso de que no se proporcione
    public VentasEmpleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventasMensuales = new ArregloVentas();
    }

    // Constructor que recibe un nombre, apellido y un arreglo ya extistente llamado vetasMensuales
    public VentasEmpleado(String nombre, String apellido, int[] ventasMensuales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ventasMensuales = new ArregloVentas (ventasMensuales);
    }
    
    // Metodo que calcula el promedio de los datos que se encuentran en el arreglo 
    public double promedio(){
        double suma = 0.0;
        
        for (int i = 0; i < this.ventasMensuales.ventas.length; i++){
            suma += this.ventasMensuales.ventas[i];
        }
        
        return suma / this.ventasMensuales.ventas.length;
    }
    
    // Metodo que te regresa el dato mayor del arreglo ventasMensuales y llama el metodo getMes para consultar el mes
    public String mayorVenta(){
        
        int mayor = this.ventasMensuales.ventas[0];
        int pos = 0;
        
        for (int i = 1; i < this.ventasMensuales.ventas.length; i++){
            if (this.ventasMensuales.ventas[i] > mayor){
                mayor = this.ventasMensuales.ventas[i];
                pos = i;
            }
        }
        return getMes(pos);
    }
    
    // Metodo que te regresa el dato menor del arreglo ventasMensuales y llama el metodo getMes para consultar el mes
    public String menorVenta(){
        
        int menor = this.ventasMensuales.ventas[0];
        int pos = 0;
        
        for (int i = 1; i < this.ventasMensuales.ventas.length; i++){
            if (this.ventasMensuales.ventas[i] < menor){
                menor = this.ventasMensuales.ventas[i];
                pos = i;
            }
        }
        return getMes(pos);
    }
    
    // Metodo que te consulta el mes y depende del mes que se le proporcione a la hora de crear el objeto
    private String getMes (int mes){
        switch (mes){
            case 0:
                return "Enero";
            case 1:
                return "Febrero";
            case 2:
                return "Marzo";
            case 3:
                return "Abril";
            case 4:
                return "Mayo";
            case 5:
                return "Junio";
            case 6:
                return "Julio";
            case 7:
                return "Agosto";
            case 8:
                return "Septiembre";
            case 9:
                return "Ocutbre";
            case 10:
                return "Noviembre";
            case 11:
                return "Diciembre";
            default:
                return "Mes no valido";
        }
    }

    // Metodo que asigna un dato en una posicion en el arreglo ventasMensuales
    public void setVenta(int pos, int dato){
        this.ventasMensuales.ventas[pos] = dato;
    }

    //Metodo que regresa el valor de la posicion
    public int getVenta (int pos){
        return this.ventasMensuales.ventas[pos];
    }

    // Metodo toString que imprime el nombre, apellido y las ventas mensuales con sus respectivos meses
    @Override
    public String toString() {
        return "Las ventas de " + this.nombre + " " + this.apellido + " son: " +
               "\nEnero: " + this.ventasMensuales.ventas[0] +
               "\nFebrero: " + this.ventasMensuales.ventas[1] +
               "\nMarzo: " + this.ventasMensuales.ventas[2] +
               "\nAbril: " + this.ventasMensuales.ventas[3] +
               "\nMayo: " + this.ventasMensuales.ventas[4] +
               "\nJunio: " + this.ventasMensuales.ventas[5] +
               "\nJulio: " + this.ventasMensuales.ventas[6] +
               "\nAgosto: " + this.ventasMensuales.ventas[7] +
               "\nSeptiembre: " + this.ventasMensuales.ventas[8] +
               "\nOctubre: " + this.ventasMensuales.ventas[9] +
               "\nNovimebre: " + this.ventasMensuales.ventas[10] +
               "\nDiciembre: " + this.ventasMensuales.ventas[11];
    }
    
    
}
