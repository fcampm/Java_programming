
package actividad7;

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
    
    public E[] toArray(){
        @SuppressWarnings("unchecked")
        E[] e = (E[])new Object[size];
        SNode<E> n = top;
        int i = 0;
        while(n.next!=null){
            e[i++] = n.value;
            n = n.next;
        }
        return e;
    }
}
    