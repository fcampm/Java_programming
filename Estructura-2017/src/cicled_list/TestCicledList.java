/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicled_list;

/**
 *
 * @author fabiancm25
 */
public class TestCicledList {
    
    public static void main(String[] args) {
        
        LoopyList<Integer> llst = new LoopyList<Integer>();
        llst.addFirst(1);
        llst.addFirst(2);
        llst.addFirst(3);
        llst.addFirst(4);
        llst.addFirst(5);
        llst.addFirst(6);
        System.out.println(llst.toString());
        System.out.println("Ciclo?: " + liebreTortuga(llst));
        
        llst.makeLoopy(2, 5);
        
        System.out.println("Ciclo?: " + liebreTortuga(llst));
        System.out.println(llst.toString());
    }
    
    public static <E> boolean liebreTortuga(LoopyList<E> lst){
        
        SNode<E> liebre = lst.top;
        SNode<E> tortuga = lst.top;
        do{
            if(liebre.next != null && liebre.next.next != null){
                liebre = liebre.next.next;
                tortuga = tortuga.next;
            }
            else {
                return false;
            }
        }
        while(liebre != tortuga);     
        liebre = lst.top;
        while(liebre.next != tortuga.next){
            liebre = liebre.next;
            tortuga = tortuga.next;
        }
        tortuga.next = null;
        return true;
    }
}
