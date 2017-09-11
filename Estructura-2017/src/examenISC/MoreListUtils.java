// Nombre: Fabian Camp Mussa
// Matricula: A01378565
package examenISC;

 
public class MoreListUtils {
     
    public static <E> SimpleList<E> intersect(SimpleList<E> lst1, SimpleList<E> lst2){
        SimpleList<E> lstFN = new SimpleList<E>();
        for(int i  = 0; i < lst1.size(); i++){            
            if(lst2.contains(lst1.get(i))){
                lstFN.addFirst(lst1.get(i));
            }
        }
        
        return lstFN;
    }
     
    public static <E> SimpleList<E> difference(SimpleList<E> lst1, SimpleList<E> lst2){
        return null;
    }
     
    public static <E> SimpleList<E> sublist(SimpleList<E> lst, int start, int end){
        SimpleList<E> lstFN = new SimpleList<E>();
        if(end < lst.size()){
            for(int i = start; i <= end; i++){
                lstFN.addFirst(lst.get(i));
            }                
            return lstFN;
        } else{
            return null;
        }
    }
}