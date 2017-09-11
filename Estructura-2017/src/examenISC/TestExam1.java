package examenISC;
 
public class TestExam1 {
 
    public static void main(String[] args) {
        SimpleList<Integer> a = new SimpleList<Integer>();
        SimpleList<Integer> b = new SimpleList<Integer>();
        for(int i=0;i<5;i++){
            a.addLast(i);
        }
        for(int i=5;i<15;i++){
            b.addLast(i);
        }
         
        System.out.println("TESTING EXAM1");
        System.out.println("*************");
         
        System.out.println("Testing splice");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        a.splice(b, 5);
        System.out.println("After a.splice(b, 5): " + a);
        System.out.println();
         
        System.out.println("Testing reverse");
        System.out.println("a: " + a);
        a.reverse();
        System.out.println("After a.reverse(): " + a);
        System.out.println();
         
        System.out.println("Testing rotate");
        System.out.println("b:" + b);
        b.rotate(0);
        System.out.println("b rotated by 0: " + b);
        b.rotate(1);
        System.out.println("b rotated by 1: " + b);
        b.rotate(2);
        System.out.println("b rotated by 2: " + b);
        b.rotate(11);
        System.out.println("b rotated by 11: " + b);
        System.out.println();
 
    }
 
}