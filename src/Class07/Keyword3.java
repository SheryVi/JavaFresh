package Class07;
/*
Declare two static variables to hold
country name
continent
Create a method to display the value of static variables in the following format:
____ located on ____ continent
In the main method assign values to a static variable and execute method display
Expected Output:
Morocco located on Africa continent
 */
public class Keyword3 {

    static String country;
    static String continent;

    void display(){
        System.out.println(country+" located on "+continent+" continent");
    }

    public static void main(String[] args) {
        country = "Morocco";
        continent = "Africa";
        Keyword3 obj = new Keyword3();
        obj.display();

    }
}
