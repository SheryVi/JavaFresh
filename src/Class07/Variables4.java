package Class07;
/*
Declare 3 instance variables to hold:
name of the country
capital
population size
Create a method to display values of instance variables
Create 2 Object, assign values to instance variables, execute method display;
Expected Output:
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
 */
public class Variables4 {
    String country;
    String capital;
    int populationSize;

    void print(){

        System.out.println("The capital of "+country+" is "
                +capital+" and population is "+populationSize);
    }

    public static void main(String[] args) {
        Variables4 obj1 = new Variables4();
        obj1.country = "Russia";
        obj1.capital="Moscow";
        obj1.populationSize=13000000;

        Variables4 obj2 = new Variables4();
        obj2.country="France";
        obj2.capital="Paris";
        obj2.populationSize=7000000;

        obj1.print();
        obj2.print();

    }

}
