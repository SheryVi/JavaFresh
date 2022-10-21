package Class07;
/*
*
* Write a program to print values from a 2D array

**Example Output:**
1.4 2.0 3.3 2.0
4.0 1.5 6.1 1.0
1.2 3.1 4.0 1.6
* */
public class TwoDArrays {
    public static void main(String[] args) {
        double[][] twoArray = {{1.4, 2.0, 3.3, 2.0,},
                { 4.0, 1.5, 6.1, 1.0,},
                { 1.2, 3.1, 4.0, 1.6}};
        for (int i = 0; i < twoArray.length; i++) {
            for (int j = 0; j <  twoArray[i].length; j++) {
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------VAR2-----------------");
        for (double[] doubles: twoArray){
            for(double twoArray1: doubles){
                System.out.print(twoArray1+" ");
            }
            System.out.println();
        }

    }
}
