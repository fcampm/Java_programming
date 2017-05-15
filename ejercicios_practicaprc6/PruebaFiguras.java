package ejercicios_practicaprc6;

/*
 * Clase de prueba para la jerarqu�a de figuras
 * Autor:
 * Matricula:
 */
 
import java.io.*;
import java.util.*;

public class PruebaFiguras {

	public static void main(String[] args) {
	
		Scanner entrada = null;
		String tipoFigura = "";
		int x, y, i=0, lado;
		double radio;
		Figura [] figuras = new Figura[10];
				
		try{
			
			entrada = new Scanner(new FileReader("Figuras.txt"));
			entrada.useDelimiter("[\t\n\r]+");
			
			while (entrada.hasNext()) {
                            tipoFigura = entrada.next();
                            x = entrada.nextInt();
                            y = entrada.nextInt();
                            lado = entrada.nextInt();
                            if (tipoFigura.compareToIgnoreCase("Cubo") == 0){
                                figuras[i++] = new Cubo (x, y, lado);                                    
                            }
                                
                            if (tipoFigura.compareToIgnoreCase("Cuadrado") == 0){
                                figuras[i++] = new Cuadrado (x, y, lado);
                            }
                            
                                                                
                        }
                        for(i= 0; i < figuras.length; i++){
                                
                            System.out.println(figuras[i]);
			}
			
			
			System.out.println("\n");
			
			if (PruebaFiguras.comparaFiguras(figuras[3], figuras[5]) == 1)
				System.out.println("\nAmbos " + figuras[3].getNombre() +"s tienen la misma area");
		
			if (PruebaFiguras.comparaFiguras(figuras[3], figuras[8]) == 2)
				System.out.println("\nAmbos " + figuras[3].getNombre() +"s tienen diferente area");
		
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
	
	
	
	// Este es el m�todo comparaFiguras que DEBES implementar
	public static int comparaFiguras(Figura a, Figura b){
	
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
            return 0;
        }
	
	// Este es el m�todo dibujaFigura que DEBES implementar
	public static String dibujaFigura(Figura a) {
	
            if (a instanceof Cubo){                
                Cubo cubA = (Cubo) a;
                return cubA.dibuja();
            }
            if (a instanceof Cuadrado){
                Cuadrado cuaA = (Cuadrado) a;
                return cuaA.dibuja();
            }
            return null;
	}


}
