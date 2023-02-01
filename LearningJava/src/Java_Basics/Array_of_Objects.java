package Java_Basics;

class Students{
    int marks;
    String name;
}

public class Array_of_Objects {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "aditya";
        s1.marks = 99;

        Students s2 = new Students();
        s2.name = "varun";
        s2.marks = 90;

        Students s3 = new Students();
        s3.name = "raj";
        s3.marks = 80;


        // array of objects

        Students[] arr = new Students[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i].name + " " + arr[i].marks);
        }
    }

}
