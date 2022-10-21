package Class07;

import java.util.Scanner;

/*
Create an array of integers that will store 5 elements taken from a user
Don't print any prompt message for the user
Then print out all the elements you have created in the first loop in reverse order.
*/
public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }
}
