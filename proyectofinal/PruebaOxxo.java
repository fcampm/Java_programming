
package proyectofinal;

/**
 *
 * @author root
 */
public class PruebaOxxo {
    
    public static void main(String[] args) {
        
        Gerente g1 = new Gerente("Pedro", "Fernandez", 50868, "pfernandez@hotmail.com", "Gerente de sucursal Valle Dorado", 4500, 6);
        Gerente g2 = new Gerente("Alonso", "Mendiola", 60795, "amendiolamolecomiccon@gmail.com", "Gerente general del Estado de Mexico");
        
        System.out.println(g1 + "\n");
        System.out.println("***   Saldo de Pedro después de impuesto para la Afore   ***\n");
        g1.impuestos();
        System.out.println(" ");
        System.out.println(g1);
        System.out.println(" ");
        System.out.println(g2);
    }
}
