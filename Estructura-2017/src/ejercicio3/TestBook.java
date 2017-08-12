
package ejercicio3;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestBook {
    // Main method. 
    public static void main(String[] args) {
        // Creation of an array of authors and assignment of spaces inside the array.
        Author[] authors = new Author[2];
        Author[] authors2 = new Author[3];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@somewhere.com", 'm');
        authors2[0] = new Author("Pepe Lepu", "pplepu@somewhere.com", 'm');
        authors2[1] = new Author("Erika Besterclay", "erikabc@somewhere.com", 'f');
        authors2[2] = new Author("Barney Stinson", "barneywaitforit_stinson@awesome.com", 'm');
        
        /* Object book javaDummy that uses the constructor that receives a name, an array of authors, a price 
           and the qty*/
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);        
        System.out.println(javaDummy);        
        System.out.println(javaDummy.getAuthorNames());
        
        /* Object book playBook that uses the constructor that receives a name, an array of authors
           and a price*/        
        Book playBook = new Book("The Playbook", authors2, 20.98);
        System.out.println(playBook);
        System.out.println(playBook.getAuthorNames());
    }
}
