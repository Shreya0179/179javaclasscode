class EmployPoly{
    String Emp_name;

    void details(){
        System.out.println("Name: "+Emp_name);
    }
    void details(int salary){
        System.out.println("Salary "+salary);
    }
    void details(String company){
    System.out.println("Institute name: "+company);
    }
    //public class PoluMorphism{ 
    public static void main(String[] args) {
       EmployPoly ep=new EmployPoly();
       ep.Emp_name="Arun";
       ep.details();
       ep.details(10000);
       ep.details("KIET");
    }
   // }
}


