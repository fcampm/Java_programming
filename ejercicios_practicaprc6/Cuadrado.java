package ejercicios_practicaprc6;
import java.lang.Math;
/*
 * Clase Cuadrado
 * Autor:
 * Matricula:
 */
 
public class Cuadrado extends Figura implements MedidasPlano {
	
	protected int longitudLado;
	
	public Cuadrado(int x, int y, int longitudLado){
		
            super(4, "Cuadrado", x, y);
            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
            else{
                this.longitudLado = 0;
            }
	}
	
	public double area(){
	
            return Math.pow(longitudLado, 2);
	}	
		
	public double perimetro(){
	
            return longitudLado * 4; 
	}
	
        @Override
	public String toString(){
            
            return super.toString() +
                   "\nLongitud de Lado: " + this.longitudLado +
                   "\nArea: " + this.area() +
                   "\nPerimetro: " + this.perimetro() + "\n" +
                   dibuja();
	}

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

	public int getLongitudLado() {

            return this.longitudLado;
	}

	public void setLongitudLado(int longitudLado) {

            if (longitudLado >= 0){
                
                this.longitudLado = longitudLado;
            }
	}
}
