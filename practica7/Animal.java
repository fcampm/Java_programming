/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author Fabian Camp Mussa A01378565
 */
public abstract class Animal {
    
    // Variable de instancia.
    protected String tipoAnimal;

    public Animal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "Un " + this.tipoAnimal;
    }
    
    public abstract String sonido();
    public abstract String actitud();
}
