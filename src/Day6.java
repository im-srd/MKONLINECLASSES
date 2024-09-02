public class Day6 {
    /*
    * Methods : A block of code, which can be used again and again.
    *
    * */

    // Recursion : it's a function calling itself
    static void rec(int a){
        if (a>10){
            System.out.print(a);
        }
        else{
            System.out.print(a+"-->");
            rec(a+1);
        }
    }
    // Method Overloading
    static int add(int a, int b){
        return a+b;
    }

    static double add(double a, double b){
        return a+b;
    }
    static void add2numbers(){
        int a = 10;
        int b = 20;
        System.out.println("A+B="+(a+b));
    }

    public static void main(String args[]){
        // className objectName = new className();
        // Method 1
//        Day6 d = new Day6();
//        d.add2numbers();

        // Method 2 --> to make our method static(means that the particular method belong to that class)
        add2numbers();

        int a1 = add(52, 62);
        double d1 = add(52.52, 62.62);
        System.out.println("add with int return type = "+a1);
        System.out.println("add with double return type = "+d1);

        // recursion example
        rec(2);
    }

}
