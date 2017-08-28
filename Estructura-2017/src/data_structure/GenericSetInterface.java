
package data_structure;

/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017. 
 * @param <T> 
 */
public interface GenericSetInterface <T>{
    
    /** Gets the current number of entries in this bag.
     * 
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize();
     
    /** Sees whether this bag is full.
     * 
     * @return true if the bag is full, or false if not
     */
    public boolean isFull();
     
    /** Sees whether this bag is empty.
     * 
     * @return true if the bag is empty, or false if not
     */
    public boolean isEmpty();
     
    /** Adds a new entry
     * 
     * @param newEntry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(T newEntry);
     
    /** Removes one unspecified entry from the bag, if possible
     * 
     * @return either the removed entry or null if the removal was not successful
     */
    public T remove();
     
    /** Removes one occurrence of a given entry, if possible
     * 
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false if not
     */
    public  boolean remove(T anEntry);
     
    /** Removes all entries
     * 
     */
    public void clear();
     
    /** Counts the number of times a gven entry appears
     * 
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears
     */
    public int getFrequencyOf(T anEntry);
     
    /** Tests whether this bag contains a iven entry.
     * 
     * @param anEntry the entry to be located
     * @return true if the bag contains anEntry, or false if not
     */
    public boolean contains(T anEntry);
     
    /** Creates an array of all entries in the bag
     * 
     * @return a new array of all the entries
     */
    public T[] toArray();
 
}

