
package practicaprc1;
import java.util.LinkedList;
/**
 *
 * @author fabiancm25
 */
public class TestListUtils {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> test1= new LinkedList<Integer>();
        LinkedList<Integer> test2= new LinkedList<Integer>();
        LinkedList<Integer> test3= new LinkedList<Integer>();
        LinkedList<Integer> test4= new LinkedList<Integer>();
        LinkedList<Integer> test5= new LinkedList<Integer>();
        LinkedList<Integer> test6= new LinkedList<Integer>();
        for(int i = 0; i < 10; i++){
            test1.addLast(i);
        }
        for(int j = 0; j < 10; j+=2){
            test2.addLast(j);
        }
        test3.add(1);
        test3.add(3);
        test3.add(5);
        test3.add(7);
        test4.add(2);
        test4.add(4);
        test4.add(6);
        test4.add(8);
        test5.add(4);
        test5.add(7);
        test5.add(10);
        test6.add(1);
        test6.add(5);
        test6.add(25);
        
        System.out.println("Test 1 Linked List");
        System.out.println(test1.toString());
        System.out.println("\nTest 2 Linked List");
        System.out.println(test2.toString());        
        System.out.println("\nTest 3 Linked List");
        System.out.println(test3.toString());
        System.out.println("\nTest 4 Linked List");
        System.out.println(test4.toString());
        System.out.println("\nTest 5 Linked List");
        System.out.println(test5.toString());
        System.out.println("\nTest 6 Linked List");
        System.out.println(test6.toString());
        
        System.out.println("\nPriting test1 backwards");
        System.out.println(ListUtils.reverseList(test1));
        
        System.out.println("\nPrinting test1+test2");
        System.out.println(ListUtils.union(test1, test2));
        
        System.out.println("\nPrinting remove an element (4) from a LinkedList");
        System.out.println(ListUtils.removeNth(test2, 4));
        
        System.out.println("\nPrinting alternate lists test3 - test4");
        System.out.println(ListUtils.alternate(test3, test4));
        System.out.println(ListUtils.alternate(test1, test2));
        
        System.out.println("\nPrinting concatenate sorted Linked List test5 - test6");
        
    }
}
