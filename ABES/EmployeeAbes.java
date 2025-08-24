package ABES;
import KIET.*;
public class EmployeeAbes extends Employeekiet {//Employeekiet is inherited to employeeAbes
    public static void main(String[] args) {
        
    // Employeekiet ek=new Employeekiet();
    //     ek.Emp_name="Aarna";
    //     ek.Salary=200000;
    //     ek.Emp_id=400179;
    //     ek.Organisation="ABC Groups";
       EmployeeAbes ae=new EmployeeAbes();
        ae.Emp_name="Aarna";
        ae.Salary=200000; //cant be accessed in other package as it is private
        ae.Emp_id=400179;
        ae.Organisation="ABC Groups"; //default also cant be accessed in other subclass of package
    }
}
