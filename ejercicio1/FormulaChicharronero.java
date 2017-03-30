
package ejercicio1;

/**
 *
 * @author Fabián Camp Mussa
 * Date: Enero 16, 2017.
 */
public class FormulaChicharronero {
    /* Por ser pública cualquiera puede accesar y correrlo porque es pública
     * Por convención la primera letra va en mayúscula y si son más de dos palabras la primera letra
     * de la segunda palabra va con mayúscula
     */
    public static void main(String[] args){ // Esta línea es esencial para que el programa corra es el main()
        int b = 25; // También lo podrías poner: int b = 25, a = 4; como en la línea 17.
        int a = 4;
        double c = 3.42, x1, x2; // Double es un número real ej: 4.5
        x1 = ((b * -1.0) + Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a); 
        x2 = ((b * -1.0) - Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a);
        System.out.println("La raíz 1 es: " + x1); // Esto imprime junto con un salto de línea
        System.out.println("La raíz 2 es: " + x2); // System.out.print() imprime y NO hace salto de línea.
    }
            
}
