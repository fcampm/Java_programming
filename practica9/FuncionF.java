
package practica9;

/**
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 * 
 */
import java.lang.Math;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FuncionF {
    
    public static void main(String[] args) {
        double x;
        Scanner entrada = new Scanner(System.in);
        
        while (true){
            
            try{
                
            
                System.out.println("Escribe un numero: ");
                x = entrada.nextDouble();
                
                if (f(x) != -1)
                    System.out.println("El resultado es: " + f(x));
                
            }
            catch(InputMismatchException e){
                System.out.println("Finalizando ejecucion...");
                entrada.nextLine();
                break;
            }
        }
    }
    public static double f (double x) throws ArithmeticException{
        try{
            if(x<1) throw new ArithmeticException();
                return Math.sqrt(Math.pow(x,3)-1);
        }
        catch(ArithmeticException e){
            System.out.println("f(): El numero " + x + " es menor a 1.0 y es invalido!");
                return -1;
        }
    }
}   

