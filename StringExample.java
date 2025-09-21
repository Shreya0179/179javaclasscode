import java.lang.classfile.instruction.StoreInstruction;

public class StringExample {
    public static void main(String[] args) {
        String name="Shreya";
        int len=name.length();
        System.out.println(len);
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(1,4));
        String s="Shreya";
        String N="SHREYA";
        if(name.equals(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(name.equals(N)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
//to compare a==b
//s1 equals(s2)
//Case sensitive