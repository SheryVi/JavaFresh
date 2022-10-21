package Class07;

import java.util.Scanner;

public class LogicalOperator3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you thirsty?");
        boolean isThirsty = sc.nextBoolean();
        System.out.println("Are you sleepy?");
        boolean isSleepy = sc.nextBoolean();
        String drink = "";

        if(isThirsty && isSleepy)
            drink = "coffee";

            else if(isThirsty)
                drink = "water";
                else if(isSleepy)
                    drink = "tea";
                else drink = "nothing";
        {
            System.out.println("Looks like you need to drink "+drink);
        }
    }

}
