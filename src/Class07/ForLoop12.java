package Class07;

import java.util.Scanner;

/*
* Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at one less than
x and ending at 0.
Sample input/outputs:
In: 7
6 5 4 3 2 1 0
* */
public class ForLoop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        for (int i = end-1; i >= 0; i--) {
            System.out.print(i+" ");
        }
    }
}
