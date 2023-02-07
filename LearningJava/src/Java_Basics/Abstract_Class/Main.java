package Java_Basics.Abstract_Class;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.carrer("Doctor");
        son.partner("aa",21);

        Daughter d = new Daughter();
        d.carrer("coder");
        d.partner("bb",23);

        Parent.hello();
    }
}
