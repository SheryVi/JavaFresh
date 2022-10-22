package Class07;

/*
Create a String given="Hello Syntax friends".
Using String methods from given String create new String "Welcome Syntax family"
Expected Output:
Welcome Syntax family
 */
public class StringManipulation9 {
    public static void main(String[] args) {
        String given = "Hello Syntax friends";
        System.out.println(given.replaceAll("Hello Syntax friends","Welcome Syntax family"));

        System.out.println("-----------VAR2----------");

        String given2 = given.replace("Hello", "Welcome");
        String given3 = given2.replace("friends","family");

        System.out.println(given3);

    }
}
