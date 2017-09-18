/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
/**
 *
 * @author fabiancm25
 */
public class SNode<E> {
 
    public E value;
    public SNode<E> next;
     
    public SNode(){
        this.value = null;
        this.next = null;
    }
     
    public SNode(E value){
        this.value = value;
        this.next = null;
    }
     
}
