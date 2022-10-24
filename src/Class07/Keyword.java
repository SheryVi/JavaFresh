package Class07;
/*
Create two methods:
The first method should be a non-static method that will print out the following
message:
"Programming is amazing."
The second method should be a static method that will print out the following
message:
"Java is awesome."
Execute both methods
Expected Output:
Programming is amazing.
Java is awesome.
 */
public class Keyword {

    void print(){
        System.out.println("Programming is amazing.");
    }
    static void display(){
        System.out.println("Java is awesome.");
    }


    public static void main(String[] args) {
        Keyword obj = new Keyword();
        obj.print();
        display();

    }

}
