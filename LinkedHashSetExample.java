import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // LinkedHashSet<Integer> numbers = new LinkedHashSet<>();
        // numbers.add(1);
        // numbers.add(2);
        // numbers.add(10);
        // System.out.println("LinkedHashSet is: "+numbers);

        HashSet<Integer> hs=new HashSet<>();
        hs.add(21);
        hs.add(12);
        hs.add(111);
        System.out.println("HashSet is: "+hs); //Random Order

        LinkedHashSet<Integer> number1=new LinkedHashSet<>();
        number1.add(21);
        number1.add(12);
        number1.add(111);
        System.out.println("LinkedHashSet is: "+number1); //Insertion Order

        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(21);
        ts.add(12);
        ts.add(111);
        System.out.println("TreeSet is: "+ts); //RedBlack Tree //Sorted
    }
}
//LinkedHashSet: 
//Follows insertion Order
//No Duplicate Elements
//Allows One Null Element

//Tree Set:
//Sorted

//HashSet:
//Random order