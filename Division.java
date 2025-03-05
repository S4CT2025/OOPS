import java.util.Scanner;

public class Division {
    int a, b;
    float c = 0;

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        Division div = new Division();

        System.out.print("Enter First Number: ");
        div.a = s.nextInt();
        System.out.print("Enter Second Number: ");
        div.b = s.nextInt();

        try {
            div.c = div.a / div.b;
        } catch (ArithmeticException error) {
            System.out.println("Can't divide by 0");
        }

        System.out.println("Result: " + div.c);
        s.close();
    }
}
