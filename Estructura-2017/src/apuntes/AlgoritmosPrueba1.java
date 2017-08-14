
package apuntes;

/**
 *
 * @author Fabián Camp Mussa
 * Topic: Algoritmos
 */
public class AlgoritmosPrueba1 {
        
    public static void main(String[] args) {
        
        long n = 100;
        
        // Implementation algorithm A
        long sum = 0;
        for(long i=1; i <= n; i++){
            sum = sum+i;
        }
        System.out.println(sum);
        
        // Implementation algorithm B
        sum = 0;
        for(long i = 1; i <= n; i++){
            for(long j = 1; j <= i; j++){
                sum = sum+1;
            }            
        }
        System.out.println(sum);
        
        // Implementation algorithm C
        sum = n * (n+1)/2;
        System.out.println(sum);
    }
    
}
