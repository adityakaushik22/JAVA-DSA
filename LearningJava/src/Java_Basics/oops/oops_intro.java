package Java_Basics.oops;

import java.sql.SQLOutput;

public class oops_intro {
    public static void main(String[] args) {
/*
         what is object?
         An object is a software bundle of related state and behavior.
         what is a class?
         A class is a blueprint or prototype from which objects are created.
         (properties and functions) or we can say custom data structure that can hold multiple datatypes

         By Convention class name start with capital letters.
*/
        Student aditya = new Student();
        System.out.println(aditya.name);

        Student s2=new Student(102,"JJJ",99);
        System.out.println(s2.rno);

        s2.greeting();
        s2.changeName("aashi");
        System.out.println(s2.name);

        // copy constructor
        Student s3 = new Student(s2); // so it copies the values of passed argument
        System.out.println(s3.name+" "+ s3.marks+" "+s3.rno);
    }



//    static class Student{
//        int[] rno = new int[5];
//        String[] names = new String[5];
//        float[] marks = new float[5];
//    }

//    A class is just a structure. Logical Structure
//    but a *object* is an instance(physical present there,occupies space in memory) of the class
}
class Student{
    int rno;
    String name;
    float marks;

    // default constructor
    Student(){
        this.rno=101;
        this.name="aditya";
        this.marks=99;
    }
    Student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    // constructor but passing another constructor inside basically copy constructor
    Student(Student copy){
        this.name= copy.name;
        this.rno= copy.rno;
        this.marks= copy.marks;
    }

    void greeting(){
        System.out.println("good morning "+name);
    }
    void changeName(String name){
        this.name=name;
    }
}

