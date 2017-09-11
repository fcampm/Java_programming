/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package double_linked_list;

/**
 *
 * @author fabiancm25
 */
public class DNode<E> {
    
    public E value;
    public DNode<E> next;
    public DNode<E> prev;
    
    public DNode(){
        value =  null;
        next = null;
        prev = null;       
    }
    
    public DNode(E value){
        this.value = value;
        next = null;
        prev = null;
    }
}
