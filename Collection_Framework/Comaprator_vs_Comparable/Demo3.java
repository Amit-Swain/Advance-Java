import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        return -1;
    }
}
public class Demo3 {
    public static void main(String args[]){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(34, "Amit"));
        students.add(new Student(33, "Divya"));
        students.add(new Student(31, "Prabhu"));
        students.add(new Student(32, "Udit"));

        Collections.sort(students);

        // System.out.println(students);
        for(Student s : students){
            System.out.println(s);
        }
    }
}
