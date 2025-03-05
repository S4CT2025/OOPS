import java.util.Scanner;

public class Area_Shape {
    static int area(int a) {
        return a * a;
    }

    static int area(int l, int b) {
        return l * b;
    }

    static double area(double pi, double r) {
        return (pi * r * r);
    }

    public static void main(String args[]) {
        int a, l, b, area_square, area_rectangle;
        double r, area_circle;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side of Square: ");
        a = s.nextInt();
        area_square = area(a);
        System.out.println("Area of Square: " + area_square);

        System.out.print("Enter Length: ");
        l = s.nextInt();
        System.out.print("Enter Breadth: ");
        b = s.nextInt();
        area_rectangle = area(l, b);
        System.out.println("Area of Rectangle: " + area_rectangle);

        System.out.print("Enter Radius: ");
        r = s.nextDouble();
        area_circle = area(3.14, r);
        System.out.println("Area of Circle: " + area_circle);

        s.close();
    }
}
