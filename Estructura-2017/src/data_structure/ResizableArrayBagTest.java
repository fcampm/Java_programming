/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structure;

/**
 *
 * @author Fabian Camp Mussa.
 * Topic: Data Structure.
 * Date: August 21, 2017. 
 */
public class ResizableArrayBagTest {
         
    public static void main(String[] args){
        ResizableArrayBag<Integer> bag = new ResizableArrayBag<Integer>(5);
     
        System.out.println(bag.isEmpty()); // true
        bag.add(3);
        bag.add(6);
        bag.add(9);
        System.out.println(bag.isEmpty()); // false
        System.out.println(bag.isFull()); // false
        System.out.println(bag.getCurrentSize()); // 3
        bag.add(16);
        Integer x = bag.remove();
        System.out.println(x); // 16
        System.out.println(bag.isFull()); // false
        System.out.println(bag.add(88)); // true
     
        System.out.println(bag.remove()); // 88
        System.out.println(bag.remove()); // 9
     
        System.out.println(bag.remove(6)); // true
        System.out.println(bag.remove(88)); // false
     
        System.out.println(bag.contains(6)); // false
        System.out.println(bag.contains(9)); // false
     
        bag.add(2);
        bag.add(90);
        bag.add(1230);
        
        System.out.println(bag.replace(1640));
        bag.clear();
     
        System.out.println(bag.isEmpty()); // true
    
        
        
    }
}

