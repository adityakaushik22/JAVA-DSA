package Java_Basics.Abstract_Class;

public class Son extends Parent{

    @Override
    void carrer(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+" she is "+age);
    }
}
