package Java_Basics.access_modifiers;

public class Subclass extends A{

    public Subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass(34,"aadi");
        int n =obj.num; 
    }
}
