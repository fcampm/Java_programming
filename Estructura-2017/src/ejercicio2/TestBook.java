/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author root
 */
public class TestBook {
    
    public static void main(String[] args) {
        
        Author vanDick = new Author("Paul van Dick", "pvanDick@nowhereorthere.com", 'm');
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);    
        System.out.println(dummyBook);
        
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        
        Book anotherBook = new Book("more Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    
        Book thirdBook = new Book("Asrrael plox", vanDick, 20.45, 87);
        System.out.println("Author of Asrrael plox: " + thirdBook.getAuthorName());
        System.out.println("Author email of Asrrael plox: " + thirdBook.getAuthorEmail());
        System.out.println("Author gender of Asrrael plox: " + thirdBook.getAuthorGender());
    }
}