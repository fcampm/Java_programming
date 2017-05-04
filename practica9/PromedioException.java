
package practica9;

/**
 * @authors Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 * 
 */
import java.util.Scanner;
import java.util.InputMismatchException;


public class PromedioException {
    public static void main(String[] args) {
        
       int n;
       double p;
       Scanner entrada = new Scanner(System.in);
       while (true){
           try{
               System.out.println("Introduce la cantidad de numeros para calcular promedio:");
               n = entrada.nextInt();
               if (n < 0) 
                   throw new ArithmeticException();
            }
           catch(ArithmeticException e){
               System.out.println("El numero tiene que ser posotivo");
               System.out.println("Introduce la cantidad de numeros para calcular promedio:");
               n = entrada.nextInt();
           }
           catch(InputMismatchException e){
               System.out.println("Finalizando ejecucion...");
               break;
           }
               p = promedio(n);
               System.out.println("El promedio es: " + p);
            }
        }
    
    public static double promedio(int n){
        double res = 0;
        int numero;
        System.out.println("Introduce los numeros para sacar el promedio: \n");
        Scanner entrada = new Scanner(System.in);
        for (int i= 0; i<n ; i++){
            numero = entrada.nextInt();
            try{
                if (numero < 0)
                    throw new ArithmeticException();
                else
                    res += numero;
            }catch(ArithmeticException e){
                System.out.println("El dato debe de ser positivo");
                i--;
            
            }
        }
        res = res/n;
        return res;
        
    }    
}
    
