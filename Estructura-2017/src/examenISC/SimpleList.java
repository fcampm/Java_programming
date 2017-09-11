// Nombre: Fabian Camp Mussa
// Matricula: A01378565
 
package examenISC;
 
public class SimpleList<E> {
    private class Node<T> {
 
        public T value;
        public Node<T> next;
 
        public Node() {
            this.value = null;
            this.next = null;
        }
 
        public Node(T value) {
            this.value = value;
            this.next = null;
        }
    }
 
    private Node<E> top;
    private int size;
 
    public SimpleList() {
        this.top = new Node<E>();
        this.size = 0;
    }
 
    /**
     * Returns the Node at the specified index. Indexes start at 0, (the first
     * element of the list has index 0, and the last one has an index of size-1)
     * If index is negative, the top sentinel of the list is returned
     * 
     * @param index index of the Node to be returned
     * @return the Node at the specified index
     */
    private Node<E> getNodeAt(int index) {
        if (index >= this.size)
            return null;
        if (index < 0) {
            return top;
        }
        Node<E> i = top.next;
        for (int j = 0; j < index; j++) {
            i = i.next;
        }
        return i;
    }
 
    /**
     * Inserts the specified element at the beginning of this list.
     * @param e the element to add
     */
 
    public void addFirst(E e) {
        Node<E> newEntry = new Node<E>(e);
        newEntry.next = this.top.next;
        this.top.next = newEntry;
        this.size++;
    }
 
    /**
     * Appends the specified element to the end of this list.
     * @param e the element to add
     */
    public void addLast(E e) {
        Node<E> newEntry = new Node<E>(e);
        Node<E> i = this.getNodeAt(this.size - 1);
        i.next = newEntry;
        this.size++;
    }
 
    /**
     * Inserts the specified element at the specified position in this list
     * Shifts the element currently at that position (if any) and any subsequent elements to the right (adds one to their indices).
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * 
     */
    public void add(int index, E element) {
        if (index > this.size || index < 0)
            return;
        Node<E> newEntry = new Node<E>(element);
        Node<E> i = this.getNodeAt(index - 1);
        newEntry.next = i.next;
        i.next = newEntry;
        this.size++;
    }
 
    /**
     * Removes and returns the first element from this list.
     * @return the first element from this list
     * 
     */
    public E removeFirst() {
        if (this.isEmpty())
            return null;
        E val = this.top.next.value;
        this.top.next = this.top.next.next;
        this.size--;
        return val;
    }
 
    /**
     * Removes and returns the last element from this list.
     * @return the last element from this list
     * 
     */
    public E removeLast() {
        if (this.isEmpty())
            return null;
        Node<E> i = this.getNodeAt(this.size - 2);
        E val = i.next.value;
        i.next = null;
        this.size--;
        return val;
    }
 
    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * 
     */
    public E remove(int index) {
        if (index < 0 || index >= this.size || this.isEmpty())
            return null;
        Node<E> i = this.getNodeAt(index - 1);
        E val = i.next.value;
        i.next = i.next.next;
        this.size--;
        return val;
    }
 
    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * If this list does not contain the element, it is unchanged.
     * Returns true if this list contained the specified element (or equivalently, if this list changed as a result of the call).
     * @param e element to be removed from this list, if present
     * @return true if this list contained the specified element
     */
    public boolean remove(E e) {
        int index = this.indexOf(e);
        if (index >= 0) {
            remove(index);
            return true;
        } else {
            return false;
        }
    }
 
    /**
     * Returns the first element in this list.
     * @return the first element in this list.
     * 
     */
    public E getFirst() {
        return this.getNodeAt(0).value;
    }
 
    /**
     * Returns the last element in this list.
     * @return the last element in this list
     * 
     */
    public E getLast() {
        Node<E> i = this.getNodeAt(this.size - 1);
        return i.value;
    }
 
    /**
     * Returns the element at the specified position in this list.
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * 
     */
    public E get(int index) {
        if (index >= this.size) {
            return null;
        }
        Node<E> i = this.getNodeAt(index);
        return i.value;
    }
 
    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     */
    public E set(int index, E element) {
        if (index >= this.size)
            return null;
        Node<E> i = this.getNodeAt(index - 1);
        E val = i.next.value;
        Node<E> newNode = new Node<E>(element);
        newNode.next = i.next.next;
        i.next = newNode;
        return val;
    }
 
    /**
     * Returns true if this list contains the specified element.
     * @param e element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    public boolean contains(E e) {
        return this.indexOf(e) >= 0;
    }
 
    /**
     * Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. 
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
     */
    public int indexOf(E e) {
        Node<E> i = top.next;
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
 
    /**
     * Removes all of the elements from this list. The list will be empty after this call returns.
     */
    public void clear() {
        this.top.next = null;
        this.size = 0;
    }
 
    /**
     * Returns the number of elements in this list.
     * @return the number of elements in this list
     */
    public int size() {
        return this.size;
    }
 
    /**
     * Returns true if this collection contains no elements.
     * @return true if this collection contains no elements
     */
    public boolean isEmpty() {
        return this.top.next == null;
    }
 
    /**
     * Returns a string representation of this collection.
     * The string representation consists of a list of the collection's elements in order, enclosed in square brackets ("[]").
     * Adjacent elements are separated by the characters ", " (comma and space).
     * 
     */
    public String toString() {
        String st = new String("[");
        Node<E> i = this.top.next;
        while (i != null) {
            st += i.value;
            if (i.next != null) {
                st += ", ";
            }
            i = i.next;
        }
        return st + "]";
    }
 
     
/*
 * **********************************
 * Implementa los siguientes metodos
 * **********************************
 * 
 */
    public boolean splice(SimpleList<E> anotherList, int index) {
        for(int i = anotherList.size-1; i >=0; i--){
            E e = anotherList.get(i);                            
            add(index, e);
        }
        return true;
    }
 
    public void reverse() {                    
        for (int i = this.size-1 ; i >= 0; i--){
            E e = get(i);            
            addLast(e);
        }
        for(int j = 0; j < this.size; j++){
            E e = get(j);
            remove(e);
        }
    }
     
    public void rotate(int k){
        for(int i = 0; i < this.size; i++){
            E e = get(i);            
        }
    }
 
}
