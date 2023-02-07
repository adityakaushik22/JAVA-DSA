package Java_Basics.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList<T> {

    // new array
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size =0; // also working as index

    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy prev elements
        for (int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size== data.length;
    }

    public T remove(){
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }

    public int size(){
        return size;
    }

    public void set(T value, int index){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList<>();
//        list.add(5);

        // custom array list
        CustomArrayList arr = new CustomArrayList();
        arr.add(9);
        arr.add(10);
        System.out.println(arr);

        CustomArrayList<Integer> arr2 = new CustomArrayList<>();
        arr2.add(25);
        System.out.println(arr2);
    }
}
