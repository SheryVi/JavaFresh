package Class07;

/*
Step1: Create three methods that will accept 2 in parameters on integer type
Step2: Write the logic in methods to perform actions below:
The first method for multiplication
The second method for addition
The third method for subtraction
Step3: execute all methods
for the addition method add two numbers to make 30
for multiplication multiply two numbers to make 30
for Subtraction subtract two numbers to equal 20
Expected Output:
Addition 30
Multiplication 30
Subtraction 20
 */
public class JavaMethods7 {

    void multiplication(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    void addition(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    void subtraction(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public static void main(String[] args) {
        JavaMethods7 jm = new JavaMethods7();
        jm.addition(10,20);
        jm.multiplication(10,3);
        jm.subtraction(40,20);

    }
}
