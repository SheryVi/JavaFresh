package Class07;
/*
Declare a static variable number that will hold an integer value:
Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of
200.
Print out number using class name and using instance
Expected Output:
200
200
 */
public class Variables7 {
    static int num;

    public static void main(String[] args) {
        num = 200;
        System.out.println(Variables7.num);

        Variables7 ob = new Variables7();
        ob.num = 200;
        System.out.println(ob.num);


        }
    }

