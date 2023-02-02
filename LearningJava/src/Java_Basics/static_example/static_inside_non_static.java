package Java_Basics.static_example;

public class static_inside_non_static {
    public static void main(String[] args) {
//        greetings();
    }

    // so non static method will not work in the static main method it should also be static to work
    void greetings(){
        System.out.println("hello");
    }

    // how to use the non_static function in static
    static void fun(){
        // so to use non_static method like greetings we have to make a object of the class we are in because its a member of that
        static_inside_non_static obj=new static_inside_non_static(); // created a instance of class to get the non static, thats why we always make our main method static because by making main static we dont have to create an instance of object class.
        obj.greetings();
    }
    // so for static methods we have to create a object to access non_static members
    // for static methods we dont have to put this keyword in the class to access.

}
