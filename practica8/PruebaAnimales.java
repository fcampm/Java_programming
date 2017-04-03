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
public class PruebaAnimales {
 
    public static void main(String[] args) {
        
        Arana a = new Arana();
        Gato g = new Gato("Miujica");
        Gato g2 = new Gato("Benito Bodoque");
        Gato g3 = new Gato("Poltergeist");
        Pez p = new Pez("Don Gato");
        Pez p2 = new Pez("Steve");
        Pez p3 = new Pez("public static void main(String[] args){}");
        
        System.out.println("Animales:");
        System.out.println(a.toString());
        System.out.println(g.toString());
        System.out.println(p.toString());
        System.out.println();
        
        System.out.println("Se cambian los nombres a Don Gato y a Crush:");
        g.cambiarNombre("Nemo");
        p.cambiarNombre("Crush");
        System.out.println(a.toString());
        System.out.println(g.toString());
        System.out.println();
        
        System.out.println("Mascotas:");
        System.out.println(g2.regresarNombre() + g2.jugar());
        System.out.println(p2.regresarNombre() + p2.jugar());
        System.out.println(g3.regresarNombre() + g3.jugar());
        
        System.out.println("Polimorfismo con referencias a clase padre:");
        System.out.println(describeAnimal(g3));
        System.out.println();
        System.out.println("Juegos que jugan las mascotas");
        System.out.println("Pez" + animalesJuegos(p2));
        System.out.println("Gato " + animalesJuegos(g));
    }
        public static String describeAnimal (Animal e){
            if( e != null){
                
                if(e instanceof Gato){
                    Gato g = (Gato) e;
                    return g.toString();
                }
                
                if(e instanceof Pez){
                    Pez p = (Pez) e;
                    return p.toString();
                }                
            }
            return null;
        }
        
        public static String animalesJuegos (Mascota m){
            return m.jugar();
        }
    
}
