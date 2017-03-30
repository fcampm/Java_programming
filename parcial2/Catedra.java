package parcial2;

/*
 * Clase Catedra
 *
 * Autor: Fabian Camp Mussa.
 * Matricula: A01378565.
 */
 
public class Catedra extends Profesor {
    
    private int tot_alumnos;
    private int tot_clases;
    private Posgrado posgrado;
    private static final double ALUMNOS_PARA_BONO = 25.0;
    private static final double BONO_POSGRADO1 = 500.0;
    private static final double BONO_POSGRADO2 = 1000.0;
    private static final double BONO_POSGRADO3 = 1500.0;
    private static final double BONO_ALUMNO = 10.0;
    
    
    // IMPLEMENTAR
    public Catedra(String nombre, String apellido, double sueldo, String nomina, int tot_alumnos, int tot_clases, Posgrado posgrado){
        super (nombre, apellido, sueldo, nomina);
        if (tot_alumnos >= 0){
            this.tot_alumnos = tot_alumnos;
        }
        else{
            this.tot_alumnos = 0;
        }
        if (tot_clases >= 0){
            this.tot_clases = tot_clases;
        }
        else{
            this.tot_clases = 0;
        }
        this.posgrado = new Posgrado(posgrado);
        actualizaSueldo();
        revisaPosgrado();
        
        switch (revisaPosgrado()){
            case 1:
                this.sueldo = this.sueldo + BONO_POSGRADO1;
                break;
            case 2:
                this.sueldo = this.sueldo + BONO_POSGRADO2;
                break;
            case 3:
                this.sueldo = this.sueldo + BONO_POSGRADO3;
                break;
        }
    }
    


	// IMPLEMENTAR
    private void actualizaSueldo(){
        double total_alumnos;
        total_alumnos = (double)this.tot_alumnos/this.tot_clases;
        if (total_alumnos >= ALUMNOS_PARA_BONO ) {
            this.sueldo += this.tot_alumnos * BONO_ALUMNO; 
        }
    }
    
     
     
    // IMPLEMENTAR
    public void setTot_alumnos(int tot_alumnos) {
       if (tot_alumnos >= 0){
           this.tot_alumnos = tot_alumnos;
           this.actualizaSueldo();
       }
    }
    
    
    
    // IMPLEMENTAR 
    public void setTot_clases(int tot_clases) {
        if (tot_clases >= 0){
            this.tot_clases = tot_clases;
            this.actualizaSueldo();
        }
    }
    
    
    
    // IMPLEMENTAR
    private int revisaPosgrado(){
        String pos = posgrado.getPosgrado();
        switch (pos){
            case "doctorado en ingenieria":
            case "posdoctorado":
                return 3;
            case "doctorado en humanidades":
            case "maestria en ingenieria":
                return 2;
            case "maestria en humanidades":
                return 1;
            default:
                return 0;
        }
    }


 	
 	// IMPLEMENTAR
    @Override
    public String toString() {
        return "Catedra {" + super.toString() + "tot_alumnos= " + tot_alumnos + "tot_clases= " + tot_clases +", " + posgrado.toString() + "}";
    }

}

    