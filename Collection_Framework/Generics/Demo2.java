import java.util.ArrayList;

class Student{
    private int id;
    private String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    // Getters and other methods ..
}
class Employee{
    private int id;
    private String name;
    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    // Getters and other methods ..
}
public class Demo2 {
    public static void main(String args[]){
        // Syntax of generics
        Student st1 = new Student(2, "Amit");
        Student st2 = new Student(1, "Alok");

        Employee em1 = new Employee(1, "Udit");
        Employee em2 = new Employee(2, "Divya");

        ArrayList<Student> studentList = new ArrayList<>(); // this syntax(empty diamond bracket is accepted in left after java 7)
        studentList.add(st1);
        studentList.add(st2);
        // studentList.add(em1); // this will throw a compile time error

        // ================================================>
        ArrayList<Object> list2 = new ArrayList<>();
        list2.add(10);
        list2.add("Shami");
        list2.add(9822244444411111L);
        System.out.println(list2);
        for(Object obj : list2){
            System.out.println(obj);
        }
        // ===========================================>
        // Using a generic list for integers
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        // ===============================================>
        // ArrayList<int> list4 = new ArrayList<>(); // primitives type are not allowed
    }
}
