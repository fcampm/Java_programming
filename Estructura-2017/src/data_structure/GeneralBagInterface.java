
package data_structure;

/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017.
 */

public interface GeneralBagInterface {
    
    /** Gets the current number of entries in this bag.
     * 
     * @return the integer number of entries currently in the bag.
     */
    public int getCurrentSize();
    
    /** Sees wether this bag is full.
     * 
     * @return true if the bag is full, or false if not.
     */
    public boolean isFull();
    
    /** Sees wether this bag is empty.
     * 
     * @return ture if the bag is empty, or false if not.
     */
    public boolean isEmpty();
    
    /** Adds a new entry.
     * 
     * @param newEntry the object to be added.
     * @return true if the addition is successful, or false if not.
     */
    public boolean add(Object newEntry);
    
    /** Removes one unespecified entry from the bag, if possible.
     * 
     * @return either the removed entry or null if the romoval was remove.
     */
    public Object remove();
    
    /** Removes one occurrence of a given entry, if possible.
     * 
     * @param anEntry the entry to be removed.
     * @return true if the removal was successful, or false if not.
     */
    public boolean remove(Object anEntry);
    
    /** Removes all entries.
     * 
     */
    public void clear();
    
    /** Counts the number of times a given entry appears.
     * 
     * @param anEntry the entry to be counted.
     * @return the number of times anEntry appears.
     */
    public int getFrequencyOf(Object anEntry);
    
    /** Tests whether this bag contains a given entry.
     * 
     * @param anEntry the entry to be located.
     * @return true if the bag contains anEntry, or false if not.
     */
    public boolean contains(Object anEntry);
    
    /** Creates an array of all entries in the bag.
     * 
     * @return a new array of all the entries.
     */
    public Object[] toArray();
}
