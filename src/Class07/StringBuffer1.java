package Class07;
import java.util.Locale;
/*
Instantiate and StringBuffer class
Append Value "Hello" to it
Append value "World" to it.
Print in UPPERCASE.
Expected Output:
HELLO WORLD
 */

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer();
        name.append("Hello").append("World");
        System.out.println(name.toString().toUpperCase());
    }
}
