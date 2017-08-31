/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked_lists;

/**
 *
 * @author root
 * @param <E>
 */
public class SLinkedList<E> implements List<E>{
    
    private SNode<E> top;
    private int size;

    public SLinkedList(){
        this.top = new SNode<E>();
        this.size = 0;
    }
    
    @Override
    public void addFirst(E e) {
        
        SNode<E> newEntry = new SNode<E>(e);
        newEntry.next = this.top.next;
        this.top = newEntry;
        this.size ++;
    }

    @Override
    public void addLast(E e) {
        
        SNode<E> newEntry = new SNode<E>(e);
        SNode<E> i = top;
        while(i.next != null){
            i = i.next;
        }
        i.next = newEntry;
        this.size ++;
    }

    @Override
    public void add(int index, E element) {
        
        int i = 0;
        SNode<E> newEntry = new SNode<E>(element);
        
    }

    @Override
    public E removeFirst() {
        
        if (this.isEmpty()){
            return null;
        }
        else{
            E val = this.top.next.value;
            this.top.next = this.top.next.next;
            this.size --;
            return val;
        }        
    }

    @Override
    public E removeLast() {
       
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getLast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E e) {
        
        SNode<E> i = top.next;
        int index = 0;
        while (i != null){
            if(i.value.equals(e)){
                return index;
            }
            else{
                i = i.next;
                index++;
            }
        }
        return -1;
    }

    @Override
    public void clear() {
        
        this.top.next = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.top.next == null;
    }

    @Override
    public E[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        String st = "[";
        SNode<E> i = this.top.next;
        while(i != null){
            st += i.value;            
            i = i.next;
        }
        return st + "]";
    }
    
}
