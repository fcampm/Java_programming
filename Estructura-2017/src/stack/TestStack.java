package stack;

/**
 *
 * @author Fabian Camp Mussa, Adrian Mendez Lopez
 * Matriculas: A01378565, A01379228
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new LinkedStack<Integer>();
        
        System.out.println(stk.isEmpty()); //true
        
        stk.push(1);
        stk.push(2);
        stk.push(3);
        
        System.out.println(stk.peek()); //3
        System.out.println(stk.pop()); //3
        System.out.println(stk.pop()); //2
        
        System.out.println(stk.isEmpty()); //false
        stk.clear();
        System.out.println(stk.isEmpty()); //true         
    } 
    public static boolean isBalanced(String expression){
        return false;
    }
}