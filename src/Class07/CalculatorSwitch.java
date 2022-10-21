package Class07;

import java.util.Scanner;

public class CalculatorSwitch {
    /*
     *Using scanner class create calculator. Allow user to enter 2 numbers and
     * operator(+,-,*,/). Based on operator provide the result to user. Please
     * complete this assignment in 2 ways: using if statement and switch case.
     *
     * Используя класс сканера, создайте калькулятор. Разрешить пользователю ввести 2 номера и
     * оператор(+,-,*,/). На основе оператора предоставьте результат пользователю. Пожалуйста
     * выполните это задание 2 способами: используя оператор if и переключите регистр.
     * */
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        char operator;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first number");
        num1 = sc.nextInt();

        System.out.println("Please enter second number");
        num2 = sc.nextInt();

        System.out.println("What is the operator?");
        operator = sc.next().charAt(0);





       switch (operator){
           case '+':
               result = num1 + num2;
               break;
           case'-':
               result = num1 - num2;
               break;
           case '/':
               if(num2!=0){
               result = num1/num2;
               }else {
                   System.out.println("We cannot divide a number by 0");
               }
               break;
           case'*':
               result = num1*num2;
               break;
           default:
               System.out.println("Invalid Operator");
       }

        System.out.println(result);

    }


}
