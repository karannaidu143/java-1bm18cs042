//Program to print the area of 2 rectangles using classes.

import java.util.*;
class Rectangle{
	
	int len;
	int wid;
	int area;

	void input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width-");
		len=sc.nextInt();
		wid=sc.nextInt();
	}

	void output(){
		area=len*wid;
		System.out.println("The length is-" + len + "\nWidth is-" + wid + " \nThe calculated area is-" + area);
	}
}

class rectangleDemo{
	public static void main(String[] args){
		Rectangle rec1;
		rec1=new Rectangle();
		Rectangle rec2;
		rec2=new Rectangle();
		rec1.input();
		rec2.input();
		rec1.output();
		rec2.output();
	}
}
