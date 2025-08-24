public class EmployeeFinal {
    final String Org="Kiet";

    void details(){
        System.out.println(Org);
    }
    public static void main(String[] args) {
        EmployeeFinal ef=new EmployeeFinal();
        //ef.Emp_Id=101;
        //ef.Org="ABES";
        ef.details();
    }
}
    class Faculty extends EmployeeFinal{
        void details(){
            System.out.println("WElcome to overriding");
        }
        public static void main(String[] args) {
            Faculty f=new Faculty();
            f.details();   
        }
        
     }

    
