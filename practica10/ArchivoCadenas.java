
package practica10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @authors Fabian Camp Mussa A01378565.
 *          Jose Javier Rodriguez Mota A01372812.
 *          Lenin Silva Gutierrez A01373214.
 */

public class ArchivoCadenas {
        
    public static void main(String[] args) {
        
        // Variables de instancia.
        String palabraMayor = "", palabraMenor = "", palabra;
        int numeroint, menor = 0, mayor = 0, sumaints = 0, total_datos = 0, counterJava = 0;
        double numerofrac, sumafrac = 0.0, menorfrac = 0.0, mayorfrac = 0.0;
        
        Scanner entrada = null;
        // Se pone un try donde ira todo el codigo a realizar.
        try{ 
            // Se inicializa un scanner que va a abrir el archivo de texto y que va a usar los delimitadores del tabulador, salto de linea y vuelta de carro.
            entrada = new Scanner(new FileReader("Entrada3.txt"));
            entrada.useDelimiter("[\t\n\r]+");
            // Condicional que pregunta si tiene una siguiente linea el archivo, este if se usa para tomar la primer linea e incializar las variables con las que se van a comparar.
            if (entrada.hasNextLine()){
                palabraMayor = palabraMenor = entrada.next();
                menor = mayor = entrada.nextInt();
                menorfrac = mayorfrac = entrada.nextDouble();                
                total_datos++;
                sumaints = menor;
                sumafrac = menorfrac;
                
                // Condicional que pregunta que si en el archivo encuentra una palabra identica a java sin importar como este escrito suma uno al contador de javas.
                if("java".compareToIgnoreCase(palabraMayor) == 0){
                    counterJava ++;
                }
                // Se imprime el primer dato del archivo.
                System.out.println(palabraMayor + "\t" + mayor + "\t" + mayorfrac);    
            }
            
            // Ciclo while que va a leer los siguientes datos del archivo hasta que ya no tenga uno.
            while ( entrada.hasNextLine() ) {
                palabra = entrada.next();
                
                // Condicional que sirve para saber cual es la palabra lexicograficamente mayor.
                if(palabra.compareToIgnoreCase(palabraMayor)>0){
                    palabraMayor = palabra;
                }
                
                // Condicional que sirve para saber cual es la palabra lexicograficamente menor.
                if(palabra.compareToIgnoreCase(palabraMenor)< 0){
                    palabraMenor = palabra;
                }
                
                // Condicional que sirve para saber cuantas veces se encuentra la palabra java en el archivo sin importar como este escrita.
                if("java".compareToIgnoreCase(palabra) == 0){
                    counterJava ++;
                }
                
                numeroint = entrada.nextInt();                  
                sumaints += numeroint;
                
                // Condicional que sirve para saber cual es el entero mayor de los datos del archivo.
                if (mayor <= numeroint){
                    mayor = numeroint;
                }
                
                // Condicional que sirve para saber cual es el entero menor de los datos del archivo.
                if (numeroint < menor){
                    menor = numeroint;                    
                }                
                                                                                
                numerofrac = entrada.nextDouble();                                                                
                sumafrac += numerofrac;
                
                // Condicional que sirve para saber cual es el double mayor de los datos del archivo.
                if (mayorfrac <= numerofrac){
                    mayorfrac = numerofrac;
                }
                
                // Condicional que sirve para saber cual es el double menor de los datos del archivo.
                if (numerofrac < menorfrac){
                    menorfrac = numerofrac;
                }
                
                total_datos ++;
                
                // Se imprimen los datos que el archivo contiene.
                System.out.println(palabra + "\t" + numeroint + "\t" + numerofrac);    
            }
            
            System.out.println("El menor de los datos enteros es: " + menor);
            System.out.println("El mayor de los datos enteros es: " + mayor);
            System.out.println("El menor de los datos doubles es: " + menorfrac);
            System.out.println("El mayor de los datos doubles es: " + mayorfrac);
            // Se imprime el calculo del promedio de los enteros y de los doubles.
            System.out.println("El promedio de los datos enteros es: " + sumaints/(double) total_datos);
            System.out.println("El promedio de los datos doubles es: " + sumafrac/total_datos);
            System.out.println("La cadena lexicograficamente mayor es: " + palabraMayor);
            System.out.println("La cadena lexicograficamente menor es: " + palabraMenor);
            System.out.println("La palabra java se repite " + counterJava + " veces en el archivo" );
        }
        
        // Excepciones que puede arrojar a la hora de utilizar los archivos, que no lo encuentre, que no sea el tipo de dato y que falten elementos en el archivo.
        catch (FileNotFoundException e) {
            System.err.println(e);
            System.out.println("Archivo NO encontrado!!");
        } 
	catch (InputMismatchException e){
            System.err.println(e);
            System.out.println("Error en el tipo de datos!!");
        } 
        catch (NoSuchElementException e) {
            System.err.println(e);
            System.out.println("Error durante la lectura, faltan datos!!");
	}
        
        // Se cierra el archivo.
	finally {
            entrada.close();
        }
        
    }
}