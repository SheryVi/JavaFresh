package Class07;
/*
* For you to do:

Please create methods with different access modifiers (one for each access modifier)
and call them properly in main method one by one

In each method write the logic accordingly like for private method write the logic
in the println Statement as "This is Private Method" accordingly for rest of the methods
that have different access modifiers should be a total of 4 outputs, please make sure
they are in the same order that is printed below.

**Expected Output:**
This is Private Method
This is Default Method
This is Protected Method
This is Public Method
* */
public class Access_Modifiers {

    private static void PrivateMethod(){
        System.out.println("This is Private Method");
    }
    void Default_Method(){
        System.out.println("This is Default Method");
    }
    protected static void ProtectedMethod(){
        System.out.println("This is Protected Method");
    }

    public void PublicMethod (){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Access_Modifiers obj = new Access_Modifiers();
        PrivateMethod();
        obj.Default_Method();
        ProtectedMethod();
        obj.PublicMethod();

    }


}
