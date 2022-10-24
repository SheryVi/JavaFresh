package Class07.AccessModifiers;

/*
* In AnotherClass declare a private, default, protected, public methods
and have them each return the name of the what access modifier they are using.

All methods should be accessible by class name
Call methods of Another class inside Main class

* */
public class AnotherClass {

    static private String Method1() {
        final String aPrivate = "private";
        return aPrivate;
    }

    String Method2() {
        final String aDefault = "default";
        return aDefault;
    }

    protected String Method3() {
        final String aProtected = "protected";
        return aProtected;
    }

    public String Method4() {
        final String aPublic = "public";
        return aPublic;
    }


}
