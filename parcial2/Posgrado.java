package parcial2;

/*
 * Clase Posgrado
 *
 * Autor: Fabian Camp Mussa
 * Matricula: A01378565.
 */
 
public class Posgrado {
    private String nombrePosgrado;
    private int anioObtencion;
    private int vigencia;
    private static final int ANIO_LIMITE = 1960;
    private static final int ANIO_ACTUAL = 2015;
    
    
    //IMPLEMENTAR
    public Posgrado(String posgrado, int anioObtencion, int vigencia){
        this.nombrePosgrado = posgrado;
        if (anioObtencion >= Posgrado.ANIO_LIMITE){
            this.anioObtencion = anioObtencion;
        }
        else {
            this.anioObtencion = Posgrado.ANIO_LIMITE;
        }
        if (vigencia > 0){
            this.vigencia = vigencia;
        }
        else {
            this.vigencia = 1;
        }
        
    }
    
    
    
    //IMPLEMENTAR
    public Posgrado(Posgrado posgrado){
       this.nombrePosgrado = posgrado.nombrePosgrado;
       this.anioObtencion = posgrado.anioObtencion;
       this.vigencia = posgrado.vigencia;
       
    }



 	//IMPLEMENTAR
	@Override
    public String toString() {
       String valido;
       if(this.vigencia + this.anioObtencion >= Posgrado.ANIO_ACTUAL){
           valido="Vigente";
       }
       else{
           valido="Expirado";
       }
       return "Posgrado { posgrado= " + nombrePosgrado + ", anioObtencion= " + this.anioObtencion + " vigencia= " + valido + "}";
    }
    
    
    
    
    public String getPosgrado() {
        return this.nombrePosgrado;
    }

    public int getAnioObtencion() {
        return this.anioObtencion;
    }

    public int getVigencia() {
        return this.vigencia;
    }

    public void setPosgrado(String posgrado) {
        this.nombrePosgrado = posgrado;
    }

    public void setAnioObtencion(int anioObtencion) {
        if (anioObtencion >= Posgrado.ANIO_LIMITE){
            this.anioObtencion = anioObtencion;
        }
    }

    public void setVigencia(int vigencia) {
        this.vigencia = vigencia;
    }
    
}

