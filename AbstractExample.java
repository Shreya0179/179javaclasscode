abstract class College{
    abstract void Register();//should be in abstract class
    abstract void Infrastructure();//abstract  method
    abstract void Student();//abstract  method
    abstract void Staff();//abstract  method
    void medicalFacility(){//Concrete method
        System.out.println("Medical facilities are optional");
    }
}
    class KIIET extends College{
        void Register(){
            System.out.println("KIET is registered with AKTU");
        }
        void Infrastructure(){
            System.out.println("KIET has digital classrooms amd labs");
        }
        void Student(){
            System.out.println("Admissions through counselling");
        }
        void Staff(){
            System.out.println("KIET has well trained staff");
        }
        void medicalFacility(){
            System.out.println("KIET has its own hospital inside campus");
        }
    }

public class AbstractExample {
    public static void main(String[] args) {
        College clg;
        clg=new KIIET();
        clg.Register();
        clg.Infrastructure();
        clg.Student();
        clg.Staff();
        clg.medicalFacility();

    }
}
