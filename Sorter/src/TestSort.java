
/**
 *
 * @author fabiancm25
 */
public class TestSort {
    
    public static boolean isOrdered (int[] a, int n){
        if(a.length - 1 == n)
            return true;
        return a[n] <= a[n + 1] && isOrdered(a, n + 1);
    }
    
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 5, 9, 1, 9, 4};
        int[] arr2 = {1, 2, 3, 4, 5, 0};
        int[] arr3 = {1, 2, 4, 6, 7, 13};
        int[] arr4 = {8, 1, 0, 33, 12, 17, 89, 5, 42, 23};
        int[] arr5 = {56, 89, 7, 2, 0, 16, 1};
        
        System.out.println("\nProbando el metodo isOrdered");
        System.out.println(isOrdered(arr1, 0)); // false.
        System.out.println(isOrdered(arr2, 0)); // false.
        System.out.println(isOrdered(arr3, 0)); // true.
        System.out.println(isOrdered(arr4, 0)); // false.
        
        System.out.println("\nProbando el metodo selectionSort");
        Sorter.selectionSort(arr1);
        Sorter.selectionSort(arr2);
        System.out.println(isOrdered(arr1, 0)); // true.
        System.out.println(isOrdered(arr2, 0)); // true.
        
        System.out.println("\nProbando el metodo insertionSort");
        Sorter.insertionSort(arr3);
        Sorter.insertionSort(arr4);
        System.out.println(isOrdered(arr3, 0)); // true.
        System.out.println(isOrdered(arr4, 0)); // true.
        
        System.out.println("\nProbando el metodo bubbleSort");
        Sorter.bubbleSort(arr1);
        Sorter.bubbleSort(arr2);
        Sorter.bubbleSort(arr5);
        System.out.println(isOrdered(arr1, 0)); // true.
        System.out.println(isOrdered(arr2, 0)); // true.
        System.out.println(isOrdered(arr5, 0)); // true.
    }
}
