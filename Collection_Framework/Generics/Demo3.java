
// Generic class
// Problem before generic class
// class Student{
//     String name;
//     public Student(String name){
//         this.name =name;
//     }
// }
// public class Demo3 {
//     public static void main(String[] args) {
//         Student st1 = new Student("Amit");
//         // Student st2 = new Student(10); // it will throw compile time error
//         ArrayList<Student> studentList = new ArrayList<>();
//         studentList.add(st1);
//     }
// }
// ==============================================>
class Student<T>{
    T obj; // Reference type for classes like Integer, Float, String etc
    public Student(T obj){
        this.obj = obj;
    }
    // Method to display the type of data used
    public void display(){
        System.out.println("The type of data used here is: "+ obj.getClass().getName());
    }
    // Method to get the value of the object
    public T getObj(){
        return obj;
    }
}
class Demo3{
    public static void main(String args[]){
        Student<Integer> st1 = new Student<>(10);
        st1.display();
        System.out.println(st1.getObj());

        Student<String> st2 = new Student<>("Amit");
        st2.display();
        System.out.println(st2.getObj());
    }
}
