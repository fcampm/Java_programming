// en java.util se encuentra el metodo sort que te ordena los datos de un arrey
package practica6;
import java.util.Arrays;

/**
 * @authors Fabián Camp Mussa A01378565.
 *          José Javier Rodríguez Mota A01372812.
 *          Lenin Silva Gutiérrez A01373214.
 */

public class Vectores {
    
    // psvm + tab = public static void main(String[] args)
    public static void main(String[] args) {
        
        // Se declaran los arreglos que serán utilizados para probar los metodos
        int [] arreglo1 = {1,2,3,4,5,6,7,8,9}, arreglo2 = {0,3,8,10,11,12,9}, arreglo3 = {5,9,20,39,3,2,1,4}, arreglo4 = {4,5,1,6,8,9,12,65,90};
        
        // Se imprime los datos y se mandan a llamar los metodos para probar su funcionamiento
        System.out.println("\n***** Arreglo 1 *****\n" 
                + Arrays.toString(arreglo1)
                + "\n\nDato mayor:" + datoMayor(arreglo1)
                + "\nDato menor:" + datoMenor(arreglo1)
                + "\nPromedio:" + promedio(arreglo1)
                + "\nDatos mayores de arreglo 1 y 2:" + Arrays.toString(datosMayores(arreglo1, arreglo2))
                + "\nMenores de 5:" + cuentaMenores(arreglo1, 5)
                + "\nArreglo invertido:" + Arrays.toString(invierteArreglo(arreglo1))
                + "\nMultiplos de 2:" + Arrays.toString(multiplosDe(arreglo1, 2)) + "\n"
                
                + "\n***** Arreglo 2 *****\n"
                + Arrays.toString(arreglo2)
                + "\nDato mayor:" + datoMayor(arreglo2)
                + "\nDato menor:" + datoMenor(arreglo2)
                + "\nPromedio:" + promedio(arreglo2)
                + "\nDatos mayores de arreglo 2 y 4:" + Arrays.toString(datosMayores(arreglo2, arreglo4))
                + "\nMenores de 8:" + cuentaMenores(arreglo2, 8)
                + "\nArreglo invertido:" + Arrays.toString(invierteArreglo(arreglo2))
                + "\nMultiplos de 3:" + Arrays.toString(multiplosDe(arreglo2, 3)) + "\n"
                
                + "\n***** Arreglo 3 *****\n"
                + Arrays.toString(arreglo3)
                + "\nDato mayor:" + datoMayor(arreglo3)
                + "\nDato menor:" + datoMenor(arreglo3)
                + "\nPromedio:" + promedio(arreglo3)
                + "\nDatos mayores de arreglo 3 y 1:" + Arrays.toString(datosMayores(arreglo3, arreglo1))
                + "\nMenores de 6:" + cuentaMenores(arreglo3, 6)
                + "\nArreglo invertido:" + Arrays.toString(invierteArreglo(arreglo3))
                + "\nMultiplos de 4:" + Arrays.toString(multiplosDe(arreglo3, 4)) + "\n"
                
                + "\n***** Arreglo 4 *****\n"
                + Arrays.toString(arreglo4)
                + "\nDato mayor:" + datoMayor(arreglo4)
                + "\nDato menor:" + datoMenor(arreglo4)
                + "\nPromedio:" + promedio(arreglo4)
                + "\nDatos mayores de arreglo 4 y 3:" + Arrays.toString(datosMayores(arreglo4, arreglo3))
                + "\nMenores de 9:" + cuentaMenores(arreglo4, 9)
                + "\nArreglo invertido:" + Arrays.toString(invierteArreglo(arreglo4))
                + "\nMultiplos de 6:" + Arrays.toString(multiplosDe(arreglo4, 6)));
    }
    
