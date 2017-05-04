/*
 *	Programa que valida la división entre cero
 *
 */
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {
   
   public static double quotient( int numerador, int denominador) 
      throws ArithmeticException {
      	
      	if (denominador == 0) 
      		throw new ArithmeticException("Division entre cero");
      	
      	return (double)numerador / denominador; 
   } 

   public static void main( String args[] ) {
      Scanner scanner = new Scanner( System.in );
      boolean continueLoop = true; 

      do {
         try {
            System.out.print( "Dame el numerador: " );
            int numerador = scanner.nextInt();
            System.out.print( "Dame el denominador: " );
            int denominador = scanner.nextInt();

            double resultado = quotient( numerador, denominador );

            System.out.printf( "\nResult: %d / %d = %f\n", numerador,
               denominador, resultado );
               
            continueLoop = false; 
         } 
         
// cachar error de entrada de datos (letras en lugar de numeros)
// esta excepcion la lanza el método nextInt de la clase Scanner         
         catch ( InputMismatchException i) {
         	
// salida en la consola de error para verificacion del programador
            System.err.printf( "\nExcepcion: %s\n", i);

// vaciar el buffer de entrada para evitar quedarse en el ciclo do-while
// porque si se lanzó la excepcion entonces NUNCA se vació el buffer
// de entrada porque el dato nunca se asignó a la variable de tipo
// int
	      scanner.nextLine();

// salida de mensaje de error en la consola del usuario
            System.out.println(
               "Debes dar numeros enteros. Intenta de nuevo.\n" );
         }
         
// cachar error de division entre cero        
         catch ( ArithmeticException a ) {

// salida en la consola de error para verificacion del programador
            System.err.printf( "\nExcepcion: %s\n", a );

// salida de mensaje de error en la consola del usuario
            System.out.println(
               "Denominador CERO invalido. Intenta de nuevo.\n" );
         }
      } while ( continueLoop ); 
   } 
}
