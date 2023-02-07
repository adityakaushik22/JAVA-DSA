package Java_Basics.lambda_expressions;

import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0; i<5;i++){
            arr.add(i+1);
        }
        arr.forEach((item)-> System.out.println(item*2));

        Operation sum = (a,b)-> a+b;
        Operation diff = (a,b)-> a-b;
        Operation mul = (a,b)-> a*b;
        Operation div = (a,b)-> a/b;

        Lambda l=new Lambda();
        System.out.println(l.operate(2,3,sum));

    }
    // lambda functions are one line functions. most of the time we dont need the name of the function.

    int operate(int a,int b,Operation op){
        return op.operation(a,b);
    }



}

interface Operation{
    int operation(int a,int b);
}
