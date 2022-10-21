package ClassAndObject;
/*
* Create a Class Main

In this class, you should specify the following attributes:
* breed, name, color, and following behaviors: bark(), run(), play().

Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.
The output of the program should be as following:


Husky can bark
Husky can run
Husky can play

Bulldog can bark
Bulldog can run
Bulldog can play

Labrador can bark
Labrador can run
Labrador can play
* */
public class Main3 {

    String breed, name, color;

    void bark(){
        System.out.println(breed+ " can bark");
    }
    void run(){
        System.out.println(breed+ " can run");
    }
    void play(){
        System.out.println(breed+ " can play");
    }

    public static void main(String[] args) {
        Main3 Husky = new Main3();
        Husky.breed="Husky";
        Husky.bark();
        Husky.run();
        Husky.play();

        System.out.println();
        Main3 Bulldog = new Main3();
        Bulldog.breed="Bulldog";
        Bulldog.bark();
        Bulldog.run();
        Bulldog.play();

        System.out.println();
        Main3 Labrador = new Main3();
        Labrador.breed="Labrador";
        Labrador.bark();
        Labrador.run();
        Labrador.play();

    }


}
