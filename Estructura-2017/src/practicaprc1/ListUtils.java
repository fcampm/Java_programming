
package practicaprc1;
import java.util.LinkedList;


/**
 *
 * @author fabiancm25
 */
public class ListUtils {
    
    public static <T> LinkedList<T> reverseList(LinkedList <T> lst){       
        LinkedList<T> lst2 = new LinkedList<T>();
        for(int i = lst.size()-1; i >= 0 ; i--){
            lst2.add(lst.get(i));
        }
        return lst2;
    }
    
    public static <T> LinkedList<T> union(LinkedList<T> lst1, LinkedList<T> lst2){
        LinkedList<T> lstFN = new LinkedList<T>();
        for(int i = 0; i < lst1.size(); i++){
            lstFN.add(lst1.get(i));
        }
        for(int j = 0; j < lst2.size(); j++){
            lstFN.add(lst2.get(j));
        }
        return lstFN;
    }
    
    public static <T> LinkedList<T> removeNth(LinkedList<T> lst, int n){
        int z = lst.indexOf(n);
        lst.remove(z);
        return lst;
    }
    
    public static <T> LinkedList<T> alternate(LinkedList<T> lst1, LinkedList<T> lst2){
        LinkedList<T> lstFN = new LinkedList<T>();
        
        for(int i = 0, j = 0; i < lst1.size(); i++, j++){                                
            lstFN.add(lst1.get(i));
            if(j < lst2.size()){
                lstFN.add(lst2.get(i));
            }                
        }        
        return lstFN;
   }
        
    
    
    public static <T> LinkedList<T> concatenateSorted(LinkedList <T> lst1, LinkedList <T> lst2){                
        LinkedList<T> lstFN = new LinkedList<T>();
        for(int i = 0; i < lst1.size(); i++){
            lstFN.add(lst1.get(i));
        }
        for(int j = 0; j < lst2.size(); j++){
            lstFN.add(lst2.get(j));
        }
        lstFN.sort(null);
        return lstFN;
    }
}
