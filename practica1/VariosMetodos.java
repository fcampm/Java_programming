
package practica1;
import java.util.Scanner;

/**
 *
 * @authors Fabián Camp Mussa A01378565.
 *          José Javier Rodríguez Mota A01372812.
 *          Lenin Silva Gutiérrez A01373214.
 * 
 * Objetivo:
 * °Programación de clase de prueba o aplicación.
 * °Implementación de varios métodos o funciones.
 * °Prueba de dichos métodos o funciones.
 * °Entrada de datos pot teclado.
 * °Declaración de variables.
 * °Documentación de tu programa en cada método.
 */
public class VariosMetodos {
    
    public static void main(String[] args){
        double celsius, resultado, sueldo, prestaciones, tope, peso;
        int opcion, a, b, c, tiempo;
        String actividad; 
        Scanner entrada = new Scanner(System.in);
        do {
        menu();
        System.out.print("Elige una opción: ");
        opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Teclea la Actividad que realizarás: ");
                    actividad = entrada.next();
                    System.out.print("Teclea el tiempo que realizarás: ");
                    tiempo = entrada.nextInt();
                    System.out.print("Teclea tu peso actual: ");
                    peso = entrada.nextDouble();
                    resultado = calorias (actividad, tiempo, peso);
                    System.out.println("Calorias consumidas realizando: " + actividad + " durante: " + tiempo + ", con un peso de: " + peso + " es de: " + resultado);
                    break;
                case 2:
                    System.out.print("Teclea los grados Celcius que quieras convertir: ");
                    celsius = entrada.nextInt();
                    resultado = temperatura(celsius);
                    System.out.println(celsius + "° Celsius" + " a Fahrenheit son: " + resultado + "° Fahrenheit");
                    break;
                case 3:
                    System.out.print("Ingrese valor de a: ");
                    a = entrada.nextInt();
                    while (a ==0){ // Este while es para evitar que surga una división entre 0
                        System.out.println("Valor que daría división entre cero, teclea a diferente de 0");
                        System.out.print("Ingrese valor de a: ");
                        a = entrada.nextInt();
                    }
                    System.out.print("Ingrese valor de b: ");
                    b = entrada.nextInt();
                    System.out.print("Ingrese valor de c: ");
                    c = entrada.nextInt();
                    cuadratica (a, b, c);
                    break;
                case 4:
                    System.out.print("Ingresa el valor de a: ");
                    a = entrada.nextInt();
                    System.out.print("Ingresa el valor de b: ");
                    b = entrada.nextInt();
                    resultado = progresion(a, b);
                    System.out.println("La suma desde "+ a + " hasta " + b + " es " + resultado);
                    break;
                case 5:
                    System.out.print("Ingrese sueldo: ");
                    sueldo = entrada.nextDouble();
                    System.out.print("Ingrese prestaciones: ");
                    prestaciones = entrada.nextDouble();
                    System.out.print("Ingrese tope: ");
                    tope = entrada.nextDouble();
                    resultado = sueldoFinal(sueldo, prestaciones, tope);
                    System.out.println("Su sueldo final es: " + resultado);
                    break;
                case 6:
                    System.out.println("Muchas gracias por usar esta aplicación, ¡Vuelva pronto!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while(opcion!=6);
    }
    
    public static void menu() {
        System.out.println("***************\n"
        +"      Menú     \n"
        +"***************\n"
        +"1. Calorias Quemadas\n"
        +"2. Centígrados a Fahrenheit\n"
        +"3. Ecuación de Segundo Grado\n"
        +"4. Progresión aritmética\n"
        +"5. Sueldo Final\n"
        +"6. Salir");
    }
    
    public static double temperatura (double celsius){
        return 1.8 *celsius + 32;
        
    }
    
    public static double progresion (int a, int b){
        return ((a + b) * b) / 2;
           
    }
    
    public static void cuadratica (int a, int b, int c){
        double x1, x2;
        x1 = ((b * -1.0) + Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a); 
        x2 = ((b * -1.0) - Math.sqrt(Math.pow(b,2)- 4 * a * c )) / (2 * a);
        System.out.println("El resultado de la cuadrática de a:" + a + ", b:" + b + ", c:" + c + " es: " + x1); 
        
    }
    
    public static double sueldoFinal(double sueldo, double prestaciones, double tope){
        double variable;
        if (tope <= sueldo + prestaciones){
            variable =(sueldo + prestaciones) * 0.65;
        }
        else {
            variable =(sueldo + prestaciones) * 0.80;
        }
        if (prestaciones <= (sueldo + prestaciones) / 2){
             variable = variable * 1.05;
        }
        return variable;
    }
    
    public static double calorias (String actividad, int tiempo, double peso){
        double total = 0;
        switch(actividad.toLowerCase()){
            case "correr": total += (0.0175 * 10 * tiempo * peso);
                break;
            case "basketball": total +=  (0.0175 * 8 * tiempo * peso);
                break;
            case "tenis": total +=  (0.0175 * 4 * tiempo * peso);
                break;
            case "cocinar": total += (0.0175 * 2 *tiempo * peso);           
                break;
            case "dormir": total += (0.0175 * 1 * tiempo * peso);
                break;
            case "leer": total += (0.0175 * 1 * tiempo * peso);
                break;
            case "bailar": total += (0.0175 * 3 * tiempo * peso);
                break;
            case "caminar": total += (0.0175 * 2 * tiempo * peso);
                break;
        }
        return total;
    }
    
}
