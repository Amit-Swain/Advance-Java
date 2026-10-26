import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Demo {
    public static void main(String args[]){
        // Map<String, Integer> students = new HashMap<String, Integer>();
        Map<String, Integer> students = new Hashtable<String, Integer>();
        students.put("Amit", 56);
        students.put("Udit", 23);
        students.put("Divya", 67);
        students.put("Prabhu", 92);
        students.put("Udit", 45);

        System.out.println(students.keySet());
        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name));
        }
    }
}
