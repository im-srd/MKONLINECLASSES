//import java.util.*;
////Add your code for Class Student here
//class Student{
//    String name; // name of student
//    double[] marks; // marks of student
//    Student(String name, double marks[]){ // initialisation
//        this.name = name;
//        this.marks = marks;
//    }
//    String getName(){
//        return name;
//    }
//    double findTotal(){
//        double sum = 0;
//        for (int i=0; i< marks.length;i++){
//            sum=sum+marks[i];
//        }
//        return sum;
//    }
//
//}
//public class Test1{
//    // Define the method getMax() here
//    static String getMax(Student Student[]){
//        if (Student[0].findTotal() > Student[1].findTotal() && Student[0].findTotal() > Student[2].findTotal() ){
//            return Student[0].getName();
//        }
//        else if (Student[1].findTotal() > Student[0].findTotal() && Student[1].findTotal() > Student[2].findTotal() ){
//            return Student[1].getName();
//        }
//        else if (Student[2].findTotal() > Student[0].findTotal() && Student[2].findTotal() > Student[1].findTotal() ){
//            return Student[2].getName();
//        }
//        else {
//            return "";
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student[] arr = new Student[3];
//        for(int i = 0; i < 3; i++){
//            String name = sc.next();
//            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
//            arr[i] = new Student(name, m);
//        }
//        System.out.println(getMax(arr));
//    }
//}
// Q2
//import java.util.Scanner;
//
//class Employee {
//    String name;
//    String[] projects;
//
//    public Employee(String name, String projects[]) {
//        this.name = name;
//        this.projects = new String[projects.length];
//        for (int i = 0; i < projects.length; i++) {
//            this.projects[i] = projects[i];
//        }
//    }
//
//    public Employee(Employee e) {
//        this.name = e.name;
//        this.projects = new String[e.projects.length];
//        for (int i = 0; i < e.projects.length; i++) {
//            this.projects[i] = e.projects[i];
//        }
//    }
//
//    public void setName(String n) {
//        name = n;
//    }
//
//    public void setProject(int index, String proj) {
//        projects[index] = proj;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getProject(int indx) {
//        return projects[indx];
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] proj = {"PJ1", "PJ2", "PJ3"};
//        Employee e1 = new Employee("Surya", proj);
//        Employee e2 = new Employee(e1);
//        e2.setName(sc.next());
//        e2.setProject(0, sc.next());
//        System.out.println(e1.getName() + ": " + e1.getProject(0));
//        System.out.println(e2.getName() + ": " + e2.getProject(0));
//    }
//}

// Q3

import java.util.Scanner;
class Faculty{
    private String name;
    private double salary;
    public Faculty(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double bonus(float percent){
        return (percent/100.0)*salary;
    }


// Define method getDetails()
    public String getDetails() {
        return name+", "+salary;
    }
// Override method getDetails(float percent)
    public float getDetails(float f){
//        bonus_hod =
//        return
//        return 0.5*f;
    }
}
class Hod extends Faculty{
    private String personalAssistant;
    public Hod(String name, double salary, String pa) {
        super(name, salary);
        this.personalAssistant = pa;
    }
// Override method bonus(float percent)
// Override method getDetails()
    public String getDetails(){
        return super.name+", "+super.salary+", "+this.personalAssistant;
    }
// Override method getDetails(float percent)

}
public class Test1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Faculty obj1 = new Faculty(sc.next(), sc.nextDouble());
        Faculty obj2 = new Hod(sc.next(), sc.nextDouble(), sc.next());
        System.out.println(obj1.getDetails());
        System.out.println(obj1.getDetails(10));
        System.out.println(obj2.getDetails());
        System.out.println(obj2.getDetails(10));
    }
}