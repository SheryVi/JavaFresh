package Class07;

import java.util.Scanner;

/*
*
* Предложите пользователю ввести две строки: "Пожалуйста, введите две строки" и два целых числа: "Пожалуйста, введите два числа"
и проводите сравнения:

- если int1 и int2 равны ** и** word1 и word2 равны, выведите "И"
- если int1 и int2 равны ** или** word1 и word2 равны, выведите "ИЛИ"
- если int1 и int2 ** не** равны ** и ** word1 и word2 ** не** равны, выведите "НЕТ"
* */
public class LogicOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two strings");
        String word1 = sc.next();
        String word2 = sc.next();
        System.out.println("Please enter two numbers");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();

        if(word1.equals(word2)&&(int1==int2)){
            System.out.println("AND");
        }else if(word1.equals(word2)||(int1==int2)){
            System.out.println("OR");
        }else {
            System.out.println("NONE");
        }




    }
}
