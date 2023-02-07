package Java_Basics.Cloning;

import java.util.HashMap;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(Human h) {
        this.age = h.age;
        this.name = h.name;
    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1,2,3,4,5};
    }

    // clone method
    @Override // so its actually overriding
//     shallow copy : the array will point to same reference if make a new object.
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }

    // deep copy
    public Object clone() throws CloneNotSupportedException{
        Human twin = (Human)super.clone();

        twin.arr = new int[twin.arr.length];
        for (int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i]; // twin ko same class ke values se equal kar diya.
        }
        return twin;
    }

}
