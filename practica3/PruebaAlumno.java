package practica3;


/*
 * Clase de prueba para Alumno
 *
 * Autor 1: A01378565 Fabian Camp Mussa
 * Autor 2: A01372812 Jose Javier Rodriguez Mota.
 * Autor 3: A01373214 Lenin Silva Gutierrez.
 *
 * Fecha: Febrero 20, 2017.
 */
 
 public class PruebaAlumno {
 	
 	public static void main(String [] args) {
 		
 		Alumno ivan = new Alumno("Ivan", "Garcia", "231212", 87.5);
 		Alumno marco = new Alumno("Marco", "Arellano", "123246", 98.5);
 		Alumno arturo = new Alumno("Arturo", "Rosas", "987656", 90.5);
 		Alumno pilar = new Alumno("Pilar", "Mercado", "675374", 75.5);
 		Alumno araceli = new Alumno("Araceli", "Robledo", "876767", 83.0);
 		Alumno isabel = new Alumno("Isabel", "Suarez", "987654", 83.0);
 		Alumno sergio = new Alumno("Sergio", "Parrodi", "567894", 65.4);	
 		
 		
 		System.out.println("\nLista de alumnos\n");
 		
 		System.out.println("\n" + ivan.toString());
 		System.out.println("\n" + marco.toString());
 		System.out.println("\n" + arturo.toString());
 		System.out.println("\n" + pilar.toString());
 		System.out.println("\n" + araceli.toString());
 		System.out.println("\n" + isabel.toString());
 		System.out.println("\n" + sergio.toString());
 		
 		// Los nuevos valores de los atributos del objeto Sergio con 95.0 de promedio
                System.out.println("\n Los datos de Sergio después de la actualización del promedio");
                // Se establece el nuevo promedio para el objeto sergio modificando el anterior que tenia
 		sergio.setPromedio(95.0);
                System.out.println("\n" + sergio.toString());
                
 		// Los nuevos valores de los atributos del objeto Araceli con 50.0 de promedio
                System.out.println("\n Los datos de Araceli después de la actualización del promedio");
                // Se establece el nuevo promedio para el objeto araceli modificando el anterior que tenia
                araceli.setPromedio(50.0);
                System.out.println("\n" + araceli.toString());
 	 	
 		
 		
 			
 	}
 }
