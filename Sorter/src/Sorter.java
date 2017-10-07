
/**
 *
 * @author fabiancm25
 */
public class Sorter {    
    
    public static void selectionSort(int[] a){
        
        for (int i= 0; i < a.length - 1; i++){
            int min = i;
            for (int j = i+1; j < a.length; j++){
                if(a[j]< a[min]){
                    min = j;
                }
            }
            if (min != i){
                int temp = a[i];
                a[min] = a[i];
                a[i] = temp;
            }
        }           
    }

    public static void insertionSort(int[] a){
        
        for (int i = 1; i < a.length; i++){
            int element = a[i];
            int j = i;
            while(j > 0 && a[j-1] > element){
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = element;
        }
    }
    
    public static void bubbleSort(int[] a){
        
        for (int i = 1; i < a.length; i++){
            for(int j = 0; j < a.length - i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    int temp2 = a[j+1];
                    a[j] = temp2;                    
                    a[j+1] = temp;
                }
            }
        }
    }
}
