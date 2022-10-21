package Class07;
/*
* Create a for loop that prints out odd numbers from 5 to 22
* Must not include the number 22 in the output
 * */
public class ForLoop4 {
    public static void main(String[] args) {

        for (int i = 5; i < 22; i++) {
            if(i %2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("--------VAR2--------------");
        for (int i = 5; i < 21; i++) {
            i+=1;
            System.out.print(i+" ");
        }

    }
}
