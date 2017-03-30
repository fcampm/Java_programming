
package practica6;

/**
 * @authors Fabián Camp Mussa A01378565.
 *          José Javier Rodríguez Mota A01372812.
 *          Lenin Silva Gutiérrez A01373214.
 */

// REN = número de renglones - COL = número de columnas
public class Matriz {
   
    // Se establece una matriz de enteros
    private int [][] mat;
    // Se asignan a las variables REN = numero de renglones y COL = numero de columnas el valor de 5
    private static final int REN = 5, COL = 5;

    // Constructor de default que crea una matriz de 5 * 5 
    public Matriz() {
        this.mat = new int [REN][COL];
    }
    
    // Constructor que recibe de parametos ren y col para crear la matriz de esas dimenciones
    public Matriz(int ren, int col) {
        this.mat = new int [ren][col];
    }
    
    // Metodo que suma dos matrices, la matriz y la matriz b
    public Matriz sumaMatrices(Matriz b){
        // Se establece una matriz res con valores de null como default
        Matriz res = null;
        
        // Se valida que los renglones y las columnas de ambas matrices sean iguales para poder sumarlas
        if (this.mat.length == b.mat.length && this.mat[0].length == b.mat[0].length){
            res = new Matriz (this.mat.length, this.mat[0].length);
       
            // Ciclo que recorre las filas y las columnas de ambas matrices para después sumarlas
            for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    res.mat[i][j] = this.mat[i][j] + b.mat[i][j];
                }
            }    
        }
        
        return res;
    }
    
    // Metodo que actualiza los valores que abran en las filas y en que columna
    public void setElement(int ren, int col, int valor){
        
        // Se valida que el valor de ren sea mayor o igual a 0 y que sea menor que la longitud de la matriz, del mismo modo con las columnas
        if (ren >= 0 && ren < this.mat.length && col >= 0 && col < this.mat[0].length){
            
            this.mat[ren][col] = valor;
        }
    }
    
    // Metodo que resta dos matrices, la matriz y la matriz b
    
    public Matriz restaMatrices(Matriz b){
        // Se establece una matriz res con valores de null como default
        Matriz res = null;
        
        // Se valida que los renglones y las columnas de ambas matrices sean iguales para poder restarlas
        if (this.mat.length == b.mat.length && this.mat[0].length == b.mat[0].length){
            res = new Matriz (this.mat.length, this.mat[0].length);
       
            // Ciclo que recorre las filas y las columnas de ambas matrices para después restarlas
            for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    res.mat[i][j] = this.mat[i][j] - b.mat[i][j];
                }
            }    
        }
        
        return res;
    }
    
    // Metodo que devuelve el valor mas grande dentro de una matriz
    public int mayorMatriz(){
        
        int res = this.mat[0][0];
        
        for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    if (this.mat[i][j] > res){
                        res = this.mat[i][j];
                    }
                }
            }
        return res;
    }
    
    // Metodo que devuelve el valor mas chico dentro de una matriz
    public int menorMatriz(){
        
        int res = this.mat[0][0];
        
        for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    if (this.mat[i][j] < res){
                        res = this.mat[i][j];
                    }
                }
            }
        return res;
    }
    
    // Metodo que calcula el promedio de los datos que se encuentran en la matriz
    public double promedioMatriz(){
        
        double res = 0;
        
        for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    res += this.mat[i][j];
                }
            }
        res /= (this.mat.length * this.mat[0].length);
        return res;
    }

    // Metodo toString que regresa una salida con las matrices y sus respectivos espacios
    @Override
    public String toString() {
        String res="";
        for (int i = 0; i < this.mat.length; i++){
                for (int j = 0; j < this.mat[0].length; j++){
                    res += this.mat[i][j] + "\t";
                }
                res += "\n";
            }
        return res;
    }
    
    
}
