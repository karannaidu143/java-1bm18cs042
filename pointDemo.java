//Program to learn copy instructor
//This program gives a java runtime error in cmd, as I have implemented colors (JRE 12 not released yet)
//1BM18CS036
import java.util.*;
class Point {
    int x, y;

    Point() {
        x = 0;
        y = 0;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point obj) {
        x = obj.x;
        y = obj.y;
    }
    double distance(Point obj) {
        double res = Math.sqrt((x - obj.x) * (x - obj.x) + (y - obj.y) * (y - obj.y));
        return res;
    }
}
class PointDemo {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a and b - ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Point ob1 = new Point();
        Point ob2 = new Point(a, b);
        Point ob3 = new Point(ob2);
        System.out.println("The Distance between [0, 0] and entered point is -" + ANSI_RED);
        System.out.printf("%-20.3f" + ANSI_RESET, ob3.distance(ob1));
    }
}
