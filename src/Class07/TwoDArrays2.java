package Class07;

import java.util.Arrays;

/*
* Write a program to double the values of every element in the array and print it out.
2.8 4.0 6.6 4.0
8.0 3.0 12.2 2.0
2.4 6.2 8.0 3.2
 * */
public class TwoDArrays2 {
    public static void main(String[] args) {

        double[][] twoArray = {{2.8, 4.0, 6.6, 4.0},
                {8.0, 3.0, 12.2, 2.0},
                {2.4, 6.2, 8.0, 3.2}};

        for (double[] doubles : twoArray) {
            for (double twoArray1 : doubles) {
                System.out.print(twoArray1 * 2 + " ");
            }
            System.out.println();
        }
        System.out.println("-------------VAR2------------");

        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j < twoArray[i].length; j++) {
                twoArray[i][j]=twoArray[i][j]*2;
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();

        }
    }

}
