package Class07;
/*
How would you reverse a String using StringBuffer Class
Given String = "Hello Friends"
Expected Output:
sdneirF olleH
 */
public class StringBuffer2 {
    public static void main(String[] args) {
        String s = "Hello World";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        String text = sb.toString();
        System.out.println(text);



    }
}
