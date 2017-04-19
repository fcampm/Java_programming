
package ejercicios_practicaprc3;

/*
* @author Fabian Camp Mussa
*
* Date: April 19, 2017.
*/

public class PruebaDoctor {
    
    public static void main(String[] args) {
        
        Fecha fecha1 = new Fecha(12, 2, 1963);
 	Fecha fecha2 = new Fecha(3, 8, 1966);
 	Fecha fecha3 = new Fecha(16, 10, 1985);
 	Fecha fecha4 = new Fecha(1, 8, 1966);
 	Fecha fecha5 = new Fecha(16, 12, 1970);
        Fecha fecha6 = new Fecha(4, 3, 1960);
        
        Doctor angelica = new Doctor("Angelica", "Chavez", fecha1, "A23B2", "cardiologia", 23000.0, 2);
        Doctor marco = new Doctor("Marco", "Gutierrez", fecha2, "G316C", "neurologia", 25000.0, 5);
        Doctor mary = new Doctor("Mary", "Blanco", fecha3, "B987D", "oncologia", 15000.0, 4);
        Doctor sergio = new Doctor("Sergio", "Suarez", fecha4, "N892D", "pediatria", 30000.0, 2);
        Doctor irene = new Doctor("Irene", "Ruiz", fecha5, "I386J", "oncologia", 12000.0, 1);
        Doctor ernesto = new Doctor("Ernesto", "Anaya", fecha6, "E776M", "gastroenterologia", 2000.0, 1);
        
        System.out.println("\n" + angelica.toString());       
        System.out.println("\n" + marco.toString());        
        System.out.println("\n" + mary.toString());       
        System.out.println("\n" + sergio.toString());        
        System.out.println("\n" + irene.toString());        
        System.out.println("\n" + ernesto.toString());       
        System.out.println("\nEl total de doctores registrados es: " + Doctor.totalDoctores());
        
        ernesto.setTotalAsociaciones(3); 
        System.out.println("\n\nActualizando los datos de Ernesto: \n" + ernesto.toString());
       
        marco.setPagoBase(30000.0); 
        System.out.println("\n\nActualizando los datos de Marco: \n" + marco.toString());
  
        sergio.setPagoBase(40000.0); 
        System.out.println("\n\nActualizando los datos de Sergio: \n" + sergio.toString());
    
        mary.setTotalAsociaciones(2); 
        System.out.println("\n\nActualizando los datos de Mary: \n" + mary.toString());
         
        System.out.println("\n\n");
       
    }
   
}
