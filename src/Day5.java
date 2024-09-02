public class Day5 {
    public static void main(String args[]){
//         Loops
//        for loop
    /*
        for (int i=0; i<10; i++)
    {
        System.out.println(i);
    }
    */


    /* WHILE LOOP
    int num = 10;
    while (num>10 && num<16)
    {
        System.out.println(num);
        num = num+1;
    }
    */

    /*
    int num = 10;
     /* DO WHILE LOOP
    do
    {
        System.out.println(num);
        num = num+1;
    }
    while(num>10 && num<16);
    */
//        How to declare an array
//        int arr1[] = {1,2,3,4,5,6,7};
//        int []arr2 = new int[5];
//        arr2[0] = 11; arr2[1] = 22; arr2[2] = 33; arr2[3] = 44; arr2[4] = 55;

//        Iterating through FOR LOOP
//        for (int i = 0; i<arr1.length; i++)
//        {
//            System.out.println(arr1[i]);
//        }
        /*
        Iterating through FOR EACH LOOP
        for (int i: arr2) {
            System.out.println(i);
        }
        */
//       int num = 5;
//        System.out.println(num); // --> 5
//        System.out.println(num--); // --> 5 --> 5-1=4
//        System.out.println(num);  // --> 4
//
//        int num2 = 5;
//        System.out.println(num2); // --> 5
//        System.out.println(++num2); // --> 5+1=6 --> 6
//        System.out.println(num2); // --> 6

        int num = 2; //--> 5
        System.out.println(num++ + ++num + num++ + num);
//        int m = 2;
//        while (m < 20) {
//            m = m++ * 2; // --> 2 --> 2* 2 = 4
//            if (m % 4 == 0) {
//                break;
//            }
//            System.out.print(m + " ");
//        }
        /* QUESTION 1
        int m = 2;
        while (m < 20) {
        m = m++ * 2;
        if (m % 4 == 0) {
            break;
            }
        System.out.print(m + " ");
        }
        */

        /* QUESTION 2
        int n = 3;
        while (n < 15) {
            n += ++n;
            if (n % 5 == 0) {
                break;
            }
            System.out.print(n + " ");
        }

        */

        /* QUESTION 3
        int x = 2;
        while (x < 10) {
            x = x * 2;
            if (x % 4 == 0) {
                continue;
            }
            System.out.print(x + " ");
        }

        */

        /* QUESTION 4
        int j = 10;
        while (j > 0) {
            j--;
            if (j % 2 == 0) {
                continue;
            }
            System.out.print(j + " ");
        }

        */

        /* QUESTION 5
        int i = 0;
        while (true) {
            if (++i > 5) {
                break;
            }
            System.out.print(i + " ");
        }

         */

        /* QUESTION 6

        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

         */


    }
}

/*
Array 1     Array 2
1           11
2           22
3           33
4           44
5           55
6
7
*/