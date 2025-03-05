import java.util.Scanner;

public class Rectangle {
    static int area(int l, int b) {
        return l * b;
    }

    static int perimeter(int l, int b) {
        return (2 * (l + b));
    }

    public static void main(String args[]) {
        int l, b, a, p;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter length: ");
        l = s.nextInt();

        System.out.print("Enter Breadth: ");
        b = s.nextInt();

        a = area(l, b);
        p = perimeter(l, b);

        System.out.println("Area of Rectangle: " + a);
        System.out.println("Perimeter of Rectangle: " + p);

        s.close();
    }
}
