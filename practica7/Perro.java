/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica7;

/**
 *
 * @author root
 */
public class Perro extends Animal{
    
    // Variables de instancia.
    private String nombre;
    private String raza;
    private String comida;

    public Perro(String nombre, String raza, String comida) {
        super("perro");
        this.nombre = nombre;
        this.raza = raza;
        this.comida = comida;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.nombre + " el " + this.raza + " la comida que come es " + this.comida;
    }

    @Override
    public String sonido() {
        return "woof, woof";
    }

    @Override
    public String actitud() {
        return "agitar la cola cuando su amo llega";
    }
    
    public void setComida(String comida){
        this.comida = comida;
    }
}
