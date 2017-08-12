/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Arrays;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class Book {
    
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
    public Book(String name, Author[] authors, double price){
        
        this.name = name;
        for (int i=0; i<authors.length; i++){
            this.authors[i]= authors[i];            
        }
        this.price = price;
    }
    
    public Book(String name, Author[] authors, double price, int qty){
        
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return this.name;
    }

    public Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public String getAuthorNames(){
        String authorss="";
        for (int i=0; i<authors.length; i++){
            
            authorss += authors[i].getName() + "\n";
        }
        return "Authors:\n" + authorss;
    }

    @Override
    public String toString() {
        return "Book[" + "name=" + name + ", authors=" + Arrays.toString(authors) + ", price=" + price + ", qty=" + qty + ']';
    }
    
    
    
}
