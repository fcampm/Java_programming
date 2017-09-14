/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicled_list;

/**
 *
 * @author fabiancm25
 */
public class SLinkedList<E> implements List<E> {
    public SNode<E> top;
    private int size;
 
    public SLinkedList() {
        this.top = new SNode<E>();
        this.size = 0;
    }
     
    /**
     * Returns the SNode at the specified index. Indexes start at 0, (the first
     * element of the list has index 0, and the last one has an index of size-1)
     * If index is negative, the top sentinel of the list is returned (this
     * makes our life easier)
     * 
     * @param index
     *            index of the SNode to be returned
     * @return the SNode at the specified index
     */
    protected SNode<E> getNodeAt(int index) {
        if (index >= this.size)
            return null;
        if (index < 0) {
            return top; // This simplifies adding/removing elements, as asking for the node before the first index (0-1), will return the top
        }
        SNode<E> i = top.next;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        return i;
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
        SNode<E> i = this.getNodeAt(this.size - 1);
        i.next = newEntry;
        this.size++;
    }
 
    @Override
    public void add(int index, E element) {
        if (index > this.size || index < 0)           // checks if the index is valid, note when index = size, we'll add the element as the last entry
            return;
        SNode<E> newEntry = new SNode<E>(element);
        SNode<E> i = this.getNodeAt(index - 1);       // get the node before the position we want to insert the element
        newEntry.next = i.next;                     // newEntry points to the node after i
        i.next = newEntry;                          // i now points to the newEntry
        this.size++;
    }
 
    @Override
    public E removeFirst() {
        if (this.isEmpty())
            return null;
        E val = this.top.next.value;
        this.top.next = this.top.next.next;
        this.size--;
        return val;
    }
 
    @Override
    public E removeLast() {
        if (this.isEmpty())
            return null;
        SNode<E> i = this.getNodeAt(this.size - 2); // gets the penultimate node in the list
                                                    // if size is 1, getNodeAt(-1) returns the top of the list
        E val = i.next.value;
        i.next = null;
        this.size--;
        return val;
    }
 
    @Override
    public E remove(int index) {
        if (index < 0 || index >= this.size || this.isEmpty())
            return null;
        SNode<E> i = this.getNodeAt(index - 1); // get previous node to the one being removed
        E val = i.next.value;                   // store value of node being removed
        i.next = i.next.next;                   // previous node now points to node after the one being removed
        this.size--;
        return val;
    }
 
    @Override
    public boolean remove(E e) {
        int index = this.indexOf(e);
        if (index >= 0) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }
 
    @Override
    public E getFirst() {
        return this.getNodeAt(0).value;
    }
 
    @Override
    public E getLast() {
        SNode<E> i = this.getNodeAt(this.size - 1);
        return i.value;
    }
 
    @Override
    public E get(int index) {
        if (index >= this.size) {
            return null;
        }
        SNode<E> i = this.getNodeAt(index);
        return i.value;
    }
 
    @Override
    public E set(int index, E element) {
        if (index >= this.size)
            return null;
        SNode<E> i = this.getNodeAt(index - 1);       // get the previous node to the one we want to replace
        E val = i.next.value;                       // save the value of the node we're replacing
        SNode<E> newNode = new SNode<E>(element);   // create a new node
        newNode.next = i.next.next;                 // set the next of the new node to the one after the one we're replacing
        i.next = newNode;                           // set the next of the previous node to the new one
        return val;
    }
 
    @Override
    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }
 
    @Override
    public int indexOf(E e) {
        SNode<E> i = top.next;
        int index = 0;
        while (i != null) {
            if (i.value.equals(e)) {
                return index;
            } else {
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
        @SuppressWarnings("unchecked")
        E[] array = (E[]) new Object[this.size];
        SNode<E> i = top.next;
        int index = 0;
        while (i != null) {
            array[index] = i.value;
            i = i.next;
            index++;
        }
        return array;
    }
 
    public String toString() {
        String st = new String("[");
        SNode<E> i = this.top.next;
        while (i != null) {
            st += i.value;
            if (i.next != null) {
                st += ", ";
            }
            i = i.next;
        }
        return st + "]";
    }
}
