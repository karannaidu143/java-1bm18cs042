//Program to print the maximum(greatest) element in a given 2D Array.

import java.util.*;
class forEach {
    public static void main(String[] args){
        int i, j, i1, j1, large1=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size-");
        i1=sc.nextInt();
        System.out.println("Enter the coloumn size-");
        j1=sc.nextInt();
        System.out.println("Enter the elements of array-");
        int arr[][]=new int[i1][j1];
        for(i=0;i<i1;i++){
            for(j=0;j<j1;j++)
                arr[i][j]=sc.nextInt();

        }
        for(int a[]:arr){
            for(int x:a){
                if(x>large1)
                    large1=x;
            }
        }
        System.out.println("The maximum element in the 2D Array is " + large1);

    }
}
