package Class07;
/*
Declare static variable in class level as below and assign its value:
String ss="Welcome To Syntax Technologies"
Access variable in the main method and print it using three ways you learned so far
Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class
Expected Output:
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
 */

public class Variables6 {
    static String ss = "Welcome To Syntax Technologies";

    void print(){
        System.out.println(ss);
    }

    public static void main(String[] args) {
        Variables6 obj = new Variables6();

        //first way
        System.out.println(ss);
        //second way
        System.out.println(Variables6.ss);
        //third way
        obj.print();




    }

}
