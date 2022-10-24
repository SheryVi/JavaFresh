package Class07;
/*
* Create a static method with the following specs:
Returns:
an integer
Name:
countA
Parameters:
a String called s
Purpose:
count the number of occurrences of 'a' or 'A' within s
Examples:
countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6

* */
public class KeywordCountA7 {

    static int countA(String s){
        s=s.replaceAll("[^Aa]", ""); //"[^Aa]", ""
        return s.length();
    }

    public static void main(String[] args) {
        System.out.println(countA("aaa"));
        System.out.println(countA("aaBBdf8k3AAadnklA"));
        System.out.println(countA("marazmatic"));
    }
}
