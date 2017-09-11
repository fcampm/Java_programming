package examenISC;
 
public class TestExam2 {
 
    public static void main(String[] args) {
        SimpleList<Integer> a = new SimpleList<Integer>();
        SimpleList<Integer> b = new SimpleList<Integer>();
        for(int i=0;i<10;i++){
            a.addLast(i);
            b.addFirst(i+5);
        }
         
        System.out.println("TESTING EXAM2");
        System.out.println("*************");
         
        System.out.println("Testing intersect");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("a intersection b: " + MoreListUtils.intersect(a, b));
        System.out.println();
         
        System.out.println("Testing difference");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("a - b: " + MoreListUtils.difference(a, b));
        System.out.println();
         
        System.out.println("Testing sublist");
        System.out.println("a:" + a);
        System.out.println("a sublist from 0 to 0: " + MoreListUtils.sublist(a, 0, 0));
        System.out.println("a sublist from 2 to 5: " + MoreListUtils.sublist(a, 2, 5));
        System.out.println("a sublist from 8 to 10: " + MoreListUtils.sublist(a, 8, 10));
        System.out.println();
         
    }
 
}