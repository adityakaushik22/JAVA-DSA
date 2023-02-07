package Java_Basics.generics.comparing_objects;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    public Student(int roll, float marks) {
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        //if diff ==0 means both are equal
        // if diff<1 means o is bigger
        return diff;
    }
}
