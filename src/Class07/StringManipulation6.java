package Class07;
/*
        Using Scanner class input string value.
        Print out the following: "The first 3 letters of ___ is ___"
        For example, if the input is "banana", your output should be: "The first 3 letters
        of banana is ban".
*/

import java.util.Scanner;

public class StringManipulation6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //String str2 = str.substring(0,3);
        System.out.println("The first 3 letters of "+str +" is "+str.substring(0, 3));

    }
}
