package ejercicios_practicaprc6;

/*
 * Clase Cubo
 * Autor: Fabian Camp Mussa.
 */
 
public class Cubo extends Figura implements MedidasPlano, MedidasVolumen {
	
        // Variables de instancia.
	protected int longitudLado;
	
        // Constructor que crea un cubo; se le dan valores al constructor padre para utilizarlos en la clase hija.
	public Cubo(int x, int y, int longitudLado){

            super (6, "Cubo", x, y);
            
            // Se hace la validacion de que la variable longitudLado sea mayor o igual a 0 en caso contrario se asigna 0.
            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
            else{
                this.longitudLado = 0;
            }
	}

        // Metodo que calcula y regresa el area de un cubo.
	public double area(){

            return 6 * (Math.pow(longitudLado, 2));
	}	
	
        // Metodo que calcula y regresa el perimetro de un cubo.
	public double perimetro(){

            return longitudLado * 12;
	}
	
        // Metodo que calcula y regresa el volumen de un cubo.
	public double volumen() {

            return Math.pow(longitudLado, 3);
	}
	
        // Metodo toString que regresa la salida esperada siguiendo el diagrama UML proporcionado.
        @Override
	public String toString(){

            return super.toString() +
                   "\nLongitud de lado: " + this.longitudLado +
                   "\nArea: " + this.area() +
                   "\nPerimetro: " + this.perimetro() +
                   "\nVolumen: " + this.volumen() +                   
                   dibuja();
	}

        // Metodo que regresa el dibujo del cubo donde se imprime una sola cara y se especifica cuantas caras tiene.
        @Override
	protected String dibuja() {
            String res = "";
            res += "\nSeis caras de tamanio " + this.longitudLado + "\n";
            for (int i = 0; i < this.longitudLado; i++){
                for (int j = 0; j < this.longitudLado; j++){
                    res += "+";
                }
                res += "\n";
            }                
            return res;
	}
	
        // Metodo que regresa el dato que contiene la variable de instancia longitudLado.
	public int getLongitudLado() {

            return this.longitudLado;
	}

        // Metodo que actualiza el dato de la variable de instancia longitudLado que solo se asignara si ese nuevo dato es mayor o igual a 0.
	public void setLongitudLado(int longitudLado) {

            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
	}
	
}
