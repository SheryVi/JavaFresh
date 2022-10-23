package Class07;
/*
Create a method name as newLine that should have print statement inside the method
body as "newLine method implementation"
Create a method name as displayLine that should have print statement inside the
method body as "displayLine method implementation"
Call both methods
Expected Output:
newLine method implementation
displayLine method implementation
 */

public class JavaMethods3 {
    public static void main(String[] args) {
        JavaMethods3 jm = new JavaMethods3();
        jm.newLine();
        jm.displayLine();

    }
    void newLine(){
        System.out.println("newLine method implementation");
    }
    void displayLine(){
        System.out.println("displayLine method implementation");
    }
}
