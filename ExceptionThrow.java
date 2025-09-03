public class ExceptionThrow {
//throw keyword
//to throw an exception explicitly
//specify the exception object which is to be thrown
//throw new exception_class("Eroor message")
public static void main(String[] args) {
    int age=15;
    if(age<18){
        throw new ArithmeticException("Not eligible to vote");
    }
    System.out.println("You can vote");
}
}
