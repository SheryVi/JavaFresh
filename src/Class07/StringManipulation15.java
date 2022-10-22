package Class07;

import java.util.Scanner;

/*
Create an array of names that will hold 5 String elements.
Names must be taking from a user.
Print out the first three characters of each element of the array, one per line.
Note: every array element must be at least 3 characters long.
import java.util.Scanner;
*/
public class StringManipulation15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextLine();
        }
        for (String arr : array){
            System.out.println(arr.substring(0,3));
        }


    }
}
