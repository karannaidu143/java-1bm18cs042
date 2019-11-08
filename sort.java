//Program to sort a given 1D array in ascending order.

import java.util.*;
public class sort
{
	public static void main(String[] args){
		int i,n,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size-");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the array elements-");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}		
		}
		System.out.println("The sorted array is:");
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
