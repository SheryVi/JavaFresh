package Class07;

import java.util.Scanner;

/*
*Примите 2 логических ввода от пользователя:
"Ты хочешь пить?"
"Ты хочешь спать?"
Если пользователь хочет пить и не хочет спать -> пить=вода
Если пользователь хочет пить и хочет спать -> напиток= кофе
Если пользователь не испытывает жажды и сонливости -> напиток=чай
В противном случае напиток="ничего"
*
* Take 2 boolean inputs from a user:
"Are you thirsty?"
"Are you sleepy?"
If user is thirsty and not sleepy--> drink=water
If user is thirsty and sleepy--> drink=coffee
If user is not thirsty and sleepy --> drink=tea
Otherwise drink="nothing"
* */
public class LogicalOperator2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you thirsty?");
        boolean isThirsty = sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy = sc.nextBoolean();

        if(isThirsty && !isSleepy){
            System.out.println("Looks like you need to drink water");
        }else if(isThirsty){
            System.out.println("Looks like you need to drink coffee");
        }else if (isSleepy){
            System.out.println("Looks like you need to drink tea");
        }else {
            System.out.println("Looks like you need to drink nothing");
        }
    }
}
