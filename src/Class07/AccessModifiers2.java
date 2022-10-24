package Class07;
/*
* For you to do

In main class please declared the variables using different access modifiers that will hold value for:

- name
- city
- name of the school
- batch number

Create a method to display details in following format:

My name is \_\_\_ and I live in \_\__. I study at \_\_\_ in batch \_\_\_

Assign values to the variables and execute method display

**Expected Output:**

My name is John and I live in Miami. I study at Syntax in batch 9
*
* */
public class AccessModifiers2 {
    private String name;
    private String city;
    private String nameOfSchool;
    private String batchNum;

    AccessModifiers2(String name, String city, String nameOfSchool, String batchNum){
        this.name=name;
        this.city=city;
        this.nameOfSchool=nameOfSchool;
        this.batchNum=batchNum;
    }

    void print(){
        System.out.println("My name is "+name+" and I live in "+city+
                ". I study at "+nameOfSchool+" in "+batchNum);
    }

    public static void main(String[] args) {
        AccessModifiers2 obj = new AccessModifiers2("John", "Miami",
                "Syntax", "batch 9");

        obj.print();
    }

}
