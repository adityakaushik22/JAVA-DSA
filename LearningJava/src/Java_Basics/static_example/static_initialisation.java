package Java_Basics.static_example;

class staticBlock{
    static int a=4;
    static int b;

//    will only run once, when the first object is created. thats why im in static block is printed only 1 time when we have 2 objects
    static {
        System.out.println("im in static block");
        b=a*5;
    }
}


public class static_initialisation {
    public static void main(String[] args) {
        staticBlock obj1 = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

        staticBlock.a+=5;
        staticBlock obj2 = new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);

    }
}
