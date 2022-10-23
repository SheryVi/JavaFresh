package Class07;
/*
Create a method in which you will be printing numbers from 1 to 10
Call the method in the main method
Expected Output:
1
2
3
4
5
6
7
8
9
10
 */
public class JavaMethods5 {

    public static void main(String[] args) {
        JavaMethods5 jm = new JavaMethods5();
        jm.numbers();
    }

void numbers(){
    for (int i = 1; i <= 10; i++) {
        System.out.println(i);
    }
}

}
