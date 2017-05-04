/*
 *	Programa SIN validar división entre cero
 *
 */
 
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {
   
   public static double quotient( int numerador, int denominador ) {
      return (double)numerador / denominador;
   } 

   public static void main( String args[] ) {
      Scanner scanner = new Scanner( System.in ); 

      System.out.print( "Dame el numerador: " );
      int numerador = scanner.nextInt();
      
      System.out.print( "Dame el denominador: " );
      int denominador = scanner.nextInt();

      double resultado = quotient( numerador, denominador );
      
      System.out.println("\nResultado: " + numerador + " / " + denominador + " = " + resultado );
   } 
} 
