package Java_Basics.wrapper_classes;

public class wrapper {
    public static void main(String[] args) {

        // wrapper classes: are objects basically that gives us many built-in methods
        Integer num=10;
        String a;

        final A aditya = new A("aditya");
//        when a non-primitive is final, u cannot reassign it , u can change values but not reassign to something else.
//        A = new A("aa"); // not allowed to assign to new object.
    }
}

class A{
    final int num =10;
    String name;

    public A(String name){
        this.name=name;
    }


}
