import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}
public class Demo2 {
    public static void main(String[] args) {
        List<Student> students =new ArrayList<Student>();
        students.add(new Student(33, "Amit"));
        students.add(new Student(12, "Divya"));
        students.add(new Student(45, "Prabhu"));
        students.add(new Student(35, "Rakesh"));

        Comparator<Student> com = (s1, s2) -> (s1.age > s2.age) ? 1 : -1;
        Collections.sort(students, com);
        for(Student s : students){
            System.out.println(s);
        }
    }
}
