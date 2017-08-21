
package data_structure;

import java.util.Arrays;

/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017.
 */

public class ArrayBag implements GeneralBagInterface{
    
    // Instance Variables
    private Object[] bag;
    private int numberOfEntries;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 25;

    public ArrayBag(int capacity){
        
        this.capacity = capacity;
        this.numberOfEntries = 0;
        this.bag = new Object[capacity];                
    }
    
    public ArrayBag(){
        
        this.capacity = DEFAULT_CAPACITY;
    }
    
    @Override
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return this.numberOfEntries == this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.numberOfEntries == 0;
    }

    @Override
    public boolean add(Object newEntry) {
        if (this.isFull()){
            return false;
        }
        else{
            this.bag[numberOfEntries]= newEntry;
            numberOfEntries++;
            return true;
        }
    }

    @Override
    public Object remove() {
        Object temp = this.bag[numberOfEntries-1];
        this.bag[numberOfEntries-1] = null;
        numberOfEntries--;
        return temp;
    }

    @Override
    public boolean remove(Object anEntry) {
        int index = this.indexOf(anEntry);
        if(index >= 0){
            this.bag[index] = bag[numberOfEntries -1];
            bag[numberOfEntries-1] = null;
            numberOfEntries --;
            return true;                        
        }
        return false;
    }

    @Override
    public void clear() {
        this.bag = new Object[capacity];
        this.numberOfEntries = 0;
    }

    @Override
    public int getFrequencyOf(Object anEntry) {
        int count = 0;
        for(int i = 0; i < numberOfEntries; i++){
            if(anEntry.equals(bag[i])){
                count++;
            }        
        }
        return count;
    }

    private int indexOf(Object anEntry){
        for(int i = 0; i < numberOfEntries; i++){
            if(anEntry.equals(bag[i])){
                return i;
            }
        }
        // Object not found.
        return -1;
    }
    
    @Override
    public boolean contains(Object anEntry) {
        return this.indexOf(anEntry) >= 0;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(bag, numberOfEntries);
    }
    
}
