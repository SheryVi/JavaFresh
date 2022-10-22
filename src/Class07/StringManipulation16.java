package Class07;

import java.util.Scanner;

/*
There is a code that takes input as a String.
Write a program that will print out only vowels of that string
Sample input/outputs:
In: howdyho
oo
In: huehuehuehue
ueueueue
In: poopoo what idk what im doing
ooooaiaioi
 */
public class StringManipulation16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == 'a' || a == 'e' || a == 'o' || a == 'i' || a == 'u' ||
                    a == 'A' || a == 'E' || a == 'O' || a == 'I' || a == 'U'){
                System.out.print(a);
            }


        }
    }
}
