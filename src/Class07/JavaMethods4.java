package Class07;
/*
Create one method as syntaxTechnologies and write the logic for that method in
println statement as "Welcome to Syntax Technologies!"
Create another method as syntaxStudents and write the logic for that method in
println statement as "Welcome Syntax Students!"
Call both methods
Expected Output:
Welcome to Syntax Technologies!
Welcome Syntax Students!
 */
public class JavaMethods4 {
    void syntaxTechnologies(){
        System.out.println("Welcome to Syntax Technologies!");
    }

    void syntaxStudents(){
        System.out.println("Welcome Syntax Students!");
    }

    public static void main(String[] args) {
        JavaMethods4 jm = new JavaMethods4();
        jm.syntaxTechnologies();
        jm.syntaxStudents();
    }
}
