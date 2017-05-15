package ejercicios_practicaprc6;

/*
 * Clase Cubo
 * Autor:
 * Matricula:
 */
 
public class Cubo extends Figura implements MedidasPlano, MedidasVolumen {
	
	protected int longitudLado;
	
	public Cubo(int x, int y, int longitudLado){

            super (6, "Cubo", x, y);
            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
            else{
                this.longitudLado = 0;
            }
	}

	public double area(){

            return 6 * (Math.pow(longitudLado, 2));
	}	
	
	public double perimetro(){

            return longitudLado * 12;
	}
	
	public double volumen() {

            return Math.pow(longitudLado, 3);
	}
	
        @Override
	public String toString(){

            return super.toString() +
                   "\nLongitud de lado: " + this.longitudLado +
                   "\nArea: " + this.area() +
                   "\nPerimetro: " + this.perimetro() +
                   "\nVolumen: " + this.volumen() +                   
                   dibuja();
	}

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
	
	public int getLongitudLado() {

            return this.longitudLado;
	}

	public void setLongitudLado(int longitudLado) {

            if (longitudLado >= 0){
                this.longitudLado = longitudLado;
            }
	}
	
}
