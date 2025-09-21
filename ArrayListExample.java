import java.util.ArrayList;
import java.util.*;
//Arraylist are dynamic
//No need to initialize size
//can contain diff type of datatypes
public class ArrayListExample {
    public static void main(String[] args) {
        // ArrayList fruits = new ArrayList();
        // fruits.add("Apple");
        // fruits.add("Banana");
        // fruits.add("Grapes");
        // fruits.add(123);
        // System.out.println(fruits);
        ArrayList<String> fruits = new ArrayList<>();
        //Now only strings are allowed
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        //fruits.add(123);
        System.out.println(fruits);
        for(String s:fruits){
            System.out.println(s);
        }
        Iterator itr=fruits.iterator();
        while(itr.hasNext()){
                System.out.println(itr.next());
        }
        //To add element at particular index
        System.out.println("----Add----");
        fruits.add(1,"Guava");
        System.out.println(fruits);
        //To prin/get value at particular index
        System.out.println("----Get----");
        System.out.println(fruits.get(3));

        //To update the value
        System.out.println("----Update----");
        System.out.println(fruits.set(1,"ABC"));
        System.out.println(fruits);

        //To remove element at particular index
         System.out.println("----Remove element at particular index----");
        fruits.remove(2);
        System.out.println(fruits);
        //Size of list
         System.out.println("----Size----");
        int s=fruits.size();
        System.out.println(s);
        //Contains
         System.out.println("----Contains----");
        System.out.println(fruits.contains("Apple"));//boolean return
        System.out.println(fruits.contains("Papaya"));
        //Sorting
        System.out.println("----Sorting----");
        Collections.sort(fruits);
        System.out.println(fruits);

        System.out.println(Collections.binarySearch(fruits,"Apple"));

        fruits.clear();
        System.out.println(fruits);
    }
}
//remove(),size(),clear()
//hasNext()
//next()