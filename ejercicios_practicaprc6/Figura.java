package ejercicios_practicaprc6;

/*
 * Clase abstracta Figura
 * Autor:
 * Matricula:
 */
 
 public abstract class Figura {
 
 	protected int totalLados;
 	protected String nombre;
 	protected int x, y;
 	
 	public Figura(int totalLados, String nombre, int x, int y){

            if (totalLados >= 0){
                
                this.totalLados = totalLados;
            }
            else{ 
                this.totalLados = 0;
            }
            this.nombre = nombre;
            if (x >= 0){
                
                this.x = x;
            }
            else{
                this.x = 0;
            }
            if (y >= 0){
                
                this.y = y;
            }
            else{
                this.y = 0;
            }
 	}
 	
 	public int getTotalLados(){

            return this.totalLados;
 	}
 	
 	public int getX(){

            return this.x;
 	}
 	
 	public int getY(){

            return this.y;
 	}
 	
 	public String getNombre() {

            return this.nombre;
 	}

	public String toString(){

            return "*** " + this.nombre + " ***\n" +
                   "\nX origen: " + this.x +
                   "\nY origen: " + this.y +
                   "\nTotal lados: " + this.totalLados;
	}
 	
 	protected abstract String dibuja(); 	
 }