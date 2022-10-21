package Class07;

/*
* Write a program that prints the highest value in the array.

**Expected Output:**
input [5,4,8]
8
* */
public class TwoDArrays3 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 2, 3, 7},
                {1, 5, 1, 1},
                {8, 3, 1, 9}};

        int max = arr[0][0];

        for (int[] arr1 : arr) {
            for (int elem : arr1) {
                if (elem > max) {
                    max = elem;
                }
            }
        }
        System.out.println(max);

        System.out.println("---------VAR2----------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println(max);
    }
}

