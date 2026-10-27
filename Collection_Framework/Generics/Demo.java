import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        // Problem before generics in collection
        // ArrayList list = new ArrayList();
        // list.add("Amit");
        // list.add("Udit");
        // list.add("Divya");
        // list.add(20);

        // String n1 = (String)list.get(0);
        // String n2 = (String)list.get(3); // This line causes a runtime error
        // System.out.println(n1 + " : " + n2);

        //=====================================>
        //solved the previous problem and after generics
        ArrayList<String> list = new ArrayList<String>();
        list.add("Amit");
        list.add("Udit");
        list.add("Divya");
        // list.add(20);// this will throw a compile time error

        String n1 = list.get(0); // no need for explicit type casting
        String n2 = list.get(2); 
        System.out.println(n1 + " : " + n2);
    }
}
