package ejercicios_practicaprc2;

/*
* @author Fabian Camp Mussa
*
* Date: April 19, 2017.
*/

public class ArregloVentas {
	
	protected int [] ventas;
	
	public ArregloVentas() {
	
            this.ventas = new int[12];

	}
	
	
	public ArregloVentas(int[] arr) {
            
            this.ventas = new int[12];
            
            for (int i = 0; i < this.ventas.length; i++){
                
                this.ventas[i] = arr[i];
            }
	}
	
	
	public int getVenta(int pos) {
            
            if (pos >= 0 && pos <= this.ventas.length){
                
                return this.ventas[pos];
            }
            
            return -1;
	}
	
	
	public void setVenta(int pos, int dato) {
            
            if(pos >= 0 && pos <= this.ventas.length){
                
                this.ventas[pos] = dato;
            }
		
	}

	
        @Override
	public String toString() {
		
            return "\nEnero: " + this.ventas[0] +
                   "\nFebrero: " + this.ventas[1] +
                   "\nMarzo: " + this.ventas[2] +
                   "\nAbril: " + this.ventas[3] +
                   "\nMayo: " + this.ventas[4] +
                   "\nJunio: " + this.ventas[5] +
                   "\nJulio: " + this.ventas[6] + 
                   "\nAgosto: " + this.ventas[7] +
                   "\nSeptiembre: " + this.ventas[8] +
                   "\nOctubre: " + this.ventas[9] +
                   "\nNoviembre: " + this.ventas[10] +
                   "\nDiciembre: " + this.ventas[11];
	}
	

}