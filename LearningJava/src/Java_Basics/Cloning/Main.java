package Java_Basics.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human aditya = new Human(24,"aditya");
//        Human twin = new Human(aditya);
        // takes a lot of resources so we clone it ,, its a method in java

        Human twin = (Human)aditya.clone();
        System.out.println(twin.age); // 24 same as aditya
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]= 100;
        System.out.println(Arrays.toString(aditya.arr));


        // it's faster , clone method is faster.
    }
}
