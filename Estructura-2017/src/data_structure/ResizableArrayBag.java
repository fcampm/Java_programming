
package data_structure;
/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017. 
 */
import java.util.Arrays;
 
public class ResizableArrayBag<T> implements GenericBagInterface<T> {
 
    private T[] bag;
    private int numberOfEntries;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 25;
     
    @SuppressWarnings("unchecked")
    public ResizableArrayBag(int capacity){
        this.capacity = capacity;
        numberOfEntries = 0;
        bag = (T[])new Object[capacity];
    }
     
    public ResizableArrayBag(){
        this(DEFAULT_CAPACITY);
    }
     
    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }
 
    @Override
    public boolean isFull() {
        return false;
    }
 
    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }
 
    @Override
    public boolean add(T newEntry) {
        if(numberOfEntries == bag.length){
            bag = Arrays.copyOf(bag, bag.length*2);
            this.capacity = bag.length;
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;
    }
 
    @Override
    public T remove() {
        T temp = bag[numberOfEntries-1];
        bag[numberOfEntries-1] = null;
        numberOfEntries--;
        return temp;
    }
 
    @Override
    public boolean remove(T anEntry) {
        int index = this.indexOf(anEntry);
        if(index >= 0){
            bag[index] = bag[numberOfEntries-1];
            bag[numberOfEntries-1] = null;
            numberOfEntries--;
            return true;
        }else{
            return false;
        }
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        bag = (T[])new Object[capacity];
        numberOfEntries = 0;
    }
 
    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i = 0; i < numberOfEntries; i++){
            if(anEntry.equals(bag[i])){
                count++;
            }
        }
        return count;
    }
     
    private int indexOf(T anEntry){
        for(int i=0; i < numberOfEntries; i++){
            if(anEntry.equals(bag[i])){
                return i;
            }
        }
        return -1;
    }
 
    @Override
    public boolean contains(T anEntry) {
        return this.indexOf(anEntry) >= 0;
    }
    
    public T replace(T anEntry){
        
        T temp = bag[numberOfEntries-1];
        bag[numberOfEntries-1] = anEntry;        
        return temp;      
    }
 
    @Override
    public T[] toArray() {
        return Arrays.copyOf(bag, numberOfEntries);
    }

    @Override
    public String toString() {
        String elements="The content of the bag is:\n";
        for (int i=0; i < numberOfEntries; i++){
            
            elements += bag[i].toString() + "\n";
        }                
        return elements;
    }
 
    
}
