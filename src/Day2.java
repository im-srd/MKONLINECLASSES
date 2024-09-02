import java.util.Scanner; // To take from our user
import java.util.*;
public class Day2 {
    public static void main(String args[]){
        // Data types : Primitive and Non-Primitive
        // Primitive : int, float, double, char and boolean
        // Non-Primitive : String, Arrays, Struct
/*        int age = 20;
        float pi = 3.14f;
        double pi2 = 3.14567434d;
        char a = 'a';
        boolean flag = true; // True and False

        String name  = "MAdhav";
        System.out.println("My name is "+name+" and my age is "+age);
        //Name : xxxxxxxx
        // Semester : xxxx

//        System.out.println(name); */
        Scanner sc = new Scanner(System.in);
        String myName;
        int myAge;
        System.out.println("Write your name : ");
//        myName = sc.next();
        myName = sc.nextLine();
        System.out.println("Write your age : ");
        myAge = sc.nextInt();
        System.out.print("Name --> "+myName);
        System.out.println("Age --> "+myAge);

    }
}
