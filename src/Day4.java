import java.util.Scanner;
public class Day4 {
    public static void main(String args[]){
        // Take input from the user --> Check whether it is positive or negative
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = sc.nextInt();

        System.out.println("Enter b = ");
        int b = sc.nextInt();

        System.out.println("Enter c = ");
        int c = sc.nextInt();

        double d = b*b - (4*a*c);

        System.out.println("Discriminant = "+d);

        if (d>=0){
            double root1 = (-b + Math.sqrt(d))/(2*a);
            double root2 = (-b - Math.sqrt(d))/(2*a);
            System.out.println("Root 1 = "+root1);
            System.out.println("Root 2 = "+root2);
        }
        else {
            // Imaginary part
            d = -1*d;
            double root1RealPart = (-b)/2*a; // Real part
            double root1ImgPart = Math.sqrt(d) / (2*a); // Img part
            System.out.println("Root 1 = "+root1RealPart+"+"+root1ImgPart+"i");
            System.out.println("Root 2 = "+root1RealPart+"-"+root1ImgPart+"i");
//            System.out.println("Root 1 = " + String.format("%.2f", root1RealPart) + "+" + String.format("%.2f", root1ImgPart) + "i");
//            System.out.println("Root 2 = " + String.format("%.2f", root1RealPart) + "-" + String.format("%.2f", root1ImgPart) + "i");
        }
//
//        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter a = ");
//        int a = sc.nextInt();
//
//        System.out.println("Enter b = ");
//        int b = sc.nextInt();
//
//        System.out.println("Enter c = ");
//        int c = sc.nextInt();


//         if (a>b && a>c){System.out.println(a+" is greatest");}
//         if (b>a && b>c){System.out.println(b+" is greatest");}
//         if (c>a && c>b){System.out.println(c+" is greatest");}

//        if (a>b && a>c)
//            System.out.println(a+" is greater");
//        else if (b>c)
//            System.out.println(b+" is greater");
//        else
//            System.out.println(c+" is greater");


    }
}

/* ax2+bx+c = 0
   x = {-b(+-)underroot(b2 - 4ac) }/ 2a
* */