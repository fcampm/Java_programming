package ejercicios_practicaprc4;

/* 
 * Clase PruebaMedicos
 * Autor: 
 * Matr�cula:
 */


public class PruebaMedicos {
	
    public static void main (String args[]) {
    
        Pediatra ped[] = new Pediatra[5];
        Neurologo neu[] = new Neurologo[3];
        Fecha fechas[] = {new Fecha(3, 8, 1989), new Fecha(6, 4, 1992), new Fecha(2, 3, 1978),
                          new Fecha(12, 11, 1990), new Fecha(1, 3, 1985), new Fecha(6, 10, 1977),
                          new Fecha(7, 9, 1987), new Fecha(8, 6, 1983)};
       
 
        String[] espe1 = {"alergologo", "otorrino"};
        String[] espe2 = {"Nutriologo", "Cirugia Pediatrica"};
        String[] espe3 = {"alergologo", "Dermatologo"};
        String[] espe4 = {"otorrino", "oftalmologo", "Infectologo"};
        String[] espe5 = {"Hematologo", "Nutriologo", "otorrino"};
                   
        
        ped[0] = new Pediatra("Arturo", "Rodriguez", fechas[0], "UNAM", "ABC123", 5, espe1);
        ped[1] = new Pediatra("Alejandro", "Lopez", fechas[1], "UAM", "FEU345", 7, espe2);
        ped[2] = new Pediatra("Angelica", "Gomez", fechas[2], "IPN", "ERY678", 6, espe3);
        ped[3] = new Pediatra("Carmen", "Gutierrez", fechas[3], "TEC", "KJU764", 5, espe4);
        ped[4] = new Pediatra("Elena", "Vallejo", fechas[4], "UNAM", "QUI433", 4, espe5);
        
        neu[0] = new Neurologo("Patricia", "Dominguez", fechas[5], "UAM", "QER347", 5, 2);
        neu[1] = new Neurologo("Susana", "Mejia", fechas[5], "UNAM", "KOI987", 3, 6);
        neu[2] = new Neurologo("Sergio", "Parrodi", fechas[7], "INP", "PWS428", 4, 3);
      
        
        System.out.println("\n\n***   PEDIATRAS   ***");
        for (int i = 0; i < ped.length; i++) {
            System.out.println("\nPediatra " + i + ":" + ped[i].toString());
        }
        
        System.out.println("\n\n***   NEUROLOGOS   ***");
        for (int i = 0; i < neu.length; i++) {
            System.out.println("\nNeurologo " + i + ":" + neu[i].toString());
        }
        
        System.out.println("\n\n***   PEDIATRAS ESPECIALISTAS EN NUTRIOLOGIA   ***");
        System.out.println(PruebaMedicos.especialidadesPediatra(ped, "Nutriologo"));
        System.out.println("\n\n***   PEDIATRAS ESPECIALISTAS EN OTORRINOLARINGOLOGIA   ***");
        System.out.println(PruebaMedicos.especialidadesPediatra(ped, "otorrino"));
        System.out.println("\n\n***   PEDIATRAS ESPECIALISTAS EN DERMATOLOGIA   ***");
        System.out.println(PruebaMedicos.especialidadesPediatra(ped, "Dermatologo"));
        System.out.println("\n\n***   NEUROLOGO CON MAYOR SUELDO   ***");
        System.out.println("\nEl neurologo que tiene el sueldo mayor es: " + PruebaMedicos.mayorSueldo(neu));
        
        
        System.out.println("\n\n");
    }
	
 
// Codificar: M�todo especialidadesPediatra    
    public static String especialidadesPediatra(Pediatra[] ped, String especialidad){
        String res = "";
        Pediatra p;
        
        for (int i = 0; i < ped.length; i ++){
            
            p = ped[i];
            for (int j = 0; j < p.getEspecialidad().length; j ++){
                
                if (especialidad.equalsIgnoreCase(p.getEspecialidad()[j])){
                    
                    res += p.nombre + " " + p.apellido + "\n";
                }
            }
        }
        return res;
        
    }

// Codificar: M�todo mayorSueldo        
    public static Neurologo mayorSueldo(Neurologo[] neu){
        double mayor = neu[0].sueldo;
        for (int i = 0; i < neu.length; i++){
            
            if (neu[i].sueldo > mayor){
                
                return neu[i];
            }
        }
        return null;
    }
}
    
