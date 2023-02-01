package Java_Basics;

public class Mutable_Strings {
    public static void main(String[] args) {
        // Strings are Immutable in java
        String name= "aditya";

        // in java string is a class so we can use the new keyword for initialise like objects
        String lastname=new String("kaushik");

        // for Mutable Strings
        // StringBuffer has a capacity of 16 initially and it increases with the size of string we add
        StringBuffer s1=new StringBuffer("Aditya");
        System.out.println(s1.capacity()); // 16 + aditya(6) =22

        System.out.println(s1.append(" Kaushik"));

        // we can convert the stringBuffer to string
        String converted = s1.toString();

        String s3=s1.substring(1,5);
        System.out.println(s3);
    }
}
