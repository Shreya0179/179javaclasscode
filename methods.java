public class methods {
    int id;
    String name;
    public void display(){
        System.out.println("Details are " + id+" "+name);
        System.out.println("hello " + name + " your roll no. " + id );
    }
    public static void main(String[] args) {
        methods m1=new methods();
        m1.id=123;
        m1.name="Shreya";
        m1.display();
    }
}
