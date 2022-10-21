package Class07;
/*
* Write a program that sums all numbers that are on even index and on even row.
**Expected Output:**
-4
* */
public class TwoDArrays7 {
    public static void main(String[] args) {

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}};

        int sum = 0;
        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < a[i].length; j += 2) {
                sum = sum + a[i][j];
            }
        }
        System.out.println(sum);
        System.out.println("-------------VAR2-----------");



        int[][] arr = {
                {-5,-2,-3,7},
                {1,-5,-2,2},
                {1,-2,3,-4}};
        int sumNum =0;
        for(int i =0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(i %2==0 && j%2==0){
                    sumNum += arr[i][j];
                }
            }
        }
        System.out.println(sumNum);
    }
}
