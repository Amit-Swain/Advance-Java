// upper bound and lower bound

import java.util.ArrayList;

class Human{
    public void sleep(){
        System.out.println("Humans need to sleep well..");
    }
}
class Employee extends Human{
    public void sleep(){
        System.out.println("Employees need to sleep well..");
    }
}
// upper bound
// public class Demo5 {
//     public static void main(String[] args) {
//         Human human = new Human();
//         Employee emp = new Employee();

//         ArrayList<Human> humanList = new ArrayList<>();
//         ArrayList<Employee> empList = new ArrayList<>();

//         //upper bound wildcard
//         ArrayList<? extends Human> humanList2 = new ArrayList<>();

//         humanList2 = empList; // allowed as empList extends Human
//         humanList2 = humanList; // allowed as humanList is of type Human

//         ArrayList<String> stringList = new ArrayList<>();
//         // humanList2 = stringList; // not allowed as String and Human are not allowed
//     }
// }

// lower bound
public class Demo5{
    public static void main(String[] args) {
        Human human = new Human();
        Employee emp = new Employee();

        ArrayList<? super Human> humanList = new ArrayList<>();
        ArrayList<Employee> empList = new ArrayList<>();
        // humanList = empList; // not allowed as Employee is a subclass not a superclass of Human

        ArrayList<Object> objList = new ArrayList<>();
        humanList = objList; // Valid as Object is a superclass of Human

        ArrayList<String> stringList = new ArrayList<>();
        // humanList = stringList; // not allowed as String is not related to Human
    }
}
