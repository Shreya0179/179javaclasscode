package KIET;

public class HRDept {
    public static void main(String[] args) {
     Employeekiet ek=new Employeekiet();
     ek.Emp_name="shiv";
     ek.Emp_id=123;
     ek.Salary=2000;//coz private field ko access kr rhe h
     ek.Organisation="kiet grps";
     ek.employeeDetails();
    }
}
