package Class07;

import java.util.Scanner;

/*
Prompt user with questions: "Please enter your favorite car make"
- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"

The output of your program should be:
"Your favorite car is ___"
* */
public class SwitchStatement5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your favorite car make");
        String carBrand = sc.nextLine();
        String carOrigin = switch (carBrand){
            case "BMW" -> "german car";
            case "Toyota" -> "japanese car";
            case "Maserati" -> "italian car";
            default -> "unknown";
        };
        System.out.println(carOrigin);
    }
}
