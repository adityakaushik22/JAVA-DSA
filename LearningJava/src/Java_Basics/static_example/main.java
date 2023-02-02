package Java_Basics.static_example;

public class main {
    public static void main(String[] args) {
        Human aditya = new Human(21,"aditya",50000,false);
        Human aashi = new Human(21,"aashi",55000,false);

        // lets check population
        System.out.println(Human.population); //2
    }
}
