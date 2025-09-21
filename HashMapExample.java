import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> aiml = new HashMap<>();

        //Adding the values
        aiml.put(1,"Shreya");
        aiml.put(2,"Priya");
        aiml.put(6,"Urvi");
        aiml.put(7,"Tejaswani");
        aiml.put(13,"Aman");

        aiml.put(3,null);
        aiml.put(4,null);
        aiml.put(null,"Laxmi");

        //Print the values
        System.out.println(aiml);
        System.out.println("All keys: "+aiml.keySet());
        System.out.println("All values: "+aiml.values());
        System.out.println("Key-value pairs: "+aiml.entrySet());

        //getting the values of particular key
        System.out.println("Value of key: "+aiml.get(1));
        System.out.println("Value of key: "+aiml.get(3));
        System.out.println("Value of key: "+aiml.get(4));
        System.out.println("Value of key: "+aiml.getOrDefault(7,"Unknown"));
        System.out.println("Value of key: "+aiml.getOrDefault(3,"Unknown"));
        System.out.println("Value of key: "+aiml.getOrDefault(5,"Unknown"));

        System.out.println("Map elementts with for-each loop");

        System.out.println("\nTraversing Via Key");
        for(Integer k : aiml.keySet()){
            System.out.println(k + " " + aiml.get(k));
        }

        System.out.println("\nTravrsing Via Entry");
        for(Map.Entry<Integer, String> entry : aiml.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nTraversing via Iterator");
            Iterator<Map.Entry<Integer, String>> itr = aiml.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key: "+entry.getKey() + ", Value: " + entry.getValue());
        }

    }
}
