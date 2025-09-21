import java.util.Vector;
public class VectorExample {
    //vector is synchronised
    public static void main(String[] args) {
        Vector <String> vc = new Vector<>(4,1);//if not specify initial capacity it is 10 bydefault
        System.out.println(vc.capacity()); //default size 10
        vc.add("1");
        vc.add("2");
        vc.add("3");
        vc.add("4");
        vc.add("5");
        System.out.println(vc.capacity());//capacity get doubled in vectors if capacityincreament not mentioned//whereas in array list 50% increases
        //if dont want to increase the size into double specify the increament in line 5 i.e(4,1)
        //vc.add("5");
        System.out.println(vc.size());
        System.out.println("Vector is: "+vc);

        //Add all
        Vector <String> vc2 = new Vector<>();
        vc2.add("A");
        vc2.add("B");
        vc2.add("C");
        System.out.println("Second Vector is: "+vc2);

        vc.addAll(vc2);
        System.out.println(vc);

    // -----First Element
        System.out.println(vc.firstElement());

    //------Last Element
        System.out.println(vc.lastElement());

    //------Clear() Method
        vc.clear();
        System.out.println("Values of vc are: "+vc);

    //System.out.println("------------");
    }
}
//capacity: no of elements it can have
//size: no of elements present
//addElement() is the legacy method in Vectors