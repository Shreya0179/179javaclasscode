package KIET;

public class Employeekiet {
    public String Emp_name; //public
    private int Salary; //private
    protected int Emp_id; //protected
    String Organisation; //default

    void employeeDetails(){
        System.out.println(("Details of Kiet Employees are:" + "\n"+Emp_id+" "+Emp_name + "\n"));
    }

    public static void main(String[] args) {
        Employeekiet ek= new Employeekiet();
        ek.Emp_name="Shreya";
        ek.Emp_id=179;
        ek.Salary=200000;
        ek.Organisation="KIET Groups";
        ek.employeeDetails();
    }
}
