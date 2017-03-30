
package practica6;

/**
 * @authors Fabián Camp Mussa A01378565.
 *          José Javier Rodríguez Mota A01372812.
 *          Lenin Silva Gutiérrez A01373214.
 */
public class ArregloVentas {
    
    // Se declara un arreglo que será heredado por alguna clase (por eso va el protected)
    protected int[] ventas;

    // Constructor de default que crea el arreglo ventas con una longitud de 12
    public ArregloVentas() {
        this.ventas = new int[12];
    }
    
    // Constructor que recibe como argumento un arreglo
    public ArregloVentas(int[] ventas) {
        this.ventas = new int[12];
        
        // Asigna el valor de ventas de la posición i al arreglo en la misma posicion i
        for (int i = 0; i < this.ventas.length; i++){
            this.ventas[i] = ventas[i];
        }
    }
    
    // Regresa el valor que se encuentra en la posicion i del arreglo
    public int getVenta(int pos){
        
        // Se valida que la posición que te dan de argumento sea mayor o igual a cero y que no sobrepase la longitud del arreglo
        if (pos >= 0 && pos < this.ventas.length){
            return this.ventas[pos];
        }
        
        // En caso de no entrar en esa condicion el programa regresa un -1
        return -1;
    }
    
    public void setVenta(int pos, int dato){
        
        // Actualiza cualquier valor de cualquier posicion del arreglo solamente si la posición es mayor o igual a cero y menor a la longitud del arreglo
        if (pos >= 0 && pos < this.ventas.length && dato >= 0){
            this.ventas[pos] = dato;
        }
    }

    // Metodo toString que regresa el mes y las ventas de ese mes con el formato pedido en la practica
    @Override
    public String toString() {
        return "\nEnero: " + this.ventas[0] +
               "\nFebrero: " + this.ventas[1] +
               "\nMarzo: " + this.ventas[2] +
               "\nAbril: " + this.ventas[3] +
               "\nMayo: " + this.ventas[4] +
               "\nJunio: " + this.ventas[5] +
               "\nJulio: " + this.ventas[6] +
               "\nAgosto: " + this.ventas[7] +
               "\nSeptiembre: " + this.ventas[8] +
               "\nOctubre: " + this.ventas[9] +
               "\nNovimenbre: " + this.ventas[10] +
               "\nDicimebre: " + this.ventas[11] ;
    }
    
    
}
