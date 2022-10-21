package Class07;

import java.util.Scanner;

/*
* Подскажите пользователю с вопросом: "Это выходные?"
Если это не выходные --> тема="ручное тестирование
В противном случае --> тема="Java"
**Вывод**:
```
Сегодня вы будете изучать ____
*
* Prompt user with a question: "Is it weekend?"
If it is not a weekend --> subject="manual testing"
Otherwise --> subject="Java"
**Output**:
```
Today you will be learning ____
```
* */
public class LogicalOperator4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it weekend?");
        boolean isWeekend = sc.nextBoolean();
        String subject = "";

        if(!isWeekend){
            subject ="manual testing";
        }else {
            subject = "Java";
        }
        System.out.println("Today you will be learning "+subject);
    }
}
