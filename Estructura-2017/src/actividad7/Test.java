/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad7;

/**
 *
 * @author fabiancm25
 */
public class Test {

    public static void main(String[] args) {
        
        System.out.println("Testing postfix evaluator");
        System.out.println(Algebra.evaluatePosFix("2 4 /")); // 0
        System.out.println(Algebra.evaluatePosFix("2 4 + 3 /")); // 2
        System.out.println(Algebra.evaluatePosFix("2 3 4 * 5 * -")); // -58
        System.out.println(Algebra.evaluatePosFix("2 3 4 + ^ 5 /")); // 1
        System.out.println(Algebra.evaluatePosFix("6 3 4 2 ^ * + 5 -")); //19
        
    }
}
