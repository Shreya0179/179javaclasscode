    //Encapsulation
    //wrapping up of data under a single unit
    //mechanism that binds together code and the data it manipulates
    //protective shield that prevents 
    //can be achieved by declaring all variable in class as private and writing public methods in class to set and get variable values
    //more defined with setter and getter method
    //setter for setting the values 
    //getter for getting the values

import java.util.Scanner;
class EmployyEncap{
    private int Acc_bal;//data hiding
    private int upi_pin=998877;
    public void setBalance(int balance) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Plz enter upi pin");
        int pin=sc.nextInt();
        if(pin == upi_pin){
            Acc_bal=balance;
            System.out.println("Congratulations salary is credited");
        }
        else{
            System.out.println("Salary not credited");
        }
    }
    public int getBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To know the bal enter upi pin");
        int pin=sc.nextInt();
        if(pin == upi_pin){
            System.out.println("Available bal is: "+ Acc_bal);
            return Acc_bal;
        }
        else{
            System.out.println("Wrong Pin! Unable to fetch details");
        }
        return -1;
    }
}
public class EncapsulationExample {
       public static void main(String[] args) {
        EmployyEncap ee=new EmployyEncap();
        ee.setBalance(9000);
        ee.getBalance();
    }
}
