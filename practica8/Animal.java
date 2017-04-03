/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author root
 */
public abstract class Animal {
    
    protected int patas;

    public Animal(int patas) {
        this.patas = patas;
    }
    
    public abstract String comer();
    
    public String caminar(){
        return "camina con " + this.patas + " patas";
    }

    @Override
    public String toString() {
        return  caminar() + " y " + comer();
    }
    
    

}
