package Class07;

/*
* **For you to do:**

Write a program that calculates the sum of elements from each row in a 2D array
and adds them into array of integers

For example, if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4

  {3,1,2}, //sum = 6

  {3,5,3}, //sum = 11

  {0,1,2}  //sum = 3
}

Then we should get the following array back:

4
6
11
3
* */
public class TwoDArrays5 {
    public static void main(String[] args) {
        int[][] array =
                {{1, 1, 2}, //sum = 4
                        {3, 1, 2}, //sum = 6
                        {3, 5, 3}, //sun =11
                        {0, 1, 2}}; //sum = 3


        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum+=array[i][j];
            }
            System.out.println(sum);
        }

        System.out.println("---------------VAR2----------------");

        int sum;
        int[] rowSum = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            sum=0;
            for (int j = 0; j < array[j].length; j++) {
                sum+= array[i][j];
            }
            rowSum[i]=sum;
            System.out.println(sum);
        }

    }
}
