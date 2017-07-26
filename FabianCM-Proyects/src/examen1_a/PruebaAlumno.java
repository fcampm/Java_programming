package examen1_a;
/*
Author: Fabian Camp Mussa.
Date: July 27, 2017.
Topic: Practice exercises.
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
 		
 	 	// AQU� MODIFICA EL PROMEDIO DE SERGIO A 95.0 E IMPRIME 		
 		//LOS NUEVOS VALORES DE LOS ATRIBUTOS DEL OBJETO SERGIO
                System.out.println("\nData of Sergio after actualization");
 		sergio.setPromedio(95.0);                
                System.out.println("\n" + sergio.toString());
 		// AQU� MODIFICA EL PROMEDIO DE ARACELI A 50.0 E IMPRIME 		
 		//LOS NUEVOS VALORES DE LOS ATRIBUTOS DEL OBJETO ARACELI
 	 	System.out.println("\nData of Araceli after actualization");
 		araceli.setPromedio(50.0);
                System.out.println("\n" + araceli.toString());
 		
 			
 	}
 }
