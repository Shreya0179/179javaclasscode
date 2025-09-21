import java.util.Stack;
public class StackExample {
   public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();

    //push,pop,empty,peek,stack
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println("Element deleted: "+st.pop());
    System.out.println("Top element: "+st.peek());
    System.out.println(st);
    System.out.println("Size is: "+st.size());
    System.out.println("Is stack empty: "+st.empty());

    System.out.println("Index of 3: "+st.search(3));//returns index
    System.out.println("Index of 1: "+st.search(1));
    System.out.println("Index of 5: "+st.search(5));//returns -1 //element not in stack
    //System.out.println("Index of 8: "+st.search(8));//returns -1 //element not in stack
   } 
}
