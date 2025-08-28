public class EmployeeAbstraction {
    //Abstraction in java means showing only essential features of an object hiding bg implementation details.
    //focuses on what object does, not how it does
    //Abstract classes to achieve 0-100% Abstraction. Cant be instantiated. Abstract Methods=without a body, NonAM=with a body
    //Intefaces to achieve 100% Abstraction before java 8, can have default & static methods after java 8. Abstraction with interface defines only method signatures, no method body(until java 8+ alows)

    //Rule 1: If you are extending any abstract class that have abstract method, we must either provide the implementation of the method or make this class abstract.
    //Rule 2: If there is any abstract method in a class, that clas must be abstract
}
abstract class Student{
    String name;
    int rollno;
    //Constructor
    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    //Abstract methods(must be implemented differently)
    abstract void attendClass();
    abstract void giveExam();

}
