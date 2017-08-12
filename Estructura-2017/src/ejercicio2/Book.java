
package ejercicio2;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Book {
    // Instance variables
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    
    // Constructor that receives a name, an object author and a price.
    public Book(String name, Author author, double price){
        
        this.name = name;
        this.author = new Author(author.getName(), author.getEmail(), author.getGender());
        this.price = price;        
    }
    
    // Constructor that receives a name, an object author, a price and qty.
    public Book(String name, Author author, double price, int qty){
        
        this.name = name;
        this.author = new Author(author.getName(), author.getEmail(), author.getGender());
        this.price = price;
        this.qty = qty;
    }

    // Method that returns the name value.
    public String getName() {
        return this.name;
    }

    // Method that returns the author values.
    public Author getAuthor() {
        return this.author;
    }

    // Method that returns the price value.
    public double getPrice() {
        return this.price;
    }
    
    // Method that returns the qty value.
    public int getQty(){
        return this.qty;
    }
    
    // Method that returns only the author name (remembering that Author it's an object).
    public String getAuthorName(){
        return this.author.getName();
    }
    
    // Method that returns only the author email (remembering that Author it's an object).
    public String getAuthorEmail(){        
        return this.author.getEmail();
    }
    
    // Method that returns only the author gender (remembering that Author it's an object).
    public char getAuthorGender(){
        return this.author.getGender();
    }

    // Method that reassign the price value.
    public void setPrice(double price) {
        this.price = price;
    }

    // Method that reassign the qty value.
    public void setQty(int qty) {
        this.qty = qty;
    }

    // toString method that prints an output with the format the teacher asked.
    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + ']';
    }
    
    
}
