package Class07;

/*
 * Using do while loop print even numbers from 20 to 1
 * */
public class DoWhileLoop3 {
    public static void main(String[] args) {

        int i = 20;
        do {
            if (i % 2 == 0)
                System.out.println(i);
            i--;
        } while (i > 0);
    }
}
