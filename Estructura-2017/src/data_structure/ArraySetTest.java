
package data_structure;

/**
 *
 * @author root
 */
public class ArraySetTest {

    public static void main(String[] args) {
        
        ArraySet<Integer> set1 = new ArraySet<Integer>(5);
        System.out.println(set1.isEmpty()); // true.
        
        set1.add(1);
        set1.add(3);
        set1.add(9);
        set1.add(12);
        set1.add(9);
        
        System.out.println(set1.toString());
    }
}
