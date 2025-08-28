//fun inside interface are abstract by default
interface Institute{
    void Register();//no need to write abstract, abstract by default
    void Infrastructure();//abstract by default
    void Student();//abstract by default
    void Staff();//abstract by default
    // void medicalFacility(){//Concrete method
    //     System.out.println("Medical facilities are optional");
    // }
    //no concrete methods are allowed

    static void StaticConcrete(){//if do not write static it is not acceptable in new versions of java
        System.out.println("Static concrete method inside interface");
    }
    default void DefConcrete(){
        PriConcrete();//because it is private cant be called in other class or static thats why calling here in default
        System.out.println("Default concrete method inside interface");
    }
    private void PriConcrete(){
        System.out.println("Private method inside interface");
    }
}
    class ABESS implements Institute{// extends replaced by implements
        public void Register(){//all methods will be public at the timeof overriding
            System.out.println("ABES is registered with AKTU");
        }
        public void Infrastructure(){
            System.out.println("ABES has digital classrooms amd labs");
        }
        public void Student(){
            System.out.println("Admissions through counselling");
        }
        public void Staff(){
            System.out.println("ABES has well trained staff");
        }
    }
public class InterfaceExampple {
    public static void main(String[] args) {
        Institute It;
        It=new ABESS();
        It.Register();
        It.Infrastructure();
        It.Student();
        It.Staff();

        Institute.StaticConcrete();//will be directly called by object
        It.DefConcrete();//default concrete method

    }
}
//if a class implements multiple interfaces, or an interface extends multiple interface
//class to class: extends
//class to interface: implements
//interface to interface: extends
