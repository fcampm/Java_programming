
package actividad7;
import java.util.Arrays;
 
public class Main {
    public static void main(String[] args) {
         
        System.out.println("Testing array reversing");
        int[] inputArray = {1, 2, 3, 4, 5};
         
        Stack<Integer> voltearArreglo = new ListStack<Integer>();
        for(int i = 0; i < inputArray.length; i++){
            voltearArreglo.push(inputArray[i]);
        }        
        int[] outputArray = new int[inputArray.length];
        for(int j = 0; j < outputArray.length; j++){
            outputArray[j] = voltearArreglo.pop();
        }
         
        System.out.println("Input: " + Arrays.toString(inputArray));
        System.out.println("Output: " + Arrays.toString(outputArray));
        System.out.println();
         
        System.out.println("Testing train ordering");
        Stack<Integer> train = new ListStack<Integer>();
        train.push(3);
        train.push(2);
        train.push(1);
        train.push(3);
        train.push(2);
         
        System.out.println("Train as it arrived to the station: " + Arrays.toString(train.toArray()));
        Stack<Integer> e1 = new ListStack<Integer>();
        Stack<Integer> e2 = new ListStack<Integer>();
        Stack<Integer> e3 = new ListStack<Integer>();           
        int trainSize = train.size(), trainSize2 = 0;        
        while(trainSize-trainSize2 != 0){
            if(train.peek() == 1){
                e1.push(train.pop());
                trainSize2++;
            }
            if(train.peek() == 2){
                e2.push(train.pop());
                trainSize2++;
            }
            if(train.peek() == 3){
                e3.push(train.pop());
                trainSize2++;
            }
        }
        for(int i = 0; i <= e3.size(); i++){
            train.push(e3.pop());
        }
        for(int j = 0; j <= e2.size(); j++){
            train.push(e2.pop());
        }
        for(int k = 0; k <= e1.size(); k++){
            train.push(e1.pop());
        }
        
        System.out.println("Train ordered by priority: " + Arrays.toString(train.toArray()));
        System.out.println();
         
        Stack<Integer> towerOne = new ListStack<Integer>();
        Stack<Integer> towerTwo = new ListStack<Integer>();
        Stack<Integer> towerThree = new ListStack<Integer>();
         
        towerOne.push(3);
        towerOne.push(2);
        towerOne.push(1);
         
        System.out.println("At the beginning");
        System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
        System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
        System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
         
        towerTwo.push(towerOne.pop());
        towerThree.push(towerOne.pop());
        towerThree.push(towerTwo.pop());
        towerTwo.push(towerOne.pop());
        towerOne.push(towerThree.pop());
        towerTwo.push(towerThree.pop());
        towerTwo.push(towerOne.pop());
        
        System.out.println("At the end");
        System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
        System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
        System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
        System.out.println();
    }
}