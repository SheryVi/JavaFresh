package Class07;

/*
Create a method that will accept 2 numbers as parameters and return true if both
numbers are even otherwise returned false
( Return false if one or both given numbers are not even)
Examples:
bothEven(4,6) ==> true
bothEven(3,4) ==> false
bothEven(-1,1) ==> false
Expected Output:
false
 */
public class JavaMethods10 {

    public static boolean CheckMethod(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean CheckMethodShort(int x, int y) {
        return x % 2 == 0 && y % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(CheckMethod(4, 4));
        System.out.println(CheckMethodShort(5,9));
    }


}
