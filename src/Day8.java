import java.util.Arrays;

public class Day8 {
    public static void main(String args[]){
        // How to declare an Array
        int num[] = {10, 20, 30, 40 ,50};
        int age[] = new int[5];
        age[0] = 21;
        age[1] = 22;
        age[2] = 23;
        age[3] = 24;
        age[4] = 25;

//        System.out.println(num);

        /*
        for (int elements : num){
            System.out.print(elements+", ");
        }

        int max = num[0];
        for (int n:num){
            if (n>max){
                max = n;
            }
        }
        System.out.println("The maximum value in num array is "+max);
*/
        /*
        l = [1,2,3,4,5]
        print(l)
        o/p : [1,2,3,4,5]
         [[1,2,3],[11,22,33],[111,222,333]] --> 2d arrays
         */

        // Arrays : Arrays is pre defined class in java which is used to access some function which are useful in array.
//        System.out.println(Arrays.toString(num));
//        int array2d[][] = {{1,2,3},{4,5,6},{7,8,9}};
//        System.out.println(Arrays.deepToString(array2d));
//
//        int num2[] = {7,3,8,33,77,4,-110};
//        System.out.println("Before Sorting : "+Arrays.toString(num2));
//        Arrays.sort(num2);
//        System.out.println("After Sorting : "+Arrays.toString(num2));
//        // num2 --> [-110, 3,4,7,8,33,77] --> Ascending order
//
//        int reverseNum2[] = new int[num2.length];
//        Arrays.fill(reverseNum2, 100);
//        // reverseNum2 --> [0,0,0,0,0,0,0]
////        int j=0;
//        for (int j=0,i=num2.length-1; i>=0; j++,i--){ // i --> 6-5-4-3-2-1-0
//            reverseNum2[j] = num2[i];           // j --> 0-1-2-3-4-5-6
//            // j++;
//
//        }
//        System.out.println(Arrays.toString(reverseNum2));
//
    String names[] = new String[2];
    Arrays.fill(names, "Not Provided yet");
        System.out.println(Arrays.toString(names));
        names[0] = "Tarun";
        System.out.println(Arrays.toString(names));


    }
    }

