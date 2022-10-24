package Class07;
/*
* For you to do:
Create the maxLength method that will accept String array
of words and return the word with the largest length.

Method should visible only within same package!

**Expected Output:**

this is long
* */
public class AccessModifiers5 {

    static String maxLength(String[] array){
        String maxString="";
        for(String arr: array){
            if(arr.length()>maxString.length()){
                maxString=arr;
            }
        }
        return maxString;
    }

    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
