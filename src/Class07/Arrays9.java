package Class07;

import java.util.Scanner;

/*
Create an int array of integers with a size of 5 and input values with Scanner.
Don't print prompt questions for a user.
Using loop print out each element of the array that should look like the output below
Input:

1
2
3
4
5
Output:
10
20
30
40
50
*/
public class Arrays9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+"0");
        }
        System.out.println();
        System.out.println("-------VAR2--------");

        int[] arr = new int[5];
        for (int i = 0; i < array.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]*10;
            System.out.println(arr[i]);
        }
    }
}
