package Class07;
/*
Declare the instance variables to hold:
integer values
String values
double values
boolean values
float values
Access instance variables and then print them all without assigning any values to
them.
Print variables one by one the same sequence that you declare them.
Expected Output:
0
null
0.0
false
0.0
 */
public class Variables5 {

    int val;
    String str;
    double dVal;
    boolean bVal;
    float fVal;

    public static void main(String[] args) {
        Variables5 obj = new Variables5();

        System.out.println(obj.val);
        System.out.println(obj.str);
        System.out.println(obj.dVal);
        System.out.println(obj.bVal);
        System.out.println(obj.fVal);


    }
}
