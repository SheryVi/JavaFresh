package Class07;

import java.util.Scanner;

/*
*
You have Scanner class to input string value.
If language is Java it should print the:
"Java is a programming language".
If language is C it should print the:
"C is a procedural programming language"
If language is C++ it should print the:
"C++ is a middle-level programming language"
If any other should print:
"Doesn't match any programming language"
*
* */
public class StringManipulation7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String language = sc.nextLine();

        if (language.equalsIgnoreCase("Java")) {
            System.out.println("Java is a programming language");
        } else if (language.equalsIgnoreCase("C")) {
            System.out.println("C is a procedural programming language");
        } else if (language.equalsIgnoreCase("C++")) {
            System.out.println("C++ is a middle-level programming language");
        } else {
            System.out.println("Doesn't match any programming language");
        }

        System.out.println("-------------VAR2-------------");

        String language1 = sc.nextLine();
        String message = switch (language1) {
            case "Java" -> "Java is a programming language";
            case "C" -> "C is a procedural programming language";
            case "C++" -> "C++ is a middle-level programming language";
            default -> "Doesn't match any programming language";
        };
        System.out.println(message);

    }

}
