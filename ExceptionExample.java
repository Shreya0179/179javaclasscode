//ExceptionHandling 
//to handle runntime errors to presrve regular flow of the application
//in java, it is an event that disrupts the normal flow of a programs execution.
//occurs when unexpected happens (i.e dividing by zero, accessing invalid array index, or trying to open a file that doesnt exist)

//Errors
//represents irrecoverable conditions such as Java Virtual Machine(JVM) running out of memory, memory leaks, stack overflow errors,library incompatibility, infinite recursion, etc.
//Invalid user input
//device failure
//loss of network connection
//Physical limitations
//code errors
//opening an unavailable file

//Exception Hierarchy->object->throwable(Super class)-> 
//1)exceptions->i)checked(compile time) and ii)unchecked(run time)
//2)errors->i)virtual machine error and ii)Assertion error
public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(100/2);
        System.out.println(5);
        try{ //try will throw error if found
            System.out.println(100/0);
            System.out.println("Inside try block");
            System.out.println(12);
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(9);
        System.out.println(11);
    }
}
//Exception object contains name, description, stack Trace
//try must be followed with catch or finally
//catch cant be used without try
