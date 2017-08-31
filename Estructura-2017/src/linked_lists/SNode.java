
package linked_lists;

/**
 *
 * @author root 
 * @param <E>
 */

// Simple link list "S"
public class SNode<E> {
    
    public E value;
    public SNode<E> next;
     
    public SNode(){
        this.value = null;
        this.next = null;
    }
     
    public SNode(E value){
        this.value = value;
        this.next = null;
    }
     
}
