package practica7;

/*
 * Clase PruebaAnimal.java
 * Objetivo: Probar la jerarqu�a de clases de la Pr�ctica #7. 
 * 		 Clases Abstractas y Polimorfismo.
 * Autor:
 * Matricula:
 */
	
public class PruebaAnimal {
	
	public static void main (String[] args){
			
		Perro miPerro = new Perro ("Murphy", "Poodle", "croquetas de pollo");
		Gato miGato = new Gato ("Debbie","Siamese", "salmon frito en aceite de alga");
                Rana miRana = new Rana ("Kermit", "veneno paralizante", "anfibae manonare", "insectos salteados en ajo");
		
		System.out.println(miPerro);
		System.out.println(miGato);
		System.out.println(miRana);
                
		System.out.println(PruebaAnimal.anuncia(miPerro));
		System.out.println(PruebaAnimal.anuncia(miGato));
                System.out.println(PruebaAnimal.anuncia(miRana));
                System.out.println("El veneno de la rana " + miRana.getNombre() + " es:");
                System.out.println(miRana.getVeneno_mata());
		
		PruebaAnimal.cambiaNombre(miPerro, "Lassie");
		PruebaAnimal.cambiaNombre(miGato, "Garfield");
		PruebaAnimal.cambiaNombre(miRana, "Renegayde");
                
                System.out.println(PruebaAnimal.actitudAnimales(miGato));
                System.out.println(PruebaAnimal.actitudAnimales(miPerro));
                System.out.println(PruebaAnimal.actitudAnimales(miRana));
                
                PruebaAnimal.comidaComer(miPerro, "galletas de hueso al mojo de ajo");
                PruebaAnimal.comidaComer(miGato, "estambre al pesto con rayadura de raton salteado");
                PruebaAnimal.comidaComer(miRana, "plantas carnivoras estilo Mario Bros hoguera");
                
		System.out.println(miPerro);
		System.out.println(miGato);
                System.out.println(miRana);
		
		System.out.println("\n\n");
	}
	
	public static String anuncia (Animal a){
	
            // No se requiere hacer el downcast porque la clase padre y las clases hijas tienen 
            // el metodo sonido() y el toString() por lo que no se hace el instanceof...
            return a.toString() + " dice " + a.sonido();
	}
        
        public static String actitudAnimales (Animal b){
            
            return b.toString() + " su actitud es " + b.actitud();
        }
	
	public static void cambiaNombre(Animal a, String nombre){
            if (a != null){
                if (a instanceof Gato){
                    Gato g = (Gato) a;
                    g.setNombre(nombre);
                }
                
                if (a instanceof Perro){
                    Perro p = (Perro) a;
                    p.setNombre(nombre);
                }
                
                if (a instanceof Rana){
                    Rana r = (Rana) a;
                    r.setNombre(nombre);
                }
            }
	}
        
        public static void comidaComer(Animal a, String comida){
            if (a != null){
                if (a instanceof Gato){
                    Gato g = (Gato) a;
                    g.setComida(comida);
                }
                
                if (a instanceof Perro){
                    Perro p = (Perro) a;
                    p.setComida(comida);
                }
                
                if (a instanceof Rana){
                    Rana r = (Rana) a;
                    r.setComida(comida);
                }
            }
            
        }
}