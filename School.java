import java.util.Scanner;

// Base class Student
class Student {
    String name;
    int rn;
    float mark1, mark2, mark3;
}

// Derived class Total inherits Student
class Total extends Student {
    float total;

    // Constructor to initialize values
    Total(String n, int r, float m1, float m2, float m3) {
        name = n;
        rn = r;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    // Method to calculate and display total marks
    void tot() {
        float t = mark1 + mark2 + mark3;
        System.out.println("Total Marks: " + t);
    }
}

// Main class
public class School {
    public static void main(String[] args) {
        String k;
        int r;
        float m, n, o;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        k = s.nextLine();
        System.out.print("Enter Roll No: ");
        r = s.nextInt();
        System.out.print("Enter Mark1: ");
        m = s.nextFloat();
        System.out.print("Enter Mark2: ");
        n = s.nextFloat();
        System.out.print("Enter Mark3: ");
        o = s.nextFloat();

        // Creating object of Total class
        Total t = new Total(k, r, m, n, o);

        System.out.println("Name: " + k);
        System.out.println("Roll No: " + r);
        t.tot();

        s.close();
    }
}
