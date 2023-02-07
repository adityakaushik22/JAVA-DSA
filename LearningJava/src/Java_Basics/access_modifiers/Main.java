package Java_Basics.access_modifiers;

import javax.management.ObjectName;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10,"aditya");
        // need to do
        //1. access the data members
        //2. modify the data members.
        ObjectDemo o = new ObjectDemo();
        System.out.println(o.hashCode());
        System.out.println(o instanceof Object);
    }
}
