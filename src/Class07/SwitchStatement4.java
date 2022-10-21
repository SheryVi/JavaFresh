package Class07;

import java.util.Scanner;

/*
* **For you to do:**
Write a program to input number
"Input a number between 1-12" and when you input a number
it should display the month using Scanner and Switch statement.

case: 1 will display January
case: 12 will display December
Anything outside of 12 will display "Invalid"
**Example Output:**
Input a number between 1-12
Invalid
January
```
* */
public class SwitchStatement4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number between 1-12");
        int number = sc.nextInt();
        String month = switch (number){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid";
        };
        System.out.println(month);
    }
}
