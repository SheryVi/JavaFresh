package Class07;

import java.util.Scanner;

/*
* **For you to do:**
Write a program using the switch statement
Let us consider the scenario regarding the born baby age

First Output: "Enter the age of the Child"
case 1: if age is 1 print as "You can Crawl"
case 2 : if age is 2 print as  "You can Talk"
case 3: If age is 3 print as "You can Dance"
case 4: if age is 4 print as "You can get Trouble"
Other than this age (1-4) it should print "I don't know how old you are"
```
* */
public class SwitchStatement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the Child");
        int age = sc.nextInt();
        String print = switch (age) {
            case 1 -> "You can Crawl";
            case 2 -> "You can Talk";
            case 3 -> "You can Dance";
            case 4 -> "You can get Trouble";
            default -> "I don't know how old you are";
        };
        System.out.println(print);
    }
    }

