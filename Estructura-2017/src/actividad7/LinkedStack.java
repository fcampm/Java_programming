
package stack;

/**
 *
 * @author fabiancm25
 */
public class LinkedStack<E> implements Stack<E>{

    private SNode<E> top;
    private int size;
    
    public LinkedStack(){
        top = new SNode<E>();
        size = 0;
    }
    
    @Override  
    public void push(E e) {
        SNode<E> newNode = new SNode<E>(e);
        newNode.next = top.next;
        top.next = newNode;
        this.size++;
        
    }

       @Override
    public E pop() {
        if(isEmpty()){
            return null;
        }
        E val = top.next.value;
        top.next = top.next.next;
        size--;
        return val;
    }

    @Override
    public E peek() {
        if(isEmpty()){
            return null;
        }
        return top.next.value;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void clear() {
        top.next = null;
        this.size = 0;
    }
}
    