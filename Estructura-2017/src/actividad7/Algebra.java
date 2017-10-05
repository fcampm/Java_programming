
package actividad7;
import java.util.Stack;
/**
 *
 * @author fabiancm25
 */
public class Algebra {
    public static int evaluatePosFix(String expresion){
        Stack<Integer> valueStack = new Stack<Integer>();
        int i  = 0, result, operandTwo, operandOne;
        char nextCharacter;
        while (i < expresion.length()){
            nextCharacter = expresion.charAt(i);            
            switch(nextCharacter){
                case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9': case '0':
                    valueStack.push(Character.getNumericValue(nextCharacter));
                    break;
                case '+': case '-': case '/': case '*': case '^':
                    operandTwo = valueStack.pop();
                    operandOne = valueStack.pop();
                    
                    if(nextCharacter == '+'){
                        result = operandTwo + operandOne;
                        valueStack.push(result);
                    }
                    if(nextCharacter == '-'){
                        result = operandOne - operandTwo;
                        valueStack.push(result);
                    }
                    if(nextCharacter == '/'){
                        result = operandOne/operandTwo;
                        valueStack.push(result);
                    }
                    if(nextCharacter == '*'){
                        result = operandOne * operandTwo;
                        valueStack.push(result);
                    }
                    if(nextCharacter == '^'){
                        result = operandOne ^ operandTwo;
                        valueStack.push(result);                        
                    }                    
                    break;
                default:
                    break;
                }
            i++;
            }        
        return valueStack.peek();
    }
}
