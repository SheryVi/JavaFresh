package Class07;
/*
*
* **For you to do:**
Ask the user to enter any number from 1-7.
Based on the number define the day of the week

**Example Output:**
Input a number between 1-7
Friday
* */

import java.util.Scanner;

public class SwitchStatement6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1-7");
        int num = sc.nextInt();
        String dayOfWeek = switch(num){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(dayOfWeek);
    }
}
