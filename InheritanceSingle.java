class Employee{
int id;
String name;
String Org;
void details(){
    System.out.println(" "+ id+" "+name+" "+Org);
}
}
class Faculty extends Employee{
        String Dept;
        String Sub;
        void Facultydetails(){
            System.out.println("Department is: "+ Dept+" "+Sub);
        }
}
public class InheritanceSingle {
     public static void main(String[] args) {
        Faculty f1 = new Faculty();
        //Faculty f2 = new Faculty(102, "Maurya", "Mathematics");
        f1.id=101;
        f1.name="Shreya";
        f1.Org="Java";
        f1.Facultydetails();
        //f2.showFaculty();
}
}
// class Employee{
//     int Emp_id;
//     String Emp_name;
//     static String Organisation="KIET";
    
//     void details(){
//         System.out.println("  Emp ID: " +Emp_id +"\n"+"  Name: "+Emp_name+"\n"+"  Organisation: "+Organisation);
//     }
// }

// class Faculty extends Employee{
//     String Department;
//     String subject;
//     String Designation;
//     void facultyDetails(){
//         System.out.println("  Department: "+Department +"\n"+"  Subject: "+subject+"\n"+"  Designation:"+Designation);
//     }  
    
// }

// public class InheritanceSingle{
//     public static void main(String[] args) {
        
    
    
//     Faculty f=new Faculty();
//     f.Emp_id=101;
//     f.Emp_name="Deepak Kumar";
//     f.Department="AIML";
//     f.subject="Maths";
//     f.Designation="Assitant Professor";

//     System.out.println("Details of the Employee are");    
//     f.details();
//     f.facultyDetails();

//     }
//     
// }