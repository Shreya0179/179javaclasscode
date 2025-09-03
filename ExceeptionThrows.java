//import java.lang.classfile.instruction.StoreInstruction;
class example{
    int salary;
    example(int salary) throws IllegalArgumentException{
        if(salary<=0){
                throw new IllegalArgumentException("Salary must be greater than 0");//Actual throw
        }
        this.salary=salary;
        System.out.println(salary);
    }
}
public class ExceeptionThrows {
    public static void main(String[] args) {
        try{
            example e=new example(0);
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }

    } 
}
//java throws keyword is used to declare an exception
//Syntax for java throws
// return_type method_name() throws exception_class_name
//{
//method code
//}