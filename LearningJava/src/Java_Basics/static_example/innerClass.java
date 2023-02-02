package Java_Basics.static_example;

// the outer classes cannot be static, the inner ones are the static ones in java.

class Test1{
    static String name;

    public Test1(String name) {
        Test1.name=name; // we cant use this inside static var. so used classname.
    }
}

public class innerClass {

    // will only work if made static
    static class Test{
         String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test1 a1 = new Test1("king");
        Test1 a2 = new Test1("queen");
        System.out.println(a1.name); // queen
        System.out.println(a2.name); // queen
//      so the static variables for test1 are not dependent on other class so when we use them in main the static variable name is shared to the objects of this test1 class.


        Test a = new Test("aditya"); // gives error if we use class inside class and also if class is not static,, so here main will say from where are you coming and whom are you dependent on, also the innerClass is not static so it cant be dependent on that.
        Test b = new Test("aashi");
        System.out.println(a.name); // aditya
        System.out.println(b.name); // aashi
        // the above both the print statement will print aditya and aashi respectively. because we have used inner classes so we have to make our class static so test is static so these are under the innerClass so dependent on innerclass. so thats wh ywe have to make static basically ab non static class ko static me karenge to error dega main uska object banane ko kahega siliye statci bana denge so static class ki objects ka value badlega lekin static variable ka same rahega.

    }



}
