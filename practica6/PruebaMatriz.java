
package practica6;
/*
 * Este programa prueba la clase Matriz
 *
*/

import java.util.Scanner;

public class PruebaMatriz {
	
	public static final int REN = 3;
	public static final int COL = 4;
	
	public static void main(String[] args) {
		
		Matriz a = new Matriz(REN, COL);
		Matriz b = new Matriz(REN, COL);
		Matriz d = new Matriz(12, 5);
		Matriz c;
		
		Matriz e = new Matriz();
		Matriz f = new Matriz();
		Matriz g;
		
		
		Scanner entrada = new Scanner(System.in);
		int value, ren, col;
		
		System.out.println("Matriz A");
		System.out.println(a.toString());
		
		System.out.println("Matriz B");
		System.out.println(b.toString());
		
		for ( int i = 0; i < (REN*COL); i++ ) {
			ren = ( int ) ( Math.random() * REN );
			col = ( int ) ( Math.random() * COL );
			value = 1 + ( int ) ( Math.random() * 10 );
			a.setElement(ren, col, value);
		}
		
		for ( int i = 0; i < (REN*COL); i++ ) {
			ren = ( int ) ( Math.random() * REN);
			col = ( int ) ( Math.random() * COL );
			value = 1 + ( int ) ( Math.random() * 10 );
			b.setElement(ren, col, value);
		}
		
		System.out.println("Matriz A modificada");
		System.out.println(a.toString());
		
		System.out.println("Matriz B modificada");
		System.out.println(b.toString());
		
		System.out.println("Suma de matrices");
		c = a.sumaMatrices(b);
		if (c!=null)
			System.out.println(c.toString());
		else
			System.out.println("No se pudo generar la suma de matrices");
		
		System.out.println("Resta de matrices");
		c = a.restaMatrices(b);
		if (c!=null)
			System.out.println(c.toString());
		else
			System.out.println("No se pudo generar la resta de matrices");
		
                System.out.print("\nNumero mayor de la matriz a: ");
                c = a.sumaMatrices(b);
                System.out.println(c.mayorMatriz());
                
                System.out.print("\nNumero menor de la suma de matrices: ");
                c = a.sumaMatrices(b);
                System.out.println(c.menorMatriz());
                
                System.out.println("\nPromedio de la suma de matrices: ");
                c = a.sumaMatrices(b);
                System.out.println(c.promedioMatriz());
	}	
	
}