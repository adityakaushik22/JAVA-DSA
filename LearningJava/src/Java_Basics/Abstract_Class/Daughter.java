package Java_Basics.Abstract_Class;

public class Daughter extends Parent{
    @Override
    void carrer(String name) {
        System.out.println(name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("i love "+name+" he is "+age);
    }
}
