public class EmployeeCopyConstructor {
    int Emp_id;
    String Emp_name;
//Class and constructor name should be same
    EmployeeCopyConstructor(int i,String name){
        Emp_id=i;
        Emp_name=name;
    }
    EmployeeCopyConstructor(EmployeeCopyConstructor s2){
        Emp_id=s2.Emp_id;
        Emp_name=s2.Emp_name;
    }
    void printInfo(){
        System.out.println("Details of Employee are:"+Emp_id+" "+Emp_name);
    }
    public static void main(String[] args) {
        EmployeeCopyConstructor ecc=new EmployeeCopyConstructor(179, "Shreya");
        ecc.printInfo();
        //by creating a contructor
        EmployeeCopyConstructor copy=new EmployeeCopyConstructor(ecc);
        copy.printInfo();
        copy.Emp_id=200;
        copy.Emp_name="Aarna";
        System.out.println("Details after change: ");
        copy.printInfo();
        ecc.printInfo();
        //This method(by assigning direct copy) does not retain previous details.
        // EmployeeCopyConstructor copy;
        // copy=ecc;
        // copy.printInfo();
        // copy.Emp_id=2;
        // copy.Emp_name="Aarna";
        // System.out.println("Details after changge by copy: ");
        // copy.printInfo();
        // ecc.printInfo();
    }
}
