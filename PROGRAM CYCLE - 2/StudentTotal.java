import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    float mark1, mark2, mark3;
}

class Total extends Student {
    float totalMarks;

    Total(String n, int r, float m1, float m2, float m3) {
        name = n;
        rollNo = r;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculateTotal() {
        totalMarks = mark1 + mark2 + mark3;
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class StudentTotal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = s.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = s.nextInt();

        System.out.print("Enter Mark1: ");
        float m1 = s.nextFloat();

        System.out.print("Enter Mark2: ");
        float m2 = s.nextFloat();

        System.out.print("Enter Mark3: ");
        float m3 = s.nextFloat();

        Total student = new Total(name, rollNo, m1, m2, m3);

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        student.calculateTotal();
    }
}
