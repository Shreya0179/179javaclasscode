public class EmployeeStatic {
    int Emp_Id;
    static String Org;
    static{
        EmployeeStatic.Org="Shreya";
    }
    static void StaticMethod(){
        System.out.println("This is a staic method");
    }
    void details(){
        System.out.println("Id "+Emp_Id+" name "+ Org);
    }
    public static void main(String[] args) {
        // EmployeeStatic.Org="Kiet";
        // EmployeeStatic es=new EmployeeStatic();
        // es.Emp_Id=101;
        // es.details();
            EmployeeStatic es=new EmployeeStatic();
            es.Emp_Id=123;
            es.details();
            EmployeeStatic es2=new EmployeeStatic();
            es2.Emp_Id=456;
            es2.details();
            StaticMethod();

    }
}
