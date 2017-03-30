
package practica4;

/**
 *
 * @author Fabián
 */
public class PruebaAutor {
    
    public static void main(String[] args){
        
        Autor platon = new Autor ("Platon", "plato_filosofo@gmail.com", 'h');
        Autor brown = new Autor ("Dan Brown", "dan_brown.inferno@yahoo.com", 'h');
        Autor ana = new Autor ("Ana Garcia Bergua", "ana_bergua1378@hotmail.com", 'm');
        Autor octavio = new Autor ("Octavio Paz", "octavio_peace@live.com", 'h');
        
        System.out.println("\n***** Platon *****");
        System.out.println(platon.toString());
        platon.setEmail("platon_mejorque_socrative@hotmail.com");
        System.out.println("\nLos datos de Platon despues de actualizado");
        System.out.println(platon.toString());
        
        System.out.println("\n***** Dan Brown *****");
        System.out.println(brown.toString());
        brown.setEmail("dbrown_books@gmail.com");
        System.out.println("\nLos datos de Dan Brown despues de actulizado");
        System.out.println(brown.toString());
        
        System.out.println("\n***** Ana Garcia Bergua *****");
        System.out.println(ana.toString());
        ana.setEmail("bergua_ana989805@live.com.mx");
        System.out.println("\nLos datos de Ana Garcia Bergua despues de actulizado");
        System.out.println(ana.toString());
        
        System.out.println("\n***** Octavio Paz *****");
        System.out.println(octavio.toString());
        octavio.setEmail("peace_is_the_mision_OP@yahoo.com.mx");
        System.out.println("\nLos datos de Octavio Paz despues de actulaizado");
        System.out.println(octavio.toString());
        
    }
}
