/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

import java.util.Arrays;

/**
 *
 * @author root
 */
public class ArraySet<T> implements GenericSetInterface<T>{
    
    private T[] sets;
    private int numberOfEntries;
    private int capacity;
    private static final int DEFAULT_CAPACITY = 25;
     
    @SuppressWarnings("unchecked")
    public ArraySet(int capacity){
        this.capacity = capacity;
        numberOfEntries = 0;
        sets = (T[])new Object[capacity];
    }
     
    public ArraySet(){
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
        if(numberOfEntries == sets.length){
            sets = Arrays.copyOf(sets, sets.length*2);
            this.capacity = sets.length;
        }
        if(this.contains(newEntry) == false){
        sets[numberOfEntries] = newEntry;
        numberOfEntries++;
        return true;       
        }
        return false;
    }
 
    @Override
    public T remove() {
        T temp = sets[numberOfEntries-1];
        sets[numberOfEntries-1] = null;
        numberOfEntries--;
        return temp;
    }
 
    @Override
    public boolean remove(T anEntry) {
        int index = this.indexOf(anEntry);
        if(index >= 0){
            sets[index] = sets[numberOfEntries-1];
            sets[numberOfEntries-1] = null;
            numberOfEntries--;
            return true;
        }else{
            return false;
        }
    }
 
    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        sets = (T[])new Object[capacity];
        numberOfEntries = 0;
    }
 
    @Override
    public int getFrequencyOf(T anEntry) {
        int count = 0;
        for(int i = 0; i < numberOfEntries; i++){
            if(anEntry.equals(sets[i])){
                count++;
            }
        }
        return count;
    }
     
    private int indexOf(T anEntry){
        for(int i=0; i < numberOfEntries; i++){
            if(anEntry.equals(sets[i])){
                return i;
            }
        }
        return -1;
    }
 
    @Override
    public boolean contains(T anEntry) {
        return this.indexOf(anEntry) >= 0;
    }
    
    public void removeEvery(T anEntry){
        for (int i = 0; i < numberOfEntries; i++){
            int index = this.indexOf(anEntry);        
            if(index >= 0){            
                sets[index] = sets[numberOfEntries-1];
                sets[numberOfEntries-1] = null; 
                numberOfEntries--;
            }
        }
    }
    
    public T replace(T anEntry){
        
        T temp = sets[numberOfEntries-1];
        sets[numberOfEntries-1] = anEntry;        
        return temp;      
    }
 
    @Override
    public T[] toArray() {
        return Arrays.copyOf(sets, numberOfEntries);
    }

    @Override
    public String toString() {
        String elements="The content of the set is:\n";
        for (int i=0; i < numberOfEntries; i++){
            
            elements += sets[i].toString() + "\n";
        }                
        return elements;
    }
    
    public boolean equals(ArraySet <T> otherSets) {
        if (otherSets.numberOfEntries != this.numberOfEntries){
            return false;
        }
        for (int i = 0; i < this.numberOfEntries; i++){
            if(otherSets.getFrequencyOf(sets[i]) != this.getFrequencyOf(sets[i])){
                return false;
            }                       
        } 
        return true;
    }
    
    public ArraySet<T> union(ArraySet<T> otherSet){
        
        ArraySet unionSet = new ArraySet();
        
        for (int i = 0; i < unionSet.numberOfEntries; i++){
            
        }
    }
}
