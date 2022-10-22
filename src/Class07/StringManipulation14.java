package Class07;

import java.util.Scanner;

/*
Given the following inputs:
String s;
Write a for loop that will print out each letter of the string s, separated by
spaces, on the same line.
Sample input/outputs:
In: hello
h e l l o
In: covert
c o v e r t
In: blasphemy
b l a s p h e m y
*/
public class StringManipulation14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)+" ");
        }
    }
}
