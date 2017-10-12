
package busquedas;

/**
 *
 * @author fabiancm25
 */
public class Search {
    
    
    
    public static int linearSearch(int values[], int target){
        for(int i = 0; i < values.length - 1;i++){
            if(values[i] == target) return 1;
            if(values[i] > target) return -1;
        }
        return -1;
    }
   
    public static int binarySearch(int values[], int target){
        int min, max, mid;
        min = 0;
        max = values.length-1;
        while(min <= max){
            mid = (min + max)/2;
            if(target < values[mid]){
                max = mid-1;
            }
            else if(target > values[mid]){
                min = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
        
}
