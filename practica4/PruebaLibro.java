
package practica4;

/**
 *
 * @author Fabián
 */
public class PruebaLibro {
    public static void main(String [] args){
        Autor brown = new Autor("Dan Brown", "dan_brown.inferno@yahoo.com", 'h');
        Autor ana = new Autor ("Ana Garcia Bergua", "ana_bergua1378@hotmail.com", 'm');
        Autor percy = new Autor ("Percy J.C", "this_is_not_percy@yahoo.com", 'm');

        Libro inferno = new Libro ("Inferno", brown, 500.0, 400);
        System.out.println("\n***** Inferno *****");
        System.out.println (inferno.toString());
        
        Libro dialogos = new Libro("Dialogos", new Autor("Platon", "plato_filosofo@gmail.com", 'h'), 45.80);
        System.out.println("\n***** Dialogos *****");
        System.out.println(dialogos.toString());
        
        Libro anillos = new Libro("El señor de los anillos", new Autor("J.R.R Tolkien", "tolkien_bolson@yahoo.com", 'h'), 450.75);
        System.out.println("\n***** Señor de los anillos *****");
        System.out.println(anillos.toString());
    
        Libro tormenta = new Libro("Tormenta hindu y otras historias", ana, 175.25, 350);
        System.out.println("\n***** Tormenta hindu y otras historias*****");
        System.out.println(tormenta.toString());
        
        Libro percy1 = new Libro("Percy Jackson y el ladron del rayo", percy, 350.30, 25);
        System.out.println("\n***** Autor del libro pedido*****");
        System.out.print("\nEl autor de ese libro es: ");
        System.out.println(percy1.getAuthorName());
        
        Libro saratustra = new Libro("Y asi hablo Saratustra", new Autor("Fredrich Nietzsche", "nietzsche_maniacphilosof@gmail.com", 'h'), 560.56);
        System.out.println("\n****Datos del autor del libro Maze Runner*****");
        System.out.print("Autor: ");
        System.out.println(saratustra.getAuthorName());
        System.out.print("Email: ");
        System.out.println(saratustra.getAuthorEmail());
        System.out.print("Genero: ");
        System.out.println(saratustra.getAuthorGender());
        
    }
}
