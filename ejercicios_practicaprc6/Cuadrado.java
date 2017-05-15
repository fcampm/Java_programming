package ejercicios_practicaprc6;

// Se importa la clase math que se encuentra en el paquete java.lang
import java.lang.Math;
/*
 * Clase Cuadrado
 * Autor: Fabian Camp Mussa.
 */
 
public class Cuadrado extends Figura implements MedidasPlano {
	
        // Variables de instancia
	protected int longitudLado;
	
        // Constructor que crea un objeto Cuadrado donde se dan valores al constructor padre y a su hijo.
	public Cuadrado(int x, int y, int longitudLado){
		
            super(4, "Cuadrado", x, y);
            
            // Se valida que la longitudLado que se manda sea mayor o igual a 0 en caso contrario asignar 0.
            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
            else{
                this.longitudLado = 0;
            }
	}
	
        // Metodo que calcula y regresa el area de un cuadrado utilizando la longitudLado y elevandola al cuadrado.
        @Override        
	public double area(){
	
            return Math.pow(longitudLado, 2);
	}	
		
        // Metodo que calcula y regresa el perimetro de un cuadrado utilizando la longitudLado y multiplicandola por 4.
        @Override
	public double perimetro(){
	
            return longitudLado * 4; 
	}
	
        // Metodo que imprime la salida que es esperada siguiendo las especificaciones del UML.
        @Override
	public String toString(){
            
            return super.toString() +
                   "\nLongitud de Lado: " + this.longitudLado +
                   "\nArea: " + this.area() +
                   "\nPerimetro: " + this.perimetro() + "\n" +
                   dibuja();
	}

        // Metodo que imprime la figura esperada del cuadrado que depende de la longitud de los lados.
        @Override
	protected String dibuja() {
            String res = "";
            for (int i = 0; i < this.longitudLado; i++){
                for (int j = 0; j < this.longitudLado; j++){
                    res += "+";
                }
                res += "\n";
            }
            return res;
	}

        // Metodo que regresa el valor que tiene la variable de instancia longitudLado.
	public int getLongitudLado() {

            return this.longitudLado;
	}

        // Metodo que actualiza el valor de longitudLado si y solo si ese dato es mayor o igual a 0.
	public void setLongitudLado(int longitudLado) {

            if (longitudLado >= 0){
                
                this.longitudLado = longitudLado;
            }
	}
}
