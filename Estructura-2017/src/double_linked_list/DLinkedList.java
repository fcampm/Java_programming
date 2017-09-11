/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package double_linked_list;

/**
 *
 * @author fabiancm25 
 */
public class DLinkedList<E> implements List<E> {

    private DNode<E> top;
    private DNode<E> bottom;
    private int size;
    
    public DLinkedList(){
        size = 0;
        top = new DNode();
        bottom = new DNode();
        top.next = bottom;
        bottom.prev = top;
    }
    
    @Override
    public void addFirst(E e) {
        DNode<E> nE = new DNode<E>(e);
        nE.next = top.next;
        top.next = nE;
        nE.prev = top;
        nE.next.prev = nE;
        size++;
    }

    @Override
    public void addLast(E e) {
        DNode<E> nE = new DNode<E>(e);
        nE.next = bottom;
        nE.prev = bottom.prev.prev;
        this.bottom.prev.next = nE;
        this.bottom.prev = nE;
        this.size ++;
    }

    @Override
    public void add(int index, E element) {
        DNode<E> nE = new DNode<E>(element);
        if(isEmpty()){
            this.top.next = nE;
            this.bottom.prev = nE;
            nE.prev = this.top;
            nE.next = this.bottom;
        }
        else{
            DNode<E> nodeAt = this.getNodeAt(index);
            
        }
    }

    @Override
    public E removeFirst() {
        if(isEmpty()){
            return null;
        }
        E value = top.next.value;
        DNode<E> e = top.next;
        top.next = e.next;
        e.next.prev = top;
        return value;
    }

    @Override
    public E removeLast() {
        if(isEmpty()){
            return null;
        }
        E value = bottom.prev.value;
        this.bottom.prev = bottom.prev.prev;
        this.bottom.prev.next = bottom;
        this.size --;
        return value;
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        return top.next.value;
    }

    @Override
    public E getLast() {
        return bottom.prev.value;
    }

    @Override
    public E get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    @Override
    public int indexOf(E e) {
        DNode<E> i = top.next;
        for (int j = 0; j < this.size; j++){
            if(i.value.equals(e)){
                return j;
            }
            i = i.next;
        }
        return -1;
    }

    @Override
    public void clear() {
        top.next = bottom;
        bottom.prev = top;
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public E[] toArray() {
        DNode<E> i = top.next;
        E[] arr = (E[]) new Object[this.size];
        for(int j = 0; j < size; j++){
            arr[j] = i.value;
        }
        return arr;
    }
    
    private DNode<E> getNodeAt(int index){
        if (index >= this.size){
            return bottom;
        }
        if (index < 0) {
            return top;
        }
        DNode<E> i = top.next;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        return i;
    }                
}
