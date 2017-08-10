/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Book {
   
    private String name;
    private Author author;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author author, double price){
        
        this.name = name;
        this.author = new Author(author.getName(), author.getEmail(), author.getGender());
        this.price = price;        
    }
    
    public Book(String name, Author author, double price, int qty){
        
        this.name = name;
        this.author = new Author(author.getName(), author.getEmail(), author.getGender());
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public String getAuthorName(){
        return this.author.getName();
    }
    
    public String getAuthorEmail(){        
        return this.author.getEmail();
    }
    
    public char getAuthorGender(){
        return this.author.getGender();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", " + author.toString() + ", price=" + price + ", qty=" + qty + ']';
    }
    
    
}
