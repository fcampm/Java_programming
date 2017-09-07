
package data_structure;

/**
 *
 * @author root
 */
public class ArraySetTest {

    public static void main(String[] args) {
        
        ArraySet<Integer> set1 = new ArraySet<Integer>(5);
        ArraySet<Integer> set2 = new ArraySet<Integer>(5);
        ArraySet<Integer> set3 = new ArraySet<Integer>(10);
        System.out.println(set1.isEmpty()); // true.
        
        set1.add(1);
        set1.add(3);
        set1.add(9);
        set1.add(12);
        set1.add(9);
        set2.add(23);
        set2.add(18);
        set2.add(2);
        set2.add(14);
        set2.add(9);
        
        System.out.println(set1.toString());
        System.out.println(set2.toString());
        
        
        System.out.println(set3.union(set1, set2).toString());
    }
}
