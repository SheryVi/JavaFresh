package Class07;
/*
Declare 3 instance variables to hold:
year, school name and batch #
Access variables from the main method and assign specific values to them
Print values of your variables in the following format:
Expected Output:
I am a student of batch 6 studying at Syntax in the year of 2020
 */
public class Variables {
    static int year;
    static int batch;
    static String school;

    public static void main(String[] args) {
       year = 2022;
       batch =9;
       school="Syntax";


        System.out.println("I am a student of batch "+batch+" studying at " +
                ""+school+" in the year of "+year);
    }
}
