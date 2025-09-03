//1.Create custon exception class
class InvalidEmployeeId extends Exception{
    InvalidEmployeeId(String message){
        super(message);
    }
}
//2. Employee Class
class Emp_loyee {
    int empId;
    String name;
    Emp_loyee(int empId,String name) throws InvalidEmployeeId{
        if(empId <=0){
            throw new InvalidEmployeeId("Employee id must be positive");
        }            
        this.empId=empId;
        this.name=name;
        System.out.println("Employee created: " + empId + " - " + name);
    }
}
//3. Tester class
public class ExceptionUserDefined{
    public static void main(String[] args) {
        try{
            Emp_loyee e1 = new Emp_loyee(101,"Shreya");//valid
            Emp_loyee e2 = new Emp_loyee(0,"Maurya");//invalid + custom exception
        }
        catch(InvalidEmployeeId e){
            System.out.println("Custom Exception: " + e);
        }
    }
}
