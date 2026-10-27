import java.util.ArrayList;
import java.util.List;

class Human{
    public void sleep(){
        System.out.println("Humans need to sleep well..");
    }
}
class Employee extends Human{
    public void sleep(){
        System.out.println("Employees need to sleep well to stay proactive..");
    }
}
// Using upper bound in a method
// public class Demo6 {
//     public static void invokeSleep(List<? extends Human> list){
//         for(Human human : list){
//             human.sleep();
//         }
//     }
//     public static void main(String[] args) {
//         Human human1 = new Human();
//         Employee emmp1 = new Employee();

//         ArrayList<Human> humanList = new ArrayList<>();
//         ArrayList<Employee> empList = new ArrayList<>();

//         humanList.add(human1);
//         empList.add(emmp1);

//         invokeSleep(empList); // Allowed as Employee extends Human
//         invokeSleep(humanList); // also allowed
//     }
// }
// Using lower bound in a method
public class Demo6 {
    public static void invokeSleep(List<? super Human> list){
        for(Object obj : list){
            // can not assume is obj a Human, so casting would be needed to call human specific methods
        }
    }
    public static void main(String[] args) {

        ArrayList<Object> objList = new ArrayList<>();
        objList.add(new Object());
        invokeSleep(objList); // allowed as Object is a super class of Human
        ArrayList<Employee> empList = new ArrayList<>();
        // invokeSleep(empList); // invalid as Employee is not a super class of Human
    }
}