    public static int datoMayor(int[] arr){
        
        // Se hace una validacion que el arreglo que se manda a llamar no exista o que su longitud sea de 0
        if (arr == null || arr.length == 0){
            return -1; // Si hay un error o algo parecido -1
        }
        // Se declara la variable mayor con el primer dato del arreglo tomandolo como el mayor para despues compararlo
        int mayor = arr[0];
        
        // Por cada elemento del arreglo se valida que si ese dato es > que mayor ese será el nuevo mayor
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > mayor){
                mayor = arr[i];
            }
        }
        
        return mayor;
    }
    
    public static int datoMenor(int[] arr){
        
        // Se valida que el arreglo exista y que su longitud no sea 0
        if (arr == null || arr.length == 0){
            return -1; // Si hay un error o algo la longitud del arreglo es 0 regresa: -1
        }
        
        // Se decalara la variable menor tomando el primer elemento del arreglo
        int menor = arr[0];
        
        // Por cada elemento del arreglo se valida que si ese dato es < que menor ese será el nuevo menor
        for (int i = 0; i < arr.length; i++){
            if (arr[1] < menor){
                menor = arr[i];
            }
        }
        return menor;
    }
   
    public static double promedio(int[] arr){
        
        // Se valida que el arreglo exista y que su longitud no sea 0  
        if (arr == null || arr.length == 0){
            return -1.0; // Si hay un error o algo la longitud del arreglo es 0 regresa: -1
        }
        // Se declara la variable promedio que funciona como un acumulador
        double promedio = 0.0;
        
        // Se suman todos los elementos del arreglo y se le suman a la variable promedio
        for (int i = 0; i < arr.length; i++){
            promedio += arr[i];  
        }
        
        // Se divide el valor que tiene promedio y se divide con el total de datos del arreglo
        return promedio /= arr.length;
    }
    
    public static int[] datosMayores(int[] arr1, int[] arr2){
        
        // Se valida que el arreglo 1 y 2 existan y que sus longitudes no sean 0
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0){
            return null; // Cuando es un objeto lo que regresas tienes que regresar un objeto o sea, regresas un null
        } 
        
        // Se declara un 3 arreglo
        int[] arr3;
        
        // Se hace una validacion para ver de que tamaño sera el nuevo arreglo
        if (arr1.length >= arr2.length){
           arr3 = new int[arr2.length];
        }
        else{
           arr3 = new int[arr1.length];
        }
        
        /*Se valida para cada elemento del arreglo que si el elemento del arreglo 1 es mayor que 
        el elemento del arreglo 2 y viceversa haga referencia en memoria para el arreglo 3*/
        for (int i = 0; i < arr3.length; i++){
            if (arr1[i] >= arr2[i]){
                arr3[i] = arr1[i];
            }
            else{
                arr3[i] = arr2[i];
            }
        }
        
        return arr3;
    }
    
    public static int cuentaMenores(int[] arr, int dato){
        
        // Se declara un contador suma
        int suma = 0;
        
        // Se valida que el arreglo exista y que su longitud no sea 0
        if (arr == null || arr.length == 0){
            return -1; // Si hay un error o algo la longitud del arreglo es 0 regresa: -1
        }
        
        // Se valida que si el elemento del arreglo es menor o igual que el dato el contador suma se incrementará en 1
        for (int i = 0; i < arr.length; i++){
            if (arr[i] <= dato){
                suma++;
            }
        }
        return suma;
    }
    
    public static int[] invierteArreglo(int[] arr){
        
        // Se valida que el arreglo exista y que su longitud no sea 0
        if (arr == null || arr.length == 0){
            return null; // Si hay un error o algo la longitud del arreglo es 0 regresa: -1
        }
        
        // Se declara arr2 que tendra el mismo tamaño que arr
        int[] arr2 = new int[arr.length];
        
        // Elemento por elemento invierte el orden del arreglo original
        for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){
            
            arr2[j] = arr[i];
        }
        return arr2;
    }
    
    public static int[] multiplosDe (int[] arr, int dato){
        
        // Se valida de que el arreglo exista y que su longitud no sea 0
        if (arr == null || arr.length == 0){
            return null; // Si hay un error o algo la longitud del arreglo es 0 regresa: -1
        }
        
        // Se declara arr2 que tendra la misma longitud que arr
        int[] arr2 = new int[arr.length];
        
        // Elemento por elemento se valida que si el residuo del ese elemento dividido entre un dato es 0 haga referencia en memoria
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % dato == 0){
                arr2[i] = arr[i];
            }
        }
        return arr2;
    }
}
