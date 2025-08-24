// import java.util.Scanner;

// public class employdetails {
//      public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//     System.out.print("Enter employee name: ");
//         String name = sc.nextLine();
//     System.out.print("Enter employee salary: ");
//         int salary = sc.nextInt();
//    System.out.println("Employee Name: " + name);
//    System.out.println("Employee Salary: " + salary);
//      }
// }
import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();

        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);

        sc.close(); // close scanner
    }
}
