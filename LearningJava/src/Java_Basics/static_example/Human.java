package Java_Basics.static_example;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1; // so if we not put static in the population variable it'll not work
    }
}

// so a static variable is passed to
