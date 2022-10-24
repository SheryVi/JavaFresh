package Class07;
/*
Create a variable that will hold the count of all instances of the Main class
Create 3 Object of the class and print value of the count variable;
Expected Output:
3
 */
public class Variables8 {
    static int count;

    public static void main(String[] args) {
        Variables8 obj1 = new Variables8();
        count++;
        Variables8 obj2 = new Variables8();
        count++;
        Variables8 obj3 = new Variables8();
        count++;
        System.out.println(count);


    }


}
