import java.util.LinkedList;
public class LinkedListExample {
    public static void main(String[] args) {
        ///Create LinkedList of Employees
        LinkedList<String> employees = new LinkedList<>();
        //Add Methods
        employees.add("John");               //add at end
        employees.add(1,"Raj");  //add at index
        employees.addFirst("Sophia");        //add at beginning
        employees.addLast("Arjun");          //add at end

        System.out.println("Employees after adding: "+ employees);
        //Access Methods
        System.out.println("Get First: " + employees.getFirst());
        System.out.println("Get Last: "+ employees.getLast());
        System.out.println("Get Index 2: "+ employees.get(2));
        //System.out.println("Get at position 4: "+ employees.get(4));//Error

        // Set method
        employees.set(2,"Priya");
        System.out.println("After set(2, 'Priya'): "+ employees);

        //Remove Methods
        employees.remove(); //remove first
        employees.remove("Raj");//remove by object
        employees.remove(1);//remove at index
        employees.removeFirst();//remove first element
        employees.removeLast();//remove last element
        System.out.println("Employees after removals: " + employees);

        //Search methods
        employees.add("John");
        employees.add("Meena");
        employees.add("John");
        System.out.println(employees.contains("John"));
        System.out.println(employees.indexOf("John"));
        System.out.println(employees.lastIndexOf("John"));
    }
}
