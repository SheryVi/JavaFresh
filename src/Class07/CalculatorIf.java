package Class07;

import java.util.Scanner;

public class CalculatorIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first value");
        int val1 = sc.nextInt();
        System.out.println("Please enter desired operation: +, -, /, *");
        char operator = sc.next().charAt(0);
        System.out.println("Please enter your second value");
        int val2 = sc.nextInt();
        int result = 0;
        if (operator == '+') {
            result = val1 + val2;
        } else if (operator == '-') {
            result = val1 - val2;
        } else if (operator == '*') {
            result = val1 * val2;
        } else if (operator == '/') {
            result = val1 / val2;
        } else {
            System.out.println("Invalid entry");
        }
        System.out.println(result);
    }
}
