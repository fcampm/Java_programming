
package ejercicio2;

import java.util.Scanner; // Para importar todas las clases de un paquete es utilizando el "*"
/**
 *
 * @author Fabián Camp Mussa
 * Date: Enero 19, 2017.
 */
public class OperacionesMatematicas {
    
    public static void main(String[] args){
        double x;
        int a, b;
        double c, d, resultado;
        int opcion;
        Scanner entrada = new Scanner(System.in); //Scanner declara el objeto para poder recibir datos de teclado
        
        do{
        menu();
        
        System.out.print("Selecciona una opción: ");
        opcion = entrada.nextInt();
        
        switch(opcion){
            case 1: 
                System.out.print("Dame el valor de a (int): ");
                a = entrada.nextInt();
                System.out.print("Dame el valor de b (int): ");
                b = entrada.nextInt();
                System.out.print("Dame el valor de c (double): ");
                c = entrada.nextDouble();
                formulaChicharronero(a, b, c);
                break;
            case 2:
                System.out.println("Dame el primer dato (double): ");
                c = entrada.nextDouble();
                System.out.println("Dame el segundo dato (double): ");
                d = entrada.nextDouble();
                resultado = suma(c, d);
                System.out.println("La suma de " + c + " + " + d + " es: " + resultado);
                break;
            case 3:
                System.out.println("Dame el numerador: ");
                c = entrada.nextDouble();
                System.out.println("Dame el denominador: ");
                d = entrada.nextDouble();
                resultado = division(c, d);
                System.out.println("La división de" + c + " / " + d + " es: " + resultado);
                break;
            case 4:
                System.out.println("Gracias por usar este programa, ¡Vuelve pronto!");
                break;
            default:
                System.out.println("Opción no válida");
        } // Llave del switch
        } while (opcion != 4);
    } // Llave del main
    
    public static void formulaChicharronero(int a, int b, double c){
        double x1, x2;
        x1 = ((b * -1.0) + Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a); 
        x2 = ((b * -1.0) - Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a);
        System.out.println("La raíz 1 es: " + x1); 
        System.out.println("La raíz 2 es: " + x2); 
    }
    
    public static double suma(double x, double y){
        
        return x + y;
    }
    
    public static double division(double x, double y){
        if (y != 0){
            return x / y;
        }
        else{
            return 0;
        }
    }
    
    public static void menu(){
        System.out.println("     *** Menú principal ***");
        System.out.println("1. Fórmula del Chicharronero");
        System.out.println("2. Suma");
        System.out.println("3. División");
        System.out.println("4. Salir");
    }
    
}
    