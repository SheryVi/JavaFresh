package Class07;
/*
Write a program that creates an array of integers
and stores the following values: 45, 78, 12,  67, 55
and then prints all array values.

**Output:**
45 78 12 67 55
* */
public class Arrays {
    public static void main(String[] args) {
        int[] values = new int[]{45, 78, 67, 55};
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]+" ");
        }

    }
}
