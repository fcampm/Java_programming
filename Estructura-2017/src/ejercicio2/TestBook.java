
package ejercicio2;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestBook {
    // Main method.
    public static void main(String[] args) {
        
        // Objects authors vanDick, ahTeck that uses the author constructor.
        Author vanDick = new Author("Paul van Dick", "pvanDick@nowhereorthere.com", 'm');
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        
        // Object book dummyBook that uses the constructor that receives a name, an author, a price and the qty.
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);    
        System.out.println(dummyBook);
        
        // Reassign of the price and qty variables.
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        
        // Object book anotherBook that uses the constructor that receives a name, an author and a price.
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    
        // Object book thirdBook that uses the constructor that receives a name, an author, a price and the qty.
        Book thirdBook = new Book("Asrrael plox", vanDick, 20.45, 87);
        System.out.println("Author of Asrrael plox: " + thirdBook.getAuthorName());
        System.out.println("Author email of Asrrael plox: " + thirdBook.getAuthorEmail());
        System.out.println("Author gender of Asrrael plox: " + thirdBook.getAuthorGender());
    }
}