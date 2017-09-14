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
public class LoopyList<E> extends SLinkedList{
    public boolean makeLoopy(int start, int end) {
        SNode<E> n1 = getNodeAt(start);
        SNode<E> n2 = getNodeAt(end);
        if (n1 != null && n2 != null) {
            n2.next = n1;
            return true;
        } else {
            return false;
        }
    }
}
