package Class07;

import java.util.Scanner;

/*
*
* Write a program using the switch statement

Let us consider there are three students in the class with roll number  starting from (101 to 103)
if any number other than 101-103 are present display "Not found Student name: in Class"

Давайте предположим, что в классе есть три ученика с номерами бросков, начинающимися с (101 по 103)
если присутствует какой-либо номер, отличный от 101-103, отобразите "Имя учащегося не найдено: в классе".

First Output: "Enter the roll number of the Child"
case 101: if roll number is 101 print as "Student name: Ramesh"
case 102 :if roll number is 102 print as "Student name: Mahesh"
case 103:if roll number is 103 print as "Student name: Mukesh"
Other than this roll number  it should print "Not found Student name: in Class"
* */
public class SwitchStatement3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the roll number of the Child");
        int number = sc.nextInt();
        String name = switch (number){
            case 101 -> "Student name: Ramesh";
            case 102 -> "Student name: Mahesh";
            case 103 -> "Student name: Mukesh";
            default -> "Not found Student name: in Class";
        };
        System.out.println(name);
    }
}
