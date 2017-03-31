package practica7;

/*
 * Clase PruebaAnimal.java
 * Objetivo: Probar la jerarqu�a de clases de la Pr�ctica #7. 
 * 		 Clases Abstractas y Polimorfismo.
 *
 * Autores: Fabian Camp Mussa A01378565
 *          Jose Javier Rodriguez Mota A01372812
 *          Lenin Silva Gutierrez A01373214
 * 
 */
	
public class PruebaAnimal {
	
	public static void main (String[] args){
			
		Perro miPerro = new Perro ("Murphy", "Poodle", "croquetas de pollo");
                Perro miPerro2 = new Perro ("Snoopy", "Beagle", "beagles con cafe");
		Gato miGato = new Gato ("Debbie","Siamese", "salmon frito en aceite de alga");
                Gato miGato2 = new Gato ("Tom", "Egipsio", "leche tibia antes de dormir");
                Rana miRana = new Rana ("Kermit", "veneno paralizante", "anfibae manonare", "insectos salteados en ajo");
                Rana miRana2 = new Rana ("Pepe", "veneno que hace que salgas de su corazon", "anfibae relacionae", "moscas a punto de dormir");
		Oso miOso = new Oso ("Pedobear", "Grizley", "pescado crudo del rio", "cafe");
                Oso miOso2 = new Oso ("Trump", "Polar", "las lagrimas de los pinguinos indocumentados", "blanco con copete amarillo");
                
		System.out.println(miPerro);
                System.out.println(miPerro2);
		System.out.println(miGato);
                System.out.println(miGato2);
		System.out.println(miRana);
                System.out.println(miRana2);
                System.out.println(miOso);
                System.out.println(miOso2);
                
                
		System.out.println(PruebaAnimal.anuncia(miPerro));
                System.out.println(PruebaAnimal.anuncia(miPerro2));
		System.out.println(PruebaAnimal.anuncia(miGato));
                System.out.println(PruebaAnimal.anuncia(miGato2));
                System.out.println(PruebaAnimal.anuncia(miRana));
                System.out.println(PruebaAnimal.anuncia(miRana2));
                System.out.println(PruebaAnimal.anuncia(miOso));
                System.out.println(PruebaAnimal.anuncia(miOso));
                
                System.out.println("El veneno de la rana " + miRana.getNombre() + " es:");
                System.out.println(miRana.getVeneno_mata());
		System.out.println("El veneno de la rana " + miRana2.getNombre() + " es:");
                System.out.println(miRana2.getVeneno_mata());
                
		PruebaAnimal.cambiaNombre(miPerro, "Lassie");
                PruebaAnimal.cambiaNombre(miPerro2, "Dewey");
		PruebaAnimal.cambiaNombre(miGato, "Garfield");
                PruebaAnimal.cambiaNombre(miGato2, "Wilson");
		PruebaAnimal.cambiaNombre(miRana, "Renegayde");
                PruebaAnimal.cambiaNombre(miRana2, "Farcuad");
                PruebaAnimal.cambiaNombre(miOso, "Ofarrill");
                PruebaAnimal.cambiaNombre(miOso2, "Spicer");
                
                System.out.println(PruebaAnimal.actitudAnimales(miGato));
                System.out.println(PruebaAnimal.actitudAnimales(miPerro));
                System.out.println(PruebaAnimal.actitudAnimales(miRana));
                System.out.println(PruebaAnimal.actitudAnimales(miOso));
                
                PruebaAnimal.comidaComer(miPerro, "galletas de hueso al mojo de ajo");
                PruebaAnimal.comidaComer(miPerro2, "agua de coladera");
                PruebaAnimal.comidaComer(miGato, "estambre al pesto con rayadura de raton salteado");
                PruebaAnimal.comidaComer(miGato2, "lassagna de perro con un toque de ratón a las brasas");
                PruebaAnimal.comidaComer(miRana, "plantas carnivoras estilo Mario Bros hoguera");
                PruebaAnimal.comidaComer(miRana2, "los sentimientos de los camaradas caidos");
                PruebaAnimal.comidaComer(miOso, "hobbits a la plancha estilo california");
                PruebaAnimal.comidaComer(miOso2, "chicles con una pisca de enojo y de reporteros mexicanos");
                
		System.out.println(miPerro);
                System.out.println(miPerro2);
		System.out.println(miGato);
                System.out.println(miGato2);
                System.out.println(miRana);
                System.out.println(miRana2);
                System.out.println(miOso);
                System.out.println(miOso2);
		
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
                
                if (a instanceof Oso){
                    Oso o = (Oso) a;
                    o.setNombre(nombre);
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
                
                if (a instanceof Oso){
                    Oso o = (Oso) a;
                    o.setComida(comida);
                }
            }
            
        }
}