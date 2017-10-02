
package stack;

/**
 *
 * @author fabiancm25
 */
public class ListStack<E> implements Stack<E> {

    private SLinkedList<E> lst;
    
    public ListStack(){
        lst = new SLinkedList<E>();
    }
    @Override
    public void push(E e) {
        lst.addFirst(e);       
    }

    @Override
    public E pop() {
        return lst.removeFirst();
    }

    @Override
    public E peek() {
        return lst.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }

    @Override
    public void clear() {
        lst.clear();
    }
    
}
