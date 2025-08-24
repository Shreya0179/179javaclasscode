// public class methodcode {
//     int id;
//     String name;
//     methodcode(){
//         System.out.println("Hello from default constructer");
//         System.out.println("Details are: " +id+ " "+ name);
//     }
//     public void displayMethod(){
//         System.out.println("Hello from display method");
//         System.out.println("Details are: " +id+ " "+ name);
//     }
//     public static void main(String[] args) {
//         methodcode m1=new methodcode();
//         m1.id=101;
//         m1.name="Shreya";
//         //on commenting above 2 lines, output will be 0 and NULL
//         m1.displayMethod();
//     }
// }
public class methodcode {
    int id;
    String name;
    methodcode(int id,String name){
       this.id=id;
       this.name=name;
    }
    public void displayMethod(){
        System.out.println("Hello from display method");
        System.out.println("Details are: " +id+ " "+ name);
    }
    public static void main(String[] args) {
        methodcode m1=new methodcode(111,"Shreya");
        m1.displayMethod();
    }
}