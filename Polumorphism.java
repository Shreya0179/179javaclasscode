// public class Polumorphism {
    
// }
class EmployPoly{
    String Emp_name;

    void details(){
        System.out.println("Name: "+Emp_name);
    }
    void details(int salary,String company){
        System.out.println("Salary "+salary);
    }
    void details(String company,int salary){
    System.out.println("Institute name: "+company);
    }

    class Faculty extends EmployPoly{
    void details(){
        super.details();
        System.out.println("Welcome Faculties");
    }

    public class PoluMorphism{ 
    public static void main(String[] args) {
    //    EmployPoly ep=new EmployPoly();
    //    ep.Emp_name="Arun";
    //    ep.details();
    //    ep.details(10000);
    //    ep.details("KIET");
    Faculty f=new Faculty();
    f.Emp_name="Shreya";
    f.details();
    }
   }

    
}


