package Class07.AccessModifiers;
/*
* For you to do:
Create the maxValue method that will accept int array
and return the maximum value in the array.

Method should visible every class in any package!
**Expected Output:**

```
22
* */
public class AccessModifiers6 {

    static int maxValue(int[] array){
        int maxNum=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>maxNum){
                maxNum=array[i];
            }
        }
        return maxNum;
    }

    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        AccessModifiers6 task = new AccessModifiers6();

        System.out.println(maxValue(arr)); //should print 22
    }

}

