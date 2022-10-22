package Class07;

/*
Create method name it as newLine
Add print statement inside method body as "newLine method implementation"
Call newLine method three times
Expected Output:
newLine method implementation
newLine method implementation
newLine method implementation
 */
public class JavaMethods2 {
    public static void main(String[] args) {

        JavaMethods2 m = new JavaMethods2();
        m.newLine();
        m.newLine();
        m.newLine();
    }

    void newLine() {
        System.out.println("newLine method implementation");
    }
}
