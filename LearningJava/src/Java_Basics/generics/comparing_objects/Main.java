package Java_Basics.generics.comparing_objects;

public class Main {
    public static void main(String[] args) {
        Student aadi = new Student(101,95.9f);
        Student aashi = new Student(102,98.6f);

        if (aadi.compareTo(aashi)<0){
            System.out.println("aashi has more makrs");
        }
    }
}
