import java.util.Scanner;

public class Day7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Switch Statements
//        System.out.println("Enter your choice (1-7):");
//        int choice = sc.nextInt();
//        switch(choice)
//        {
//            case 1: // choice == 1
//                System.out.println("MONDAY");
//                break;
//            case 2: // choice == 2
//                System.out.println("TUESDAY");
//                break;
//            case 3:
//                System.out.println("WEDNESDAY");
//                break;
//            case 4:
//                System.out.println("THRUSHDAY");
//                break;
//            case 5:
//                System.out.println("FRIDAY");
//                break;
//            case 6:
//                System.out.println("SATURDAY");
//                break;
//            case 7:
//                System.out.println("SUNDAY");
//                break;
//
//            default:
//                System.out.println("INVALID OPTION");
//                break;
//        }
/*        int dayOfWeek = sc.nextInt();
        String dayName = switch(dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thrushday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "INVALID";
        };

        System.out.println("The day is "+ dayName);
        System.out.println(dayName);
*/
        /*
        int number = 2;
        String result = ""; // Empty string
        switch(number){
            case 1:
                result+="One";
            case 2:
                result+="Two";
            case 3:
                result+="Three";
                break;
            default:
                result+="Default";
        }
        System.out.println(result);
*/
        /*
        String day = "Monday";
        String typeOfDay = "";
        switch(day){
            case "Monday": break;
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                typeOfDay = "Weekday";
                break;
            case "Saturday":
            case "Sunday":
                typeOfDay = "Weekend";
                break;
            default:
                typeOfDay = "Invalid Day";
        }
        System.out.println("Day Type : "+typeOfDay);
        */

        int []numbers = {1,2,3,4,5};
        int sum = 0;

        for (int num : numbers) {
            switch (num) {
                case 1:
                case 3:
                case 5:
                    sum += num;
                    break;
                case 2:
                case 4:
                    sum -= num;
                    break;
            }
        }
        System.out.println("Sum : "+sum);
 // num = 5
        // sum = 0+1-2+3-4+5 = 3
    }
}
