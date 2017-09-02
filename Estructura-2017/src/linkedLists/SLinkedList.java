/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedLists;

/**
 *
 * @author fabiancm25
 */
public class SLinkedList<E> implements List<E> {
     
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
        this.top.next = newEntry;
        this.size++;
    }
 
    @Override
    public void addLast(E e) {
        SNode<E> newEntry = new SNode<E>(e);
        SNode<E> i = top;
        while(i.next != null){
            i = i.next;
        }
        i.next = newEntry;
        this.size++;
    }
 
    @Override
    public void add(int index, E element) {
        SNode<E> i = top;
        SNode<E> newEntry = new SNode<E>(element);
        for(int j = 1; j <= index; j++){
            i = i.next;           
        }
        newEntry.next = i.next;
        i.next = newEntry;        
        this.size++;
        
        
    }
 
    @Override
    public E removeFirst() {
        if(this.isEmpty()){
            return null;
        }else{
            E val = this.top.next.value;
            this.top.next = this.top.next.next;
            this.size--;
            return val;
        }
    }
 
    @Override
    public E removeLast() {
        SNode<E> j = top;
        for (int i = 1; i < this.size; i++){
            j = j.next;
        }
        E value = j.value;
        j.next = null;
        this.size--;
        return value;
    }
 
    @Override
    public E remove(int index) {
        SNode<E> i = top;
        for(int j = 1; j <= index; j++){
            i = i.next;
        }
        E value = i.value;
        i.next = i.next.next;
        this.size--;
        return value;
    }
 
    @Override
    public boolean remove(E e) {        
        SNode<E> i = top;           
        for(int j = 1; j < indexOf(e)+1; j++){
            i = i.next;
        }
        i.next = i.next.next;
        this.size--;
        return true;
    }
 
    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        return this.top.next.value;
    }
 
    @Override
    public E getLast() {
        SNode<E> i = top;
        for(int j = 0; j< this.size; j++){
            i = i.next;
        }
        return i.value;
    }
 
    @Override
    public E get(int index) {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public E set(int index, E element) {
        // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public boolean contains(E e) {
        // TODO Auto-generated method stub
        return false;
    }
 
    @Override
    public int indexOf(E e) {
        SNode<E> i = top.next;
        int index = 0;
        while(i != null){
            if(i.value.equals(e)){
                return index;
            }else{
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
        // TODO Auto-generated method stub
        return null;
    }
     
    @Override
    public String toString(){
        String st = new String("[");
        SNode<E> i = this.top.next;
        while(i != null){
            st += i.value + ", ";
            i = i.next;
        }
        return st+"]";
    }
}