package Class07;
/*
Based on the user inputs program should give a correct answer.
If browser is Chrome or Chrome or CHROME or ChRoMe it should print the:
"Proceed with Chrome browser"
If browser is firefox, FIREFOX or FireFOX it should print the:
"Proceed with Firefox browser"
If browser is IE, ie or iE it should print the:
"Proceed with IE browser"
If any other browser it should print the:
"Invalid browser"
 */

import java.util.Scanner;

public class StringManipulation8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter name of browser");
        String browser = sc.nextLine();
        String message = switch (browser) {
            case "Chrome", "ChRoMe", "chrome", "CHROME" -> "Proceed with Chrome browser";
            case "firefox", "FIREFOX", "FireFOX", "Firefox" -> "Proceed with Firefox browser";
            case "IE", "iE", "ie" -> "Proceed with IE browser";
            default -> "Invalid browser";

        };
        System.out.println(message);
    }
}
