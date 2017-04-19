package ejercicios_practicaprc2;

/*
* @author Fabian Camp Mussa
*
* Date: April 19, 2017.
*/

public class VentasEmpleado {
	
	private String nombre;
	private String apellido;
	private ArregloVentas ventasMensuales;
	
	public VentasEmpleado(String nombre, String apellido){
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.ventasMensuales = new ArregloVentas();
	}
	
	
	public VentasEmpleado(String nombre, String apellido, int [] arr){
            
            this.nombre = nombre;
            this.apellido = apellido;
            this.ventasMensuales = new ArregloVentas(arr);
	}
	
	
	public double promedio() {
            double res = 0.0;
            for (int i = 0; i < this.ventasMensuales.ventas.length; i++) {
                
                res += this.ventasMensuales.ventas[i];
            }
            return res/this.ventasMensuales.ventas.length;
	}
	
	public String mayorVenta(){
            double mayor = this.ventasMensuales.ventas[0];
            int pos = 0;
            
            for (int i = 0; i < this.ventasMensuales.ventas.length; i++) {
                
                if (this.ventasMensuales.ventas[i] > mayor){
                    
                    mayor = this.ventasMensuales.ventas[i];
                    pos = i;
                }    
            }
            
           return getMes(pos);
	}
	
	public String menorVenta(){
            double menor = this.ventasMensuales.ventas[0];
            int pos = 0;
            
            for (int i = 0; i < this.ventasMensuales.ventas.length; i++){
                
                if (this.ventasMensuales.ventas[i] < menor){
                    
                    menor = this.ventasMensuales.ventas[i];
                    pos = i;
                }
            }
            
            return getMes(pos);
	}
	
        @Override
	public String toString() {
            
            return "\nEnero: " + this.ventasMensuales.ventas[0] +
                   "\nFebrero: " + this.ventasMensuales.ventas[1] +
                   "\nMarzo: " + this.ventasMensuales.ventas[2] +
                   "\nAbril: " + this.ventasMensuales.ventas[3] +
                   "\nMayo: " + this.ventasMensuales.ventas[4] +
                   "\nJunio: " + this.ventasMensuales.ventas[5] +
                   "\nJulio: " + this.ventasMensuales.ventas[6] +
                   "\nAgosto: " + this.ventasMensuales.ventas[7] +
                   "\nSeptiembre: " + this.ventasMensuales.ventas[8] +
                   "\nOctubre: " + this.ventasMensuales.ventas[9] +
                   "\nNoviembre: " + this.ventasMensuales.ventas[10] +
                   "\nDiciembre: " + this.ventasMensuales.ventas[11];
	}
	
	
//  M�TODOS PROPORCIONADOS POR TU PROFESORA (3 EN TOTAL)
	private String getMes(int mes) {
		
		switch(mes) {
			case 0: return "Enero";
			case 1: return "Febrero";
			case 2: return "Marzo";
			case 3: return "Abril";
			case 4: return "Mayo";
			case 5: return "Junio";
			case 6: return "Julio";
			case 7: return "Agosto";
			case 8: return "Septiembre";
			case 9: return "Octubre";
			case 10: return "Noviembre";
			case 11: return "Diciembre";
			default: return "Mes invalido!!";
		}	
	}
	
	public void setVenta(int pos, int dato) {
	
		this.ventasMensuales.setVenta(pos, dato);
	}

	public int getVenta(int pos) {
	
		return ventasMensuales.getVenta(pos);	
	}
	
}