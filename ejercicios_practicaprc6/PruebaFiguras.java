package ejercicios_practicaprc6;

/*
 * Clase de prueba para la jerarquia de figuras
 * Autor: Fabian Camp Mussa.
 */
 
import java.io.*;
import java.util.*;

public class PruebaFiguras {

	public static void main(String[] args) {
                
                // Variables de instancia.
		Scanner entrada = null;
		String tipoFigura = "";
		int x, y, i=0, lado;
		double radio;
		Figura [] figuras = new Figura[10];
		
                // Try y catchs para la apertura de archivos.
		try{
			
			entrada = new Scanner(new FileReader("Figuras.txt"));
			entrada.useDelimiter("[\t\n\r]+");
			
                        // Los datos se toman siguiendo la descripcion del UML que seria: String, int, int, int.
			while (entrada.hasNext()) {
                            tipoFigura = entrada.next();
                            x = entrada.nextInt();
                            y = entrada.nextInt();
                            lado = entrada.nextInt();
                            
                            // Condicional que pregunta si el String tipoFigura es igual que cubo de manera lexicografica sin importar como este escrita.
                            if (tipoFigura.compareToIgnoreCase("Cubo") == 0){
                                figuras[i++] = new Cubo (x, y, lado);                                    
                            }
                             
                            // Condicional que pregunta si el String tipoFigura es igual que cuadrado de manera lexicogradica sin importar como este escrita.
                            if (tipoFigura.compareToIgnoreCase("Cuadrado") == 0){
                                figuras[i++] = new Cuadrado (x, y, lado);
                            }
                            
                                                                
                        }
                        // Ciclo que imprime el contenido del arreglo figuras.
                        for(i= 0; i < figuras.length; i++){
                                
                            System.out.println(figuras[i]);
			}
			
			
			System.out.println("\n");
			
                        // Condiconal que pregunta si el resultado de comparaFiguras es igual a 1.
			if (PruebaFiguras.comparaFiguras(figuras[3], figuras[5]) == 1)
				System.out.println("\nAmbos " + figuras[3].getNombre() +"s tienen la misma area");
		
                        // Condicional que pregunta si el resultado de comparaFiguras es igual a 2.
			if (PruebaFiguras.comparaFiguras(figuras[3], figuras[8]) == 2)
				System.out.println("\nAmbos " + figuras[3].getNombre() +"s tienen diferente area");
		
                        // Condicional que pregunta si el resultado de comparaFiguras es igual a 0.
			if (PruebaFiguras.comparaFiguras(figuras[3], figuras[4]) == 0)
				System.out.println("\nNo puede compararse un "+ figuras[3].getNombre() +" con un " + figuras[4].getNombre());
			
			System.out.println("\n");
		
			System.out.println("Dibujando la figura en la posicion 0 del arreglo \n" + PruebaFiguras.dibujaFigura(figuras[0]));

			System.out.println("Dibujando la figura en la posicion 4 del arreglo \n" + PruebaFiguras.dibujaFigura(figuras[4]));
			
			System.out.println("Dibujando la figura en la posicion 7 del arreglo \n" + PruebaFiguras.dibujaFigura(figuras[7]));

			System.out.println("\n");
	
		} 
	 	catch (FileNotFoundException e) {
			System.err.println("Archivo no encontrado");
		} 
		catch (InputMismatchException e) {
			System.err.println("Error en el tipo de datos esperado");
		} 
		catch (java.util.NoSuchElementException e) {
			System.err.println("Error en el formato del archivo");
		}
		catch (NullPointerException e){
			System.err.println(e);
		}
		finally {
			entrada.close();
      }
        
      System.out.println("\n\n");
	}
	
	
	
	// Metodo que compara figuras siguiendo las especificaciones del UML.
	public static int comparaFiguras(Figura a, Figura b){
	
            // Se realiza un doble downcast para poder preguntar si el area de la figura a es igual al area de la figura b en caso de que sea un cuadrado.
            if (a instanceof Cuadrado){
                if(b instanceof Cuadrado){
                    Cuadrado cB = (Cuadrado) b;
                
                    Cuadrado cA = (Cuadrado) a;
                    if (cA.area() == cB.area()){
                        return 1;
                    }
                    else{
                        return 2;
                    }
                }                        
            }
            // Se realiza un doble downcast para poder preguntar si el area de la figura a es igual al area de la figura b en caso de que sea un cubo.
            if (a instanceof Cubo){
                if(b instanceof Cubo){
                    Cubo cuB = (Cubo) b;
                    
                    Cubo cuA = (Cubo) a;
                    if (cuA.area() == cuB.area()){
                        return 1;
                    }
                    else{
                        return 2;
                    }
                }
            }
            // Se regresa 0 si las figuras son diferentes.
            return 0;
        }
	
	// Metodo que imprime solamente la figura que se le esta mandando de parametro, no es necesario un downcast porque ese metodo lo tienen la clase padre e hijas.
	public static String dibujaFigura(Figura a) {
            
            return a.dibuja();
	}


}
