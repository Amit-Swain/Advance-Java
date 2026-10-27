import java.util.ArrayList;
// Wildcard Type in Generic
class Human{
    public void sleep(){
        System.out.println("Humans need to sleep well..");
    }
}
class Employee extends Human{
    public void sleep(){
        System.out.println("Employees need to sleep well ro stay proactive..");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        // example of runtime polymorphism
        // Human human = new Human();
        // Employee emp = new Employee();
        // human = emp;
        // human.sleep();
        // ================================================>

        ArrayList<Human> humanList = new ArrayList<Human>();
        ArrayList<Employee> empList = new ArrayList<Employee>();
        // humanList = empList;// in collection its not allowed

        // ================================================>
        ArrayList<Human> humanList2 = new ArrayList<>();
        humanList = humanList2; // valid since both collections are type Human
        // ==================================================>
        // wildcard type in generic
        ArrayList<?> unknownList = new ArrayList<>();
        unknownList = empList; //allowed
    }
}
