
package data_structure;

/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017.
 */

public class ArrayBagTest {

    public static void main(String[] args) {
        ArrayBag bag = new ArrayBag(5);
        
        System.out.println(bag.isEmpty()); //true.
        bag.add(3);
        bag.add(6);
        bag.add(9);
        System.out.println(bag.isEmpty()); //false.
        System.out.println(bag.isFull()); //false.
        System.out.println(bag.getCurrentSize()); //3
        bag.add(16);
        bag.add(93);
        System.out.println(bag.isFull()); //true.
        System.out.println(bag.add(88)); // false.
        
        System.out.println(bag.remove()); // 93 
        System.out.println(bag.remove()); // 16
        
        System.out.println(bag.remove(6)); //true.
        System.out.println(bag.remove(88)); //false.
        
        System.out.println(bag.contains(6)); //false.
        System.out.println(bag.contains(9)); //true.
        
        bag.clear();
        System.out.println(bag.isEmpty()); //true.
    }
}
