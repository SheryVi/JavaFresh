package Class07;

/*
declare 3 instance variables to hold an integer, double and char values.
Create 2 instances of the class and assign values to variables and the print them
Expected Output:
10
10.23
a
100
100.23
s
 */

public class Variables3 {

int intNum;
double dNum;
char ch;

    public static void main(String[] args) {

        Variables3 inst1 = new Variables3();
        Variables3 inst2 = new Variables3();

        inst1.intNum = 10;
        inst1.dNum = 10.23;
        inst1.ch = 'a';

        inst2.intNum = 100;
        inst2.dNum=100.23;
        inst2.ch='s';

        System.out.println(inst1.intNum+" \n"+inst1.dNum+ " \n"+inst1.ch+" \n");
        System.out.println(inst2.intNum+ " \n"+inst2.dNum+ " \n"+inst2.ch+"\n");

        System.out.println("--------------VAR2-------------");
        System.out.printf("%d%n%f%n%s",inst1.intNum,inst1.dNum,inst1.ch);
        System.out.println();
        System.out.printf("%d%n%f%n%s",inst2.intNum,inst2.dNum,inst2.ch);
    }
}
