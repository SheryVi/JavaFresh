package Class07;

import java.util.Scanner;

public class HW {
    /*
    * Write a program to ask to enter value for sale: yes or not if there is no
    * sale --> you are not going shopping if there is sale ask you user for the price of the item
    *
    * Based on the price you have to calculate the price of the item after the
    * discount
    *
    * if price is less than 20$ --> apply 10% discount
    * if price is between $20 & $100 -->20% discount
    * if price between $100 & $500 --> 30% discount
    * otherwise apply 50% discount
    *
    * Output of the program should be:
    *
    * After discount ___the price of the item reduce from __ to __
    *
    * Напишите программу, которая попросит ввести стоимость для продажи: да или нет, если продажи нет ->
    * вы не собираетесь за покупками, если есть распродажа, спросите у пользователя цену товара
    * Исходя из цены, вы должны рассчитать цену товара после скидки
    * если цена меньше 20$ -> примените скидку 10%, если цена составляет от 20 до 100 долларов ->
    скидка 20%, если цена от 100 до 500 долларов США -> скидка 30%, в противном случае применяется скидка 50%
    *
    * Выходные данные программы должны быть:
    *
    * После скидки ___ цена товара снижается с __ до __
    *
    * */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your value");
        String sale = sc.next();
        if(sale.equalsIgnoreCase("no")){
            System.out.println("You are not going for shopping");
        }else if(sale.equalsIgnoreCase("yes")){
            System.out.println("What is the price of the item?");
            int actualPrice = sc.nextInt();
            int discount = 0;

            if(actualPrice >= 20 && actualPrice<=100){
                discount = 20;
            }else if(actualPrice >= 100 && actualPrice <= 500){
                discount = 30;
            }else{
                discount = 50;
            }
            int saving = (actualPrice * discount)/100;
            int finalPrice = actualPrice - saving;

            System.out.println("After "+discount+"% discount the price of the item reduce from "+ actualPrice+" to "+finalPrice);
        }
    }

}
