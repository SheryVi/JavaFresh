package Class07.AccessModifiers;
/*
* For you to do:
In AnotherClass declare a private, default, protected, public methods
and have them each return the name of the what access modifier they are using.

All methods should be accessible by class name
Call methods of Another class inside Main class

**Expected Output:**
default
protected
public
* */
public class AccessModifiers3 {

    public static void main(String[] args) {
        AnotherClass obj = new AnotherClass();
        System.out.println(obj.Method2());
        System.out.println(obj.Method3());
        System.out.println(obj.Method4());
    }
}
