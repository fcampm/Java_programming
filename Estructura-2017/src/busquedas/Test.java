
package busquedas;

/**
 *
 * @author fabiancm25
 */
public class Test {
    
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,6,7,8,9};
        int arr2[] = {34,53,21,57,53,35};
        int arr3[] = {3,54,23,45,676,3122,54};
        int arr4[] = {213,46,7543,345675,43};
        
        System.out.println(Search.linearSearch(arr1, 3));
        System.out.println(Search.binarySearch(arr4, 43));
    }
}
