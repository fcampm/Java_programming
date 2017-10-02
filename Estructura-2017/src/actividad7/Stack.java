
package actividad7;

/**
 *
 * @author fabiancm25
 */
public interface Stack<E> {
    
    public void push (E e);
    public E pop();
    public E peek();
    public boolean isEmpty();
    public void clear();
    public int size();
    public E[] toArray();
}
