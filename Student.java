import java.util.Scanner;

public class Student {
    float m1, m2, m3, total;
    char grade;
    String name;
    int rollno;

    public static void main(String[] args) {
        Student std = new Student();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Name: ");
        std.name = s.nextLine();

        System.out.print("Enter Roll no: ");
        std.rollno = s.nextInt();

        System.out.print("Enter Mark1: ");
        std.m1 = s.nextFloat();

        System.out.print("Enter Mark2: ");
        std.m2 = s.nextFloat();

        System.out.print("Enter Mark3: ");
        std.m3 = s.nextFloat();

        std.total = std.m1 + std.m2 + std.m3;

        if (std.total > 90)
            std.grade = 'S';
        else if (std.total >= 75 && std.total < 90)
            std.grade = 'A';
        else if (std.total >= 60 && std.total < 75)
            std.grade = 'B';
        else if (std.total >= 45 && std.total < 60)
            std.grade = 'C';
        else
            std.grade = 'F';

        System.out.println("Name: " + std.name);
        System.out.println("Roll no: " + std.rollno);
        System.out.println("Mark1: " + std.m1);
        System.out.println("Mark2: " + std.m2);
        System.out.println("Mark3: " + std.m3);
        System.out.println("Total: " + std.total);
        System.out.println("Grade: " + std.grade);

        s.close();
    }
}
