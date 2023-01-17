package Java_Basics;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        // if we know the values to be added
        int arr[]={1,2,3};

        // if the values will be initialised later
        //array of size 5
        int arr1[]=new int[5]; //

        // to print the values
        for (int i=0;i<3;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // using enhanced loop

        for (int val: arr) {
            System.out.print(val+ " ");
        }
        System.out.println();

        // 2d arrays
        int arr2[][] = new int[3][3];

        // filling array
        Scanner in = new Scanner(System.in);
        System.out.println("enter the values for 2d array");
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        // printing 2d array using enhanced for loop
        for(int val[]:arr2){
            for (int value : val) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}