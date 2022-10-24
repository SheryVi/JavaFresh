package Class07.Constructor;
/*
* 1. Complete the Dog.java class:

Create following class variables.
dogName
dogWeight
static dogBreed=Mutt;
For all methods and variables use proper naming convention.
Create constructor to initialize instance variables
2. In Main class Create 2 Objets of a Dog class and using
each object reference variable print details of objects.

**Expected Output:**
Tarzan Mutt 50.0
Lucy Mutt 10.0
* */
public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog("Tarzan", 50.0);
        Dog obj1 = new Dog("Lucy", 10.0);
        obj.Display();
        obj1.Display();
    }
}
