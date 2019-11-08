import java.util.*;
abstract class Shape{
    int l, h;
    abstract void printArea();
}
class Rectangle extends Shape{
    float area;
    Rectangle(int a, int b){
        l = a;
        h = b;
    }
    void printArea(){
        area = (float)(l*h);
        System.out.println("The area of the Rectangle is " + area);
        return;
    }
}
class Triangle extends Shape{
    float area;
    Triangle(int a, int b){
        l = a;
        h = b;
    }
    void printArea(){
        area = (float)(l*h)/2;
        System.out.println("The area of Triangle is " + area);
        return;
    }
}
class Circle extends Shape{
    float area;
    Circle(int a){
        l = a;
    }
    void printArea(){
        area = (float)(3.141 * l * l);
        System.out.println("The area of the Circle is " + area);
        return;
    }
}
class abstract_Shapedemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Shape ob;
        int choice, x, y;
        System.out.println("1. Rectangle\n2. Triangle\n3. Circle\n4. Exit");
        do{
            System.out.println("Choice : ");
            choice = sc.nextInt();
            switch(choice){
                case 1: System.out.print("Enter the Length and Breadth of the Rectangle : ");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        ob = new Rectangle(x, y);
                        ob.printArea();
                        break;
                case 2: System.out.print("Enter the Base and Height of the Triangle : ");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        ob = new Triangle(x, y);
                        ob.printArea();
                        break;
                case 3: System.out.print("Enter the Radius of the Circle : ");
                        x = sc.nextInt();
                        ob = new Circle(x);
                        ob.printArea();
                        break;
                case 4: return;
            }
        }while(choice != 4);
    }
}
