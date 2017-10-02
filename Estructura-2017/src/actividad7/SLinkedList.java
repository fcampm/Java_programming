
package stack;
import linkedLists.*;
import java.util.Arrays;
/**
 *
 * @author fabiancm25
 * @param <E>
 */
public class SLinkedList<E> implements List<E> {
     
    private SNode<E> top;
    private int size;
    private E[] array;
     
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
        for(int j = 0; j < index; j++){
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
        for(int j = 0; j < index; j++){
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
        for(int j = 0; j < indexOf(e); j++){
            i = i.next;
        }
        i.next = i.next.next;
        this.size--;
        return true;
    }
 
    @Override
    public E getFirst() {        
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
        SNode<E> i = top;
        for(int j = 0; j <=index; j++){
            i = i.next;
        }
        return i.value;
    }
 
    @Override
    public E set(int index, E element) {
        SNode<E> i = top;
        SNode<E> newEntry = new SNode<E>(element);
        for(int j = 0; j < index; j++){
            i = i.next;
        }
        newEntry.next = i.next.next;
        i.next = newEntry;
        
        return i.value;
    }
 
    @Override
    public boolean contains(E e) {        
        if(indexOf(e) != -1){
            return true;
        }
        else{
            return false;
        }
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
        array = (E[])new Object[this.size];
        SNode<E> i = top;
        for(int j = 0; j < this.size; j++){
            i = i.next;
            array[j]=i.value;
        }
        return Arrays.copyOf(array, size);
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