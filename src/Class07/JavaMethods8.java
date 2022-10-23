package Class07;

import java.util.Locale;

/*
Create a method that will accept a String as a parameter and return new String all
in upper case
Call method
Expected Output:
TEST
 */
public class JavaMethods8 {

    public static void main(String[] args) {
        System.out.println(newStringToUpper("test"));
    }
    public static String newStringToUpper (String newS){
        return newS.toUpperCase();
    }

}
