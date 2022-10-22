package Class07;

import java.util.Scanner;

/*
Given the following inputs:
String s;
Write a for loop that will print out the reverse of the string.
Sample input/outputs:
In: manhattan
nattahnam
In: processor
rossecorp
In: racecar
racecar
 */
public class StringManipulation11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse = " ";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);
    }
}
