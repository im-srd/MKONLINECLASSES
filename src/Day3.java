import java.util.Scanner;
import java.util.*;

public class Day3 {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your age :");
//        int age = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Enter your first name :");
////        String name = sc.next();
////        System.out.println("Enter your first and last name :");
//        String name2;
//        name2 = sc.nextLine();
//        System.out.println("Name : "+name2+"\nAge : "+age);

        String str = "I love apples.";
        System.out.println(str.length());
        System.out.println("at 10th position "+str.charAt(0));
        String one = "ONE";
        String two = "TWO";
        String temp = one+two;
        System.out.println(temp);
        System.out.println(one.concat(two));
//        System.out.println("ONE".concat("THREE"));
        System.out.println("Is "+str+" ends with apples ?"+str.endsWith("."));

    }
}
