
package ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Book {
    // Instance variables.
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    // Constructor that receives a name, an array of authors and a price.
    public Book(String name, Author[] authors, double price){
        
        this.name = name;
        this.authors = authors;                    
        this.price = price;
    }
    
    // Constructor that receives a name, an array of authors, a price and the qty.
    public Book(String name, Author[] authors, double price, int qty){
        
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    // Method that returns the name value.
    public String getName() {
        return this.name;
    }

    // Method that returns the authors contained in the array.
    public Author[] getAuthors() {
        return this.authors;
    }

    // Method that returns the price value.
    public double getPrice() {
        return this.price;
    }

    // Method that returns the qty value.
    public int getQty() {
        return this.qty;
    }

    // Method that reassign the price variable.
    public void setPrice(double price) {
        this.price = price;
    }

    // Method that reassign the qty variable.
    public void setQty(int qty) {
        this.qty = qty;
    }
    
    // Method that returns the authors contained in the array.
    public String getAuthorNames(){
        String authorss="";
        for (int i=0; i<authors.length; i++){
            
            authorss += authors[i].getName() + "\n";
        }
        return "Authors:\n" + authorss;
    }

    // toString method that prints an output with the format the teacher asked.
    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + ']';
    }            
}